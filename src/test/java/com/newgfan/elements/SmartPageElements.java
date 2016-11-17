package com.newgfan.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.ws.WebEndpoint;
import java.util.List;

/**
 * Created by xiaohua on 11/16 0016.
 */
public class SmartPageElements {
    WebDriver driver;

    //构造方法（有参数
    public SmartPageElements(WebDriver driver) {
        this.driver = driver;
        // driver.get(url);
        // PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[1]/h2/a")
    public WebElement firstTitle;
    @FindBy(xpath = "html/body/div[5]/div[2]/div[2]/div[2]/a")
    public WebElement aboutRead;
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a[2]")
    public WebElement secondTitle;
    @FindBy(xpath = "html/body/div[5]/div[2]/div[2]/ul/li/a")
    public List<WebElement> jifengjingxuan;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[1]/a/img")
    public WebElement tushangLeft;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div/a")
    public List<WebElement> tushangRight;
    @FindBy(xpath = ".//*[@id='snav03-tab']/a")
    public List<WebElement> tushangBelow_Nav;
    @FindBy(xpath = ".//*[@id='snav03']/div[1]/div[2]/div[1]/div/div[1]/a[2]")
    public WebElement zixunfirstpic;
    @FindBy(xpath = ".//*[@id='snav03']/div[1]/div[2]/div[4]/button")
    public WebElement loadmore;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/div[2]/a")
    public WebElement jifengshidian_pic;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/div[1]/a")
    public WebElement jifengshidian_more;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/div[2]/ul/li/a")
    public List<WebElement> more_jifengjingxuan;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/ul/li/a")
    public List<WebElement> wenzhangpaihang;


}
