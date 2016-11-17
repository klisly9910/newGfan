package com.newgfan.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by xiaohua on 11/17 0017.
 */
public class OfficeElements {
    WebDriver driver;

    public OfficeElements(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "html/body/div[3]/div[1]/div[1]/div/h2/a")
    public WebElement officeFirstTitle;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[1]/div[1]/ul/li[1]/a[2]")
    public WebElement officeSecondTitle;
    @FindBy(xpath = ".//*[@id='wnav03']/div[1]/div[2]/div[1]/div/div[1]/a[2]")
    public WebElement officezixunfirstpic;
}
