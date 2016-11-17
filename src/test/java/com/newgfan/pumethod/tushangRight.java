package com.newgfan.pumethod;

import com.newgfan.elements.pubElements;
import com.newgfan.pub.IsElementExist;
import com.newgfan.pub.SwitchToWindow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

/**
 * Created by xiaohua on 11/17 0017.
 */
public class tushangRight {
    WebDriver driver;
    By selector404 = By.xpath("html/body/div[3]/div[2]/h3[1]");
    By selector404notfound = By.linkText("404 Not Found");

    public tushangRight(WebDriver driver) {
        this.driver = driver;
    }
    public void tushangRight() throws Exception {
        pubElements pubElements  = PageFactory.initElements(driver,pubElements.class);

        ArrayList<String> tushangright = new ArrayList<String>();
        for (int i = 0;i<pubElements.tushangRight.size();i++){
            tushangright.add(i,pubElements.tushangRight.get(i).getAttribute("href"));
            pubElements.tushangRight.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selector404);
            driver.switchTo().window(SwitchToWindow.currentWindow);

        }
        System.out.println("tushangright :" + tushangright);

    }

}
