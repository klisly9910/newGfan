package com.newgfan.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by xiaohua on 11/21 0021.
 */
public class Footer {
    WebDriver driver;

    public Footer(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "html/body/div[3]/div/div[1]/ul/li/a")
    public List<WebElement> footertop;
    @FindBy(xpath = "html/body/div[3]/div/div[2]/ul/li/a")
    public List<WebElement> friendlyurl;
    @FindBy(xpath = "html/body/div[3]/div/div[3]/p")
    public WebElement footerbtn;


}
