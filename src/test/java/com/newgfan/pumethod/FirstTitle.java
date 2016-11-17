package com.newgfan.pumethod;

import com.newgfan.elements.JiaDianElements;
import com.newgfan.elements.pubElements;
import com.newgfan.pub.IsElementExist;
import com.newgfan.pub.SwitchToWindow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by xiaohua on 11/17 0017.
 */
public class FirstTitle {
    WebDriver driver;
    By selector404 = By.xpath("html/body/div[3]/div[2]/h3[1]");
    By selector404notfound = By.linkText("404 Not Found");


    public FirstTitle(WebDriver driver) {
        this.driver = driver;
    }
    public void firstTitle() throws Exception {
        pubElements pubElements  = PageFactory.initElements(driver,pubElements.class);
        pubElements.firstTitle.click();
        SwitchToWindow.switchToWindow(driver);
        //相关阅读-跳转是否正确
        pubElements.aboutRead.click();
        SwitchToWindow.switchToWindow(driver);
        IsElementExist.doesWebElementExist(driver,selector404);
        IsElementExist.doesWebElementExist(driver,selector404notfound);

    }
}
