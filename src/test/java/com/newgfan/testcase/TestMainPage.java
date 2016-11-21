package com.newgfan.testcase;

import com.newgfan.elements.MainPageElements;
import com.newgfan.pub.Driver;
import com.newgfan.pub.IsElementExist;
import com.newgfan.pub.SwitchToWindow;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import com.sun.xml.internal.ws.server.DefaultResourceInjector;
import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;
import org.hamcrest.core.Is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiaohua on 11/14 0014.
 */
public class TestMainPage {
    WebDriver driver;
    MainPageElements mainPageElements;
    By selector404 = By.xpath("html/body/div[3]/div[2]/h3[1]");
    By selector404notfound = By.linkText("404 Not Found");
    By selectorerrormessage = By.linkText("您要查看的信息不存在或者还未通过审批！");

    @BeforeMethod
    public void init() {
        Driver.getDriver("chrome");
        driver = new ChromeDriver();
        driver.get("http://www.gfan.com/new/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        mainPageElements = PageFactory.initElements(driver,MainPageElements.class);


    }

    @AfterMethod
    public void close() {
        driver.close();
        driver.quit();
    }

    @Test
    public void firstTitle() throws Exception{
        String title = mainPageElements.fengTouTiao.getText();
        Assert.assertEquals(title, "锋头条");

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0;i<mainPageElements.firstTitle.size();i++){
            list.add(i,mainPageElements.firstTitle.get(i).getAttribute("href"));
            String titleURL = mainPageElements.firstTitle.get(i).getAttribute("href");
            mainPageElements.firstTitle.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            Assert.assertEquals(SwitchToWindow.window.getCurrentUrl().
                            substring(SwitchToWindow.window.getCurrentUrl().indexOf("//")),
                    titleURL.substring(titleURL.indexOf("//")));
            IsElementExist.doesWebElementExist(driver,selector404);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            driver.switchTo().window(SwitchToWindow.currentWindow);

        }
        System.out.println("title url :" + list);
    }
    @Test
    public void secondTitle() throws Exception{
        ArrayList<String> secondTitle = new ArrayList<String>();
        for (int i = 0;i<mainPageElements.secondTitle.size();i++){
            secondTitle.add(i,mainPageElements.secondTitle.get(i).getAttribute("href"));
//            String secondURL = mainPageElements.secondTitle.get(i).getAttribute("href");
            mainPageElements.secondTitle.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            driver.switchTo().window(SwitchToWindow.currentWindow);

        }
        System.out.println("second title url :" + secondTitle);
    }
    @Test
    public void leftbanner_below() throws Exception{
        ArrayList<String> leftbanner_below = new ArrayList<String>();
        for (int i = 0;i<mainPageElements.leftbanner_below.size();i++){
            leftbanner_below.add(i,mainPageElements.leftbanner_below.get(i).getText());
            mainPageElements.leftbanner_below.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            driver.switchTo().window(SwitchToWindow.currentWindow);

        }
        System.out.println("leftbanner_below :" + leftbanner_below);
    }
    @Test
    public void righthuodong() throws Exception{
        mainPageElements.righthuodong.click();
        SwitchToWindow.switchToWindow(driver);
        IsElementExist.doesWebElementExist(driver,selector404);
        IsElementExist.doesWebElementExist(driver,selector404notfound);
        driver.switchTo().window(SwitchToWindow.currentWindow);
    }
    @Test
    public void fengkuaixun() throws Exception{
        ArrayList<String> kuaixun = new ArrayList<String>();
        for (int i =0;i<mainPageElements.fengkuaixun.size();i++){
            kuaixun.add(i,mainPageElements.fengkuaixun.get(i).getAttribute("href"));
            mainPageElements.fengkuaixun.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
        }
        System.out.println("kuaixun :" + kuaixun);
    }
    @Test
    public void fengzhuanti() throws Exception{
        ArrayList<String> fengzhuanti = new ArrayList<String>();
        for (int i =0;i<mainPageElements.fengzhunti.size();i++){
            fengzhuanti.add(i,mainPageElements.fengzhunti.get(i).getAttribute("href"));
            mainPageElements.fengzhunti.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
        }
        System.out.println("fengzhuanti :" + fengzhuanti);
    }
    @Test
    public void fengtushang() throws Exception{
        mainPageElements.fengtushang.click();
        SwitchToWindow.switchToWindow(driver);
        IsElementExist.doesWebElementExist(driver,selector404);
        IsElementExist.doesWebElementExist(driver,selector404notfound);
        driver.switchTo().window(SwitchToWindow.currentWindow);
        ArrayList<String> tushangright = new ArrayList<String>();
        for (int i = 0;i<mainPageElements.tushangright.size();i++){
            tushangright.add(i,mainPageElements.tushangright.get(i).getAttribute("href"));
            mainPageElements.tushangright.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("tushang right :" + tushangright);
        ArrayList<String> tushangbelow = new ArrayList<String>();
        for (int i = 0;i<mainPageElements.fengtushangbelow.size();i++){
            tushangbelow.add(i,mainPageElements.fengtushangbelow.get(i).getAttribute("href"));
            mainPageElements.fengtushangbelow.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("tushang below :" + tushangbelow);
    }
    @Test
    public void fengkandian() throws Exception{
        mainPageElements.fengkandian.click();
        SwitchToWindow.switchToWindow(driver);
        IsElementExist.doesWebElementExist(driver,selector404);
        IsElementExist.doesWebElementExist(driver,selector404notfound);
        driver.switchTo().window(SwitchToWindow.currentWindow);
        ArrayList<String> rightpics = new ArrayList<String>();
        for (int i = 0;i<mainPageElements.fengkandianrightpic.size();i++){
            rightpics.add(i,mainPageElements.fengkandianrightpic.get(i).getAttribute("href"));
            mainPageElements.fengkandianrightpic.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selectorerrormessage);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("fengkandian right pic :" + rightpics);


    }
    @Test
    public void game_yingyong() throws Exception{
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0;i<mainPageElements.game_yingyong.size();i++){
            list.add(i,mainPageElements.game_yingyong.get(i).getAttribute("href"));
            mainPageElements.game_yingyong.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selectorerrormessage);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selector404);
            driver.switchTo().window(SwitchToWindow.currentWindow);

        }
        System.out.println("game_yingyong list :" + list);
    }
    @Test
    public void game_yingyongpic() throws Exception{
        mainPageElements.game_yingyongleft.click();
        SwitchToWindow.switchToWindow(driver);
        IsElementExist.doesWebElementExist(driver,selectorerrormessage);
        IsElementExist.doesWebElementExist(driver,selector404notfound);
        IsElementExist.doesWebElementExist(driver,selector404);
        driver.switchTo().window(SwitchToWindow.currentWindow);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0;i<mainPageElements.game_yingyongright.size();i++){
            list.add(i,mainPageElements.game_yingyongright.get(i).getAttribute("href"));
            mainPageElements.game_yingyongright.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selectorerrormessage);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selector404);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("game_yingyongpic list right url :" + list);


    }
    @Test
    public void game_yingyongbelow() throws Exception{
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0;i<mainPageElements.game_yingyongbelow.size();i++){
            list.add(i,mainPageElements.fengtushangbelow.get(i).getAttribute("href"));
            mainPageElements.fengtushangbelow.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selectorerrormessage);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selector404);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("game_yingyongbelow list :" + list);

    }
    @Test
    public void bbsNav() throws Exception{
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0;i<mainPageElements.bbsNav.size();i++){
            list.add(i,mainPageElements.bbsNav.get(i).getAttribute("href"));
            mainPageElements.bbsNav.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selectorerrormessage);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selector404);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("bbsNav:" + list);
    }
    @Test
    public void bbspics() throws Exception{
        ArrayList<String> list = new ArrayList<String>();
        for (int i =0;i<mainPageElements.bbspics.size();i++){
            list.add(i,mainPageElements.bbspics.get(i).getAttribute("href"));
            mainPageElements.bbspics.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selectorerrormessage);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selector404);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("bbs pics :" + list);
    }


}
