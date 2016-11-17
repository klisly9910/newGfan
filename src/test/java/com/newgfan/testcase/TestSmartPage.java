package com.newgfan.testcase;

import com.newgfan.elements.SmartPageElements;
import com.newgfan.pub.Driver;
import com.newgfan.pub.IsElementExist;
import com.newgfan.pub.SwitchToWindow;
import com.newgfan.pumethod.*;
import com.sun.xml.internal.ws.server.DefaultResourceInjector;
import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiaohua on 11/16 0016.
 */
public class TestSmartPage {
    WebDriver back;
    WebDriver driver;
    SmartPageElements page;
    WenZhangJingXuan wenZhangJingXuan;
    FirstTitle firstTitle;
    SecondTitle secondTitle;
    tushangLeft tushangLeft;
    tushangRight tushangRight;
    tushangBelowNav tushangBelowNav;
    smartzixun smartzixun;
    jifengshidian jifengshidian;
    String url = "http://smart.gfan.com/";
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
        page = PageFactory.initElements(driver, SmartPageElements.class);
        firstTitle = new FirstTitle(driver);
        secondTitle = new SecondTitle(driver);
        tushangLeft = new tushangLeft(driver);
        tushangRight = new tushangRight(driver);
        tushangBelowNav = new tushangBelowNav(driver);
        smartzixun = new smartzixun(driver);
        jifengshidian = new jifengshidian(driver);

    }

    @AfterMethod
    public void close() {
        driver.close();
        driver.quit();
    }

    @Test
    public void firstTitle() throws Exception {
        firstTitle.firstTitle();

    }

    @Test
    public void secondTitle() throws Exception {
        secondTitle.secondTitle();

    }

    @Test
    public void tushangLeft() throws Exception {
        tushangLeft.tushangLeft();

    }

    @Test
    public void tushangRight() throws Exception {
        tushangRight.tushangRight();

    }

    @Test
    public void tushangBelowNav() throws Exception {
        tushangBelowNav.tushangBelowNav();
    }

    @Test
    public void zixun() throws Exception {
        smartzixun.smartZixun();


    }

    @Test
    public void loadmore() throws Exception {
        Assert.assertEquals(true, page.loadmore.isEnabled());
    }

    @Test
    public void jifengshidian() throws Exception {
        jifengshidian.jifengshidian();

        //点击【更多】跳转后的 机锋精选
//        ArrayList<String> jingxuan = new ArrayList<String>();
//        for (int i = 0;i<page.more_jifengjingxuan.size();i++){
//            jingxuan.add(i,page.more_jifengjingxuan.get(i).getAttribute("href"));
//            page.more_jifengjingxuan.get(i).click();
//            SwitchToWindow.switchToWindow(driver);
//            IsElementExist.doesWebElementExist(driver,selector404notfound);
//            IsElementExist.doesWebElementExist(driver,selector404);
//            driver.switchTo().window(SwitchToWindow.currentWindow);
//        }
//        System.out.println("jingxuan :" + jingxuan);

    }

    @Test
    public void wenzhangpaihang() {
        wenZhangJingXuan.wenzhangpaihang();
    }


}
