package com.newgfan.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by xiaohua on 11/17 0017.
 */
public class JiaDianElements {
    WebDriver driver;

    public JiaDianElements(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = ".//*[@id='enav03']/div[1]/div[2]/div[1]/div/div[1]/a[2]")
    public WebElement jiadianzixunfirstpic;
}
