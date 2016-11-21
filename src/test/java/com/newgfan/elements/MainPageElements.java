package com.newgfan.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by xiaohua on 11/14 0014.
 */
public class MainPageElements {
    WebDriver driver;

    //构造方法（有参数
    public MainPageElements(WebDriver driver) {
        this.driver = driver;
    }
    //锋头条
    @FindBy(xpath = "html/body/div[4]/div[2]/div[2]/h1")
    public WebElement fengTouTiao;

    @FindBy(xpath = "html/body/div[4]/div[2]/div[2]/div/h2/a")
    public List<WebElement> firstTitle;
    @FindBy(xpath = "html/body/div[4]/div[2]/div[2]/div[1]/ul/li/a")
    public List<WebElement> secondTitle;
    @FindBy(xpath = ".//*[@id='nav01-tab']/a")
    public List<WebElement> leftbanner_below;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/div[1]/div")
    public WebElement righthuodong;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/div[2]/div/div/ul/li/div/div/a")
    public List<WebElement> fengkuaixun;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/div[4]/div/a")
    public List<WebElement> fengzhunti;
    @FindBy(xpath = ".//*[@id='nav02']/div[1]/div[1]/a")
    public WebElement fengtushang;
    @FindBy(xpath = ".//*[@id='nav02']/div[1]/div[2]/div/a")
    public List<WebElement> tushangright;
    @FindBy(xpath = ".//*[@id='nav02']/div[2]/div/a")
    public List<WebElement> fengtushangbelow;
    @FindBy(xpath = ".//*[@id='nav03']/div/div[1]/a")
    public WebElement fengkandian;
    @FindBy(xpath = ".//*[@id='nav03']/div/div[2]/div/a")
    public List<WebElement> fengkandianrightpic;
    @FindBy(xpath = ".//*[@id='nav04']/h2/a")
    public List<WebElement> game_yingyong;
    @FindBy(xpath = ".//*[@id='nav04']/div[1]/div[1]/a")
    public WebElement game_yingyongleft;
    @FindBy(xpath = ".//*[@id='nav04']/div[1]/div[2]/div/a")
    public List<WebElement> game_yingyongright;
    @FindBy(xpath = ".//*[@id='nav04']/div[2]/div/a")
    public List<WebElement> game_yingyongbelow;
    @FindBy(xpath = ".//*[@id='nav05']/div/h2/a")
    public List<WebElement> bbsNav;
    @FindBy(xpath = ".//*[@id='nav05']/div/div/div[1]/div/a")
    public List<WebElement> bbspics;


}
