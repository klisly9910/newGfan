package com.newgfan.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by xiaohua on 11/21 0021.
 */
public class TopNavgation {
    WebDriver driver;

    public TopNavgation(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "html/body/div[1]/div/a")
    public WebElement gfanlogo;
    @FindBy(xpath = "html/body/div[1]/div/ul/li/a")
    public List<WebElement> topnav;

}
