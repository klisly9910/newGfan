package com.newgfan.pumethod;

import com.newgfan.elements.SmartPageElements;
import com.newgfan.elements.pubElements;
import com.newgfan.pub.IsElementExist;
import com.newgfan.pub.SwitchToWindow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;

import static com.newgfan.pub.SwitchToWindow.driver;

/**
 * Created by xiaohua on 11/16 0016.
 */
public class WenZhangJingXuan {

    public WenZhangJingXuan(WebDriver driver) {
        this.driver = driver;
    }


    WebDriver back;
    WebDriver driver;
    By selector404 = By.xpath("html/body/div[3]/div[2]/h3[1]");
    By selector404notfound = By.linkText("404 Not Found");
    public void wenzhangpaihang(){
        pubElements page = PageFactory.initElements(driver,pubElements.class);
        ArrayList<String> list = new ArrayList<String>();
        for (int i =0;i<page.wenzhangpaihang.size();i++){
            list.add(i,page.wenzhangpaihang.get(i).getAttribute("href"));
            String wenzhangURL = page.wenzhangpaihang.get(i).getAttribute("href");
            page.wenzhangpaihang.get(i).click();
        SwitchToWindow.switchToWindow(driver);
//        Assert.assertEquals(SwitchToWindow.window.getCurrentUrl().
//                        substring(SwitchToWindow.window.getCurrentUrl().indexOf("//")),
//                wenzhangURL.substring(wenzhangURL.indexOf("//")));
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
