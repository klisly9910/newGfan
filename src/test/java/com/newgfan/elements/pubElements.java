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

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[1]/h2/a")
    public WebElement firstTitle;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a[2]")
    public WebElement secondTitle;
    @FindBy(xpath = "html/body/div[5]/div[2]/div[2]/ul/li/a")
    public List<WebElement> jifengjingxuan;
    @FindBy(xpath = "html/body/div[5]/div[2]/div[2]/div[2]/a")
    public WebElement aboutRead;
    @FindBy(xpath = "html/body/div[5]/div[2]/div[2]/ul/li[1]/a")
    public WebElement jingxuanTitle;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[1]/a/img")
    public WebElement tushangLeft;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/a")
    public List<WebElement> tushangRight;
    @FindBy(xpath = ".//*[@id='snav03-tab']/a")
    public List<WebElement> tushangBelow_Nav;
    @FindBy(xpath = ".//*[@id='snav03']/div[1]/div[2]/div[1]/div/div[1]/a[2]")
    public WebElement zixunfirstpic;
//    @FindBy(xpath = ".//*[@id='enav03']/div[1]/div[2]/div[1]/div/div[1]/a[2]")
//    public WebElement jiadianzixunfirstpic;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/div[2]/a")
    public WebElement jifengshidian_pic;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/div[1]/a")
    public WebElement jifengshidian_more;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/ul/li/a")
    public List<WebElement> wenzhangpaihang;

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

}
