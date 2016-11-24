package com.newgfan.testcase;

import com.newgfan.elements.Footer;
import com.newgfan.pub.Driver;
import com.newgfan.pub.ScreenShot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by xiaohua on 11/23 0023.
 */
public class Testoutput {
    WebDriver driver;
    @BeforeMethod
    public void init(){
        Driver.getDriver("chrome");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void end(){
        driver.close();;
        driver.quit();
    }
    @Test
    public void testbaidu(){
        driver.get("http://www.baidu.com");
        driver.findElement(By.id("kw")).sendKeys("selenium");
        driver.findElement(By.id("su")).click();

    }
}
