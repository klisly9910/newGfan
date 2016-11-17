package com.newgfan.testcase;

import com.newgfan.elements.JiaDianElements;
import com.newgfan.pub.Driver;
import com.newgfan.pumethod.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by xiaohua on 11/17 0017.
 */
public class TestOfficePage {
    WebDriver driver;
    WenZhangJingXuan wenZhangJingXuan;
    JiaDianElements jiaDianElements;
    OfficeFirstTitle officeFirstTitle;
    OfficeSecondTitle officeSecondTitle;
    com.newgfan.pumethod.tushangLeft tushangLeft;
    tushangRight tushangright;
    tushangBelowNav tushangBelowNav;
    Officezixun officezixun;
    jifengshidian jifengshidian;
    String url = "http://office.gfan.com/";
    By selector404 = By.xpath("html/body/div[3]/div[2]/h3[1]");
    By selector404notfound = By.linkText("404 Not Found");
    @BeforeMethod
    public void init() {
        Driver.getDriver("chrome");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wenZhangJingXuan = new WenZhangJingXuan(driver);
        jiaDianElements = PageFactory.initElements(driver,JiaDianElements.class);
        officeFirstTitle = new OfficeFirstTitle(driver);
        officeSecondTitle = new OfficeSecondTitle(driver);
        tushangLeft = new tushangLeft(driver);
        tushangright = new tushangRight(driver);
        tushangBelowNav = new tushangBelowNav(driver);
        officezixun = new Officezixun(driver);
        jifengshidian = new jifengshidian(driver);

    }

    @AfterMethod
    public void close() {
        driver.close();
        driver.quit();
    }
    @Test
    public void firstTitle() throws  Exception{
        officeFirstTitle.officefirstTitle();
    }
    @Test
    public void secondTitle() throws Exception{
        officeSecondTitle.secondTitle();
    }
    @Test
    public void tushangLeft() throws Exception{
        tushangLeft.tushangLeft();
    }
    @Test
    public void tushangRight() throws Exception{
        tushangright.tushangRight();
    }
    @Test
    public void tushangBelowNav() throws Exception{
        tushangBelowNav.tushangBelowNav();
    }
    @Test
    public void zixun() throws Exception{
        officezixun.officezixun();
    }
    @Test
    public void jifengshidian() throws Exception{
        jifengshidian.jifengshidian();
    }
    @Test
    public void wenzhangpaihang(){
        wenZhangJingXuan.wenzhangpaihang();
    }
}
