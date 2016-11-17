package com.newgfan.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by xiaohua on 11/15 0015.
 */
public class pubElements {
    WebDriver driver;
    public pubElements(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "html/body/div[5]/div[2]/div[2]/div[2]/a")
    public WebElement aboutRead;

    @FindBy(xpath = "html/body/div[5]/div[2]/div[2]/ul/li[1]/a")
    public WebElement jingxuanTitle;

    //分类：标题前的分类
    @FindBy(xpath = "html/body/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    public WebElement classify01;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    public WebElement classify02;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[1]/div[3]/ul[1]/li[1]/a[1]")
    public WebElement classify03;
    //点击标题前的分类进入的页面、点击【更多】后的机锋精选
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/div[2]/ul/li/a")
    public List<WebElement> classifyJingxuan;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/ul/li/a")
    public List<WebElement> wenzhangpaihang;
}
