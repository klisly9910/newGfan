package com.newgfan.testcase;

import com.newgfan.elements.SmartPageElements;
import com.newgfan.pub.Driver;
import com.newgfan.pub.IsElementExist;
import com.newgfan.pub.SwitchToWindow;
import com.newgfan.pumethod.WenZhangJingXuan;
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
        page = PageFactory.initElements(driver,SmartPageElements.class);

    }

    @AfterMethod
    public void close() {
        driver.close();
        driver.quit();
    }
    @Test
    public void firstTitle() throws Exception {
        page.firstTitle.click();
        SwitchToWindow.switchToWindow(driver);
        //相关阅读-跳转是否正确
        page.aboutRead.click();
        SwitchToWindow.switchToWindow(driver);
        IsElementExist.doesWebElementExist(driver,selector404);
        IsElementExist.doesWebElementExist(driver,selector404notfound);

    }
    @Test
    public void secondTitle() throws Exception {
        page.secondTitle.click();
        SwitchToWindow.switchToWindow(driver);
        //机锋精选
        ArrayList<String> jingxuan = new ArrayList<String>();
        for (int i = 0;i<page.jifengjingxuan.size();i++){
            jingxuan.add(i,page.jifengjingxuan.get(i).getAttribute("href"));
            String jingxuanURL = page.jifengjingxuan.get(i).getAttribute("href");
            page.jifengjingxuan.get(i).click();
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selector404);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("jingxuan list:" + jingxuan);

    }
    @Test
    public void tushangLeft() throws Exception {
        page.tushangLeft.click();
        SwitchToWindow.switchToWindow(driver);
        IsElementExist.doesWebElementExist(driver,selector404notfound);
        IsElementExist.doesWebElementExist(driver,selector404);

    }
    @Test
    public void tushangRight() throws Exception {
        ArrayList<String> tushangright = new ArrayList<String>();
        for (int i = 0;i<page.tushangRight.size();i++){
            tushangright.add(i,page.tushangRight.get(i).getAttribute("href"));
            page.tushangRight.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selector404);
            driver.switchTo().window(SwitchToWindow.currentWindow);

        }
        System.out.println("tushangright :" + tushangright);

    }
    @Test
    public void tushangBelowNav() throws Exception {
        ArrayList<String> tushangbelow = new ArrayList<String>();
        for (int i = 0;i<page.tushangBelow_Nav.size();i++){
            tushangbelow.add(i,page.tushangBelow_Nav.get(i).getAttribute("data-id"));
            page.tushangBelow_Nav.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selector404);
            driver.switchTo().window(SwitchToWindow.currentWindow);

        }
        System.out.println("tushang below nav :" + tushangbelow);
    }
    @Test
    public void zixun() throws Exception {
        page.zixunfirstpic.click();;
        SwitchToWindow.switchToWindow(driver);
        IsElementExist.doesWebElementExist(driver,selector404notfound);
        IsElementExist.doesWebElementExist(driver,selector404);


    }
    @Test
    public void loadmore() throws Exception {
        Assert.assertEquals(true,page.loadmore.isEnabled());
    }
    @Test
    public void jifengshidian() throws Exception {
        page.jifengshidian_pic.click();
        SwitchToWindow.switchToWindow(driver);
        IsElementExist.doesWebElementExist(driver,selector404notfound);
        IsElementExist.doesWebElementExist(driver,selector404);
        //点击机锋视点右侧【更多】
        driver.switchTo().window(SwitchToWindow.currentWindow);
        page.jifengshidian_more.click();
        IsElementExist.doesWebElementExist(driver,selector404notfound);
        IsElementExist.doesWebElementExist(driver,selector404);

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
    public void wenzhangpaihang(){
        wenZhangJingXuan.wenzhangpaihang();
    }


}
