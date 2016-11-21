package com.newgfan.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by xiaohua on 11/21 0021.
 */
public class Media {
    public Media(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
    @FindBy(xpath = "html/body/div[2]/div[1]/div[2]/div/a")
    public List<WebElement> rightbanner;
    @FindBy(xpath = "html/body/div[2]/div[2]/div[1]/div/div/a")
    public List<WebElement> newwenzhang;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/div[1]/div/a")
    public WebElement huodong;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/div[2]/div/a")
    public List<WebElement> wenzhangjingxuan;
}
