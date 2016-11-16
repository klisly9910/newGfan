package com.newgfan.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by xiaohua on 11/14 0014.
 */
public class ComputerPageElments {
    WebDriver driver;
    //构造方法(有参数)
    public ComputerPageElments(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(xpath = "html/body/div[4]/div[1]/div[1]/div")
    public List<WebElement> computerBox;
    @FindBy(xpath = "html/body/div[4]/div[1]/div[1]/div[1]/h2/a")
    public WebElement firstTitle;
    @FindBy(xpath = "html/body/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a[2]")
    public WebElement secondTitle;
    @FindBy(xpath = "html/body/div[4]/div[1]/div[1]/div[1]/ul/li[1]/a[1]")
    public WebElement clssifyOne;
    @FindBy(xpath = "html/body/div[4]/div[2]/div/div[1]/a")
    public WebElement tushangLeft;
    @FindBy(xpath = "html/body/div[4]/div[2]/div/div[2]/div/a")
    public List<WebElement> tushangRight;
    @FindBy(xpath = ".//*[@id='nav03-tab']/a")
    public List<WebElement> tushangBelow;
//    @FindBy(xpath = ".//*[@id='nav03']/div[1]/div[2]/div[1]/div/div/a[2]")
//    public List<WebElement> tushangPics;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/div/a")
    public List<WebElement> rightPics;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/div[2]/a")
    public WebElement jifengshidian;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/div[1]/a")
    public WebElement shidianMore;
    @FindBy(xpath = "html/body/div[5]/div[2]/div[2]/div[2]/a")
    public WebElement aboutRead;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/ul/li/a")
    public List<WebElement> wenzhangpaihang;






}
