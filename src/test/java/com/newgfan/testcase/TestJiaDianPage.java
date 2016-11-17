package com.newgfan.testcase;

import com.newgfan.elements.JiaDianElements;
import com.newgfan.pub.Driver;
import com.newgfan.pumethod.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by xiaohua on 11/17 0017.
 */
public class TestJiaDianPage {
    WebDriver driver;
    WenZhangJingXuan wenZhangJingXuan;
    JiaDianElements jiaDianElements;
    FirstTitle firstTitle;
    SecondTitle secondTitle;
    tushangLeft tushangLeft;
    tushangRight tushangright;
    tushangBelowNav tushangBelowNav;
    JiaDIanzixun jiaDIanzixunzixun;
    jifengshidian jifengshidian;
    String url = "http://jiadian.gfan.com/";
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
        firstTitle = new FirstTitle(driver);
        secondTitle = new SecondTitle(driver);
        tushangLeft = new tushangLeft(driver);
        tushangright = new tushangRight(driver);
        tushangBelowNav = new tushangBelowNav(driver);
        jiaDIanzixunzixun = new JiaDIanzixun(driver);
        jifengshidian = new jifengshidian(driver);

    }

    @AfterMethod
    public void close() {
        driver.close();
        driver.quit();
    }
    @Test
    public void firstTitle() throws  Exception{
        firstTitle.firstTitle();
    }
    @Test
    public void secondTitle() throws Exception{
        secondTitle.secondTitle();
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
        jiaDIanzixunzixun.jiadianZixun();
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
