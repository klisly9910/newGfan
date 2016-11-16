package com.newgfan.testcase;

import com.newgfan.elements.ComputerPageElments;
import com.newgfan.elements.pubElements;
import com.newgfan.pub.Driver;
import com.newgfan.pub.IsElementExist;
import com.newgfan.pub.SwitchToWindow;
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
 * Created by xiaohua on 11/15 0015.
 */
public class TestComputerPage {
    WebDriver back;
    WebDriver driver;
    String url = "http://pc.gfan.com/";
    By selector404 = By.xpath("html/body/div[3]/div[2]/h3[1]");
    By selector404notfound = By.linkText("404 Not Found");


    //     PhonePage page = PageFactory.initElements(driver, PhonePage.class);
    pubElements pubElements = PageFactory.initElements(driver, pubElements.class);

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

    @Test
    public void leftBoxs() {
        ComputerPageElments page = PageFactory.initElements(driver, ComputerPageElments.class);
        pubElements pubElements = PageFactory.initElements(driver, pubElements.class);
        System.out.println(page.computerBox.size());
        //点击第一个box的title
        String titleURL = page.firstTitle.getAttribute("href");
        page.firstTitle.click();
        SwitchToWindow.switchToWindow(driver);
        Assert.assertEquals(SwitchToWindow.window.getCurrentUrl().
                        substring(SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                titleURL.substring(titleURL.indexOf("//")));
//        try {
//            IsElementExist.doesWebElementExist(driver, selector404);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //点击相关阅读
        pubElements.aboutRead.click();
        SwitchToWindow.switchToWindow(driver);
        System.out.println("windowRead = " + SwitchToWindow.window.getCurrentUrl());
        driver.switchTo().window(SwitchToWindow.currentWindow);
        //点击机锋精选
        pubElements.jingxuanTitle.click();
        SwitchToWindow.switchToWindow(driver);
        System.out.println("windowJingxuan = " + SwitchToWindow.window.getCurrentUrl());
        driver.switchTo().window(SwitchToWindow.currentWindow);

    }

    @Test
    public void secondTitle() {
        ComputerPageElments page = PageFactory.initElements(driver, ComputerPageElments.class);
        pubElements pubElements = PageFactory.initElements(driver, pubElements.class);
        //secondTitle
        String secondTitleURL = page.secondTitle.getAttribute("href");
        page.secondTitle.click();
        SwitchToWindow.switchToWindow(driver);
        Assert.assertEquals(SwitchToWindow.window.getCurrentUrl().
                        substring(SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                secondTitleURL.substring(secondTitleURL.indexOf("//")));
//        try {
//            IsElementExist.doesWebElementExist(driver, selector404);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //点击相关阅读
        pubElements.aboutRead.click();
        SwitchToWindow.switchToWindow(driver);
        System.out.println("windowRead = " + SwitchToWindow.window.getCurrentUrl());
        driver.switchTo().window(SwitchToWindow.currentWindow);
        //点击机锋精选
        pubElements.jingxuanTitle.click();
        SwitchToWindow.switchToWindow(driver);
        System.out.println("windowJingxuan = " + SwitchToWindow.window.getCurrentUrl());
        driver.switchTo().window(SwitchToWindow.currentWindow);
    }

    @Test
    public void clssify() {
        ComputerPageElments page = PageFactory.initElements(driver, ComputerPageElments.class);
        pubElements pubElements = PageFactory.initElements(driver, pubElements.class);
        String clssifyOne = page.clssifyOne.getAttribute("href");
        page.clssifyOne.click();
        SwitchToWindow.switchToWindow(driver);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < pubElements.classifyJingxuan.size(); i++) {
            list.add(i, pubElements.classifyJingxuan.get(i).getAttribute("href"));
            String beURL = pubElements.classifyJingxuan.get(i).getAttribute("href");
            pubElements.classifyJingxuan.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            driver.switchTo().window(SwitchToWindow.currentWindow);

        }
        System.out.println("list urls :" + list);
        driver.switchTo().window(SwitchToWindow.currentWindow);

    }

    //图赏
    @Test
    public void tushang() {
        ComputerPageElments page = PageFactory.initElements(driver, ComputerPageElments.class);
        String leftURL = page.tushangLeft.getAttribute("href");
        page.tushangLeft.click();
        SwitchToWindow.switchToWindow(driver);
        Assert.assertEquals(SwitchToWindow.window.getCurrentUrl().
                        substring(SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                leftURL.substring(leftURL.indexOf("//")));
        try {
            IsElementExist.doesWebElementExist(driver, selector404);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.switchTo().window(SwitchToWindow.currentWindow);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < page.tushangRight.size(); i++) {
            list.add(i, page.tushangRight.get(i).getAttribute("href"));
            String rightURL = page.tushangRight.get(i).getAttribute("href");
            page.tushangRight.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            Assert.assertEquals(SwitchToWindow.window.getCurrentUrl().
                            substring(SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                    rightURL.substring(rightURL.indexOf("//")));
            try {
                IsElementExist.doesWebElementExist(driver, selector404);
            } catch (Exception e) {
                e.printStackTrace();
            }
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("list:" + list);
    }

    @Test
    public void tushangBelow() {
        ComputerPageElments page = PageFactory.initElements(driver, ComputerPageElments.class);
        ArrayList<String> list = new ArrayList<String>();
        Assert.assertEquals(page.tushangBelow.size(), 6);
        for (int i = 0; i < page.tushangBelow.size(); i++) {
            list.add(i, page.tushangBelow.get(i).getAttribute("data-id"));
//            for (int j = 0;j<page.tushangPics.size();i++){
//                String tushangPicURL = page.tushangPics.get(j).getAttribute("href");
//                page.tushangPics.get(j).click();
//                SwitchToWindow.switchToWindow(driver);
//                Assert.assertEquals(SwitchToWindow.window.getCurrentUrl().
//                                substring(SwitchToWindow.window.getCurrentUrl().indexOf("//")),
//                        tushangPicURL.substring(tushangPicURL.indexOf("//")));
//                driver.close();
//                driver.switchTo().window(SwitchToWindow.currentWindow);
//            }

        }
        System.out.println("tushang below list :" + list);
    }

    //机锋视点、导购、评测、专题
    @Test
    public void rightPic() throws Exception {
        ComputerPageElments page = PageFactory.initElements(driver, ComputerPageElments.class);
        pubElements pubElements = PageFactory.initElements(driver, com.newgfan.elements.pubElements.class);
        //机锋视点-点击第一张图片
        String shidianURL = page.jifengshidian.getAttribute("href");
        page.jifengshidian.click();
        SwitchToWindow.switchToWindow(driver);
        Assert.assertEquals(SwitchToWindow.window.getCurrentUrl().
                        substring(SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                shidianURL.substring(shidianURL.indexOf("//")));
        IsElementExist.doesWebElementExist(driver, selector404);
//        //点击相关阅读
//        String aboutReadURL = page.aboutRead.getAttribute("href");
//        page.aboutRead.click();
//        SwitchToWindow.switchToWindow(driver);
//        Assert.assertEquals(SwitchToWindow.window.getCurrentUrl().
//                        substring(SwitchToWindow.window.getCurrentUrl().indexOf("//")),
//                aboutReadURL.substring(aboutReadURL.indexOf("//")));
//        driver.switchTo().window(SwitchToWindow.currentWindow);
//        //机锋精选
//        String jingxuanURL = pubElements.jingxuanTitle.getAttribute("href");
//        pubElements.jingxuanTitle.click();
//        SwitchToWindow.switchToWindow(driver);
//        Assert.assertEquals(SwitchToWindow.window.getCurrentUrl().
//                        substring(SwitchToWindow.window.getCurrentUrl().indexOf("//")),
//                jingxuanURL.substring(jingxuanURL.indexOf("//")));
        //返回最顶级窗口
        driver.switchTo().window(SwitchToWindow.currentWindow);
        //机锋视点-更多
        String moreURL = page.shidianMore.getAttribute("href");
        page.shidianMore.click();
        SwitchToWindow.switchToWindow(driver);
        Assert.assertEquals(SwitchToWindow.window.getCurrentUrl().
                        substring(SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                moreURL.substring(moreURL.indexOf("//")));
        IsElementExist.doesWebElementExist(driver, selector404);
        //点击更多后进入页面的：机锋精选
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0;i<pubElements.classifyJingxuan.size();i++){
            list.add(i,pubElements.classifyJingxuan.get(i).getAttribute("href"));
            String beURL = pubElements.classifyJingxuan.get(i).getAttribute("href");
            pubElements.classifyJingxuan.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            Assert.assertEquals(SwitchToWindow.window.getCurrentUrl().
                            substring(SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                    beURL.substring(beURL.indexOf("//")));
            IsElementExist.doesWebElementExist(driver, selector404);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("jifengjingxuan title url :" + list);


    }
    @Test
    public void wenzhangpaihang(){
        ComputerPageElments page = PageFactory.initElements(driver,ComputerPageElments.class);
        ArrayList<String> list = new ArrayList<String>();
        for (int i =0;i<page.wenzhangpaihang.size();i++){
            list.add(i,page.wenzhangpaihang.get(i).getAttribute("href"));
            String wenzhangURL = page.wenzhangpaihang.get(i).getAttribute("href");
            page.wenzhangpaihang.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            Assert.assertEquals(SwitchToWindow.window.getCurrentUrl().
                            substring(SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                    wenzhangURL.substring(wenzhangURL.indexOf("//")));
            try {
                IsElementExist.doesWebElementExist(driver, selector404);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                IsElementExist.doesWebElementExist(driver,selector404notfound);
            } catch (Exception e) {
                e.printStackTrace();
            }
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("wenzhangpaihang title url :" + list);
    }

}
