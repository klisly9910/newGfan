package com.newgfan.testcase;

import com.newgfan.elements.Media;
import com.newgfan.pub.Driver;
import com.newgfan.pub.IsElementExist;
import com.newgfan.pub.SwitchToWindow;
import org.apache.bcel.generic.DREM;
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
public class TestNewMedia {
    WebDriver driver;
    Media media;
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
        media = PageFactory.initElements(driver,Media.class);

    }
    @AfterMethod
    public void end(){
        driver.close();;
        driver.quit();
    }
    @Test
    public void leftbanner() throws Exception{
        ArrayList<String> list = new ArrayList<String>();
        for (int i =0;i<media.rightbanner.size();i++){
            list.add(i,media.rightbanner.get(i).getAttribute("hef"));
            media.rightbanner.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selectorerrormessage);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("media right url :" + list);

    }
    @Test
    public void newwenzhang() throws Exception{
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0;i<media.newwenzhang.size();i++){
            list.add(i,media.newwenzhang.get(i).getAttribute("href"));
            media.newwenzhang.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selectorerrormessage);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("new wenzhang :" + list);
    }
    @Test
    public void huodong() throws Exception{
        media.huodong.click();
        SwitchToWindow.switchToWindow(driver);
        IsElementExist.doesWebElementExist(driver,selector404);
        IsElementExist.doesWebElementExist(driver,selector404notfound);
        IsElementExist.doesWebElementExist(driver,selectorerrormessage);
        driver.switchTo().window(SwitchToWindow.currentWindow);
    }
    @Test
    public void wenzhangjingxuan() throws Exception{
        ArrayList<String> list = new ArrayList<String>();
        for (int i =0;i<media.wenzhangjingxuan.size();i++){
            list.add(i,media.wenzhangjingxuan.get(i).getAttribute("href"));
            media.wenzhangjingxuan.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selectorerrormessage);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("wenzhangjingxuan :"  + list);
    }
}
