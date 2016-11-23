package com.newgfan.testcase;

import com.newgfan.elements.Media;
import com.newgfan.elements.TopNavgation;
import com.newgfan.pub.Driver;
import com.newgfan.pub.IsElementExist;
import com.newgfan.pub.SwitchToWindow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiaohua on 11/21 0021.
 */
public class TestTopNavgation {
    WebDriver driver;
    TopNavgation topNavgation;
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
        topNavgation = PageFactory.initElements(driver,TopNavgation.class);

    }
    @AfterMethod
    public void end(){
        driver.close();;
        driver.quit();
    }
    @Test
    public void topnavgation() throws Exception{
//        topNavgation.gfanlogo.click();
//        SwitchToWindow.switchToWindow(driver);
//        IsElementExist.doesWebElementExist(driver,selector404);
//        IsElementExist.doesWebElementExist(driver,selector404notfound);
//        IsElementExist.doesWebElementExist(driver,selectorerrormessage);
//        driver.switchTo().window(SwitchToWindow.currentWindow);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0;i<topNavgation.topnav.size();i++){
            list.add(i,topNavgation.topnav.get(i).getAttribute("href"));
            topNavgation.topnav.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selectorerrormessage);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("top navagation :" + list);

    }

}
