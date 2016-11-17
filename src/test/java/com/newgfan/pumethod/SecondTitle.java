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
public class SecondTitle {
    WebDriver driver;
    By selector404 = By.xpath("html/body/div[3]/div[2]/h3[1]");
    By selector404notfound = By.linkText("404 Not Found");

    public SecondTitle(WebDriver driver) {
        this.driver = driver;
    }
    public void secondTitle() throws  Exception{
        pubElements pubElements  = PageFactory.initElements(driver,pubElements.class);
        pubElements.secondTitle.click();
        SwitchToWindow.switchToWindow(driver);
        //机锋精选
        ArrayList<String> jingxuan = new ArrayList<String>();
        for (int i = 0;i<pubElements.jifengjingxuan.size();i++){
            jingxuan.add(i,pubElements.jifengjingxuan.get(i).getAttribute("href"));
            String jingxuanURL = pubElements.jifengjingxuan.get(i).getAttribute("href");
            pubElements.jifengjingxuan.get(i).click();
            IsElementExist.doesWebElementExist(driver,selector404notfound);
            IsElementExist.doesWebElementExist(driver,selector404);
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
        System.out.println("jingxuan list:" + jingxuan);
    }
}
