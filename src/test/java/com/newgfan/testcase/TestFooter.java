package com.newgfan.testcase;

import com.newgfan.elements.Footer;
import com.newgfan.elements.TopNavgation;
import com.newgfan.pub.Driver;
import com.newgfan.pub.IsElementExist;
import com.newgfan.pub.ScreenShot;
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
 * Created by xiaohua on 11/21 0021.
 */
public class TestFooter {
    WebDriver driver;
    Footer footer;
    ScreenShot screenShot;
    By selector404 = By.xpath("html/body/div[3]/div[2]/h3[1]");
    By selector404notfound = By.linkText("404 Not Found");
    By selectorerrormessage = By.linkText("您要查看的信息不存在或者还未通过审批！");

    @BeforeMethod
    public void init(){
        Driver.getDriver("chrome");
        driver = new ChromeDriver();
        driver.get("http://wemedia.gfan.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        footer = PageFactory.initElements(driver,Footer.class);
        screenShot = new ScreenShot(driver);

    }
    @AfterMethod
    public void end(){
        driver.close();;
        driver.quit();
    }
    @Test
    public void footertop() throws Exception{
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0;i<footer.footertop.size();i++){
            list.add(i,footer.footertop.get(i).getAttribute("href"));
            footer.footertop.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selectorerrormessage);
            screenShot.takeScreenshot(driver);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("footer top url :" + list);
    }
    @Test
    public void friendly() throws Exception{
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0;i<footer.friendlyurl.size();i++){
            list.add(i,footer.friendlyurl.get(i).getAttribute("href"));
            footer.friendlyurl.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selectorerrormessage);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("footer friendly url :" + list);
    }
    @Test
    public void footerbtn(){
        String text = footer.footerbtn.getText();
        Assert.assertEquals(text,"京公网安备11010802020450号 | 京网文 【2015】 0397-177号 | 京ICP证150677号 | 北京机锋科技有限公司");
    }

}
