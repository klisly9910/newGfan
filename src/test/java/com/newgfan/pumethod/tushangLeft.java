package com.newgfan.pumethod;

import com.newgfan.elements.pubElements;
import com.newgfan.pub.IsElementExist;
import com.newgfan.pub.SwitchToWindow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by xiaohua on 11/17 0017.
 */
public class tushangLeft {
    WebDriver driver;
    By selector404 = By.xpath("html/body/div[3]/div[2]/h3[1]");
    By selector404notfound = By.linkText("404 Not Found");

    public tushangLeft(WebDriver driver) {
        this.driver = driver;
    }
    @Test
    public void tushangLeft() throws Exception {
        pubElements pubElements  = PageFactory.initElements(driver,pubElements.class);
        pubElements.tushangLeft.click();
        SwitchToWindow.switchToWindow(driver);
        IsElementExist.doesWebElementExist(driver,selector404notfound);
        IsElementExist.doesWebElementExist(driver,selector404);

    }
}
