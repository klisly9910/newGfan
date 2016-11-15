package com.newgfan.testcase;

import com.newgfan.elements.PhonePageElements;
import com.newgfan.pub.Driver;
import com.newgfan.pub.SwitchToWindow;
import com.sun.xml.internal.ws.policy.AssertionSet;
import com.sun.xml.internal.ws.server.DefaultResourceInjector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiaohua on 11/14 0014.
 */
public class TestPhonePage {
    WebDriver back;
    WebDriver driver;
    String url = "http://phone.gfan.com";


    // PhonePage page = PageFactory.initElements(driver, PhonePage.class);

    @BeforeMethod
    public void init() {
        Driver.getDriver("chrome");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void close() {
        driver.close();
        driver.quit();
    }

    @Test(enabled = true)
    public void clickLogoImage() {
        // PhonePage page = new PhonePage(driver);
        PhonePageElements page = PageFactory.initElements(driver, PhonePageElements.class);
        Assert.assertEquals("手机头条", page.phoneTitle.getText());
        page.logoImag.click();

    }

    @Test(enabled = true)
    public void getPhoneBoxs() {
        PhonePageElements page = PageFactory.initElements(driver, PhonePageElements.class);
        Assert.assertEquals(page.phoneBoxs.size(), 3);
        System.out.println(page.phoneBoxs.size());
    }

    @Test(enabled = true)
    public void clickFirstTitle() {
        PhonePageElements page = PageFactory.initElements(driver, PhonePageElements.class);
        List<String> titleTex = new ArrayList<String>();
        for (int i = 0; i < page.phoneBoxs.size(); i++) {
            for (int j = 0; j < page.phoneFirstTitle.size(); j++) {
                titleTex.add(page.phoneFirstTitle.get(j).getText());
                String parentURL = page.phoneFirstTitle.get(j).getAttribute(
                        "href");
                page.phoneFirstTitle.get(j).click();
                SwitchToWindow.switchToWindow(driver);
                Assert.assertEquals(
                        SwitchToWindow.window.getCurrentUrl().substring(
                                SwitchToWindow.window.getCurrentUrl().indexOf(
                                        "//")),
                        parentURL.substring(parentURL.indexOf("//")));
                Assert.assertEquals(true, page.footerGfanLogo.isDisplayed());
                driver.close();
                // driver.navigate().back();
                back = driver.switchTo().window(SwitchToWindow.currentWindow);

            }

        }
    }

    @Test(enabled = true)
    public void clickClassify() {
        PhonePageElements page = PageFactory.initElements(driver, PhonePageElements.class);
        String beforeURL01 = page.classify01.getAttribute("href");
        page.classify01.click();
        SwitchToWindow.switchToWindow(driver);
        Assert.assertEquals(
                SwitchToWindow.window.getCurrentUrl().substring(
                        SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                beforeURL01.substring(beforeURL01.indexOf("//")));
        Assert.assertEquals(true, page.classifyLogo.isDisplayed());
        driver.close();
        back = driver.switchTo().window(SwitchToWindow.currentWindow);

        String beforeURL02 = page.classify02.getAttribute("href");
        page.classify02.click();
        SwitchToWindow.switchToWindow(driver);
        Assert.assertEquals(
                SwitchToWindow.window.getCurrentUrl().substring(
                        SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                beforeURL02.substring(beforeURL02.indexOf("//")));
        Assert.assertEquals(true, page.classifyLogo.isDisplayed());

        driver.close();
        back = driver.switchTo().window(SwitchToWindow.currentWindow);

        String beforeURL03 = page.classify03.getAttribute("href");
        page.classify03.click();
        SwitchToWindow.switchToWindow(driver);
        Assert.assertEquals(
                SwitchToWindow.window.getCurrentUrl().substring(
                        SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                beforeURL03.substring(beforeURL03.indexOf("//")));
        Assert.assertEquals(true, page.classifyLogo.isDisplayed());

    }

    //验证点击进入二级页面-二级页面再次点击
    @Test
    public void secondTitle() throws InterruptedException {
        PhonePageElements page = PageFactory.initElements(driver, PhonePageElements.class);
        page.secondTitle01.click();
        SwitchToWindow.switchToWindow(driver);
//        Assert.assertEquals(true, page.switchLogo.isDisplayed());

        page.aboutRead.click();
        SwitchToWindow.switchToWindow(driver);
        Assert.assertEquals(true, page.getFootLogo.isDisplayed());
        page.jingxuanTitle.click();
        SwitchToWindow.switchToWindow(driver);
//        Assert.assertEquals(true,page.getFootLogo.isDisplayed());

        page.changyanText.clear();
        page.changyanText.sendKeys("测试畅言登录");
        page.changyanButn.click();
        Thread.sleep(5000);
        driver.navigate().refresh();

    }

    @Test(enabled = true)
    public void information() {
        PhonePageElements page = PageFactory.initElements(driver, PhonePageElements.class);
        System.out.println("information box =" + page.information.size());
        for (int i = 0; i < page.information.size(); i++) {
            String beUrl = page.information.get(i).getAttribute("href");
            System.out.println("beurl = " + i + ":" + beUrl);
            page.information.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            Assert.assertEquals(
                    SwitchToWindow.window.getCurrentUrl().substring(
                            SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                    beUrl.substring(beUrl.indexOf("//")));
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
    }

    @Test(enabled = true)
    public void evaluate() {
        PhonePageElements page = PageFactory.initElements(driver, PhonePageElements.class);
        System.out.println("evaluate box =" + page.evaluate.size());
        for (int i = 0; i < 4; i++) {
            String beURL = page.evaluate.get(i).getAttribute("href");
            System.out.println("beURL = " + i + ":" + beURL);
            page.evaluate.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            Assert.assertEquals(
                    SwitchToWindow.window.getCurrentUrl().substring(
                            SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                    beURL.substring(beURL.indexOf("//")));
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }

    }

    @Test
    public void evluateBelow() throws InterruptedException {
        PhonePageElements page = PageFactory.initElements(driver, PhonePageElements.class);
        System.out.println("navtop size:" + page.navtop.size());
        for (int i = 0; i < page.navtop.size(); i++) {
            String navText = page.navtop.get(i).getText();
            System.out.println("navText = " + i + ":" + navText);
            //遍历每个栏目下的pic
//            page.navtop.get(i).click();
//            for(int j = 0;j<page.pic.size();j++){
//                String beURL = page.pic.get(i).getAttribute("href");
//                System.out.println("beURL = " + i + ":" + beURL);
//                page.pic.get(i).click();
//                SwitchToWindow.switchToWindow(driver);
//                Assert.assertEquals(
//                        SwitchToWindow.window.getCurrentUrl().substring(
//                                SwitchToWindow.window.getCurrentUrl().indexOf("//")),
//                        beURL.substring(beURL.indexOf("//")));
//                driver.switchTo().window(SwitchToWindow.currentWindow);
//
//            }
        }
        String beURL = page.picOne.getAttribute("href");
        page.picOne.click();
        SwitchToWindow.switchToWindow(driver);
        Thread.sleep(3000);
        System.out.println("windowURL = " + SwitchToWindow.window.getCurrentUrl());
        Assert.assertEquals(
                SwitchToWindow.window.getCurrentUrl().substring(
                        SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                beURL.substring(beURL.indexOf("//")));

        //跳转到第二个页面点击相关阅读
        String secondURlAboutRead = page.secondPageAboutRead.getAttribute("href");
        System.out.println("secondURLAboutRead = " + secondURlAboutRead);
        page.secondPageAboutRead.click();
        SwitchToWindow.switchToWindow(driver);
//        String text = page.footTex.getText();
//        Assert.assertEquals(true,text.contains("北京机锋科技有限公司"));
        driver.switchTo().window(SwitchToWindow.currentWindow);
        //返回currentWindow，点击机锋精选第一个标题
        String jingxuanTex = page.jingxuanTitle.getAttribute("href");
        System.out.println("jingxuan url = " + jingxuanTex);
        page.jingxuanTitle.click();
        SwitchToWindow.switchToWindow(driver);
//        Assert.assertEquals(true,text.contains("北京机锋科技有限公司"));
        driver.switchTo().window(SwitchToWindow.currentWindow);


    }

    @Test
    public void tuShang() {
        PhonePageElements page = PageFactory.initElements(driver, PhonePageElements.class);
        String leftURL = page.leftPic.getAttribute("href");
        page.leftPic.click();
        SwitchToWindow.switchToWindow(driver);
        Assert.assertEquals(
                SwitchToWindow.window.getCurrentUrl().substring(
                        SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                leftURL.substring(leftURL.indexOf("//")));
        driver.switchTo().window(SwitchToWindow.currentWindow);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < page.rightPic.size(); i++) {
            list.add(i, page.rightPic.get(i).getAttribute("href"));
            String beURL = page.rightPic.get(i).getAttribute("href");
            page.rightPic.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            Assert.assertEquals(
                    SwitchToWindow.window.getCurrentUrl().substring(
                            SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                    beURL.substring(leftURL.indexOf("//")));
            driver.switchTo().window(SwitchToWindow.currentWindow);

        }
        System.out.println("right pics = " + list);
    }
    //遍历【手机排行】并点击
    @Test
    public void phoneSort(){
        PhonePageElements page =  PageFactory.initElements(driver,PhonePageElements.class);
        Assert.assertEquals(page.phoneSort.size(),10);
        ArrayList<String> titles = new ArrayList<String>();
        for (int i = 0;i<page.sortTitles.size();i++){
            titles.add(i,page.sortTitles.get(i).getAttribute("href"));
            String beURL  = page.sortTitles.get(i).getAttribute("href");
            page.sortTitles.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("titles :" + titles);
    }


}
