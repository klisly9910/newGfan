package com.newgfan.elements;

import org.apache.xpath.objects.XBoolean;
import org.apache.xpath.res.XPATHErrorResources;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by xiaohua on 11/14 0014.
 */
public class PhonePageElements {
    WebDriver driver;

    //构造方法（有参数
    public PhonePageElements(WebDriver driver) {
        this.driver = driver;
        // driver.get(url);
        // PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = ".//*[@id='nav-top']/div[2]/a/img")
    public WebElement classifyLogo;

    @FindBy(xpath = "html/body/div[6]/div/div[1]/strong/a/img")
    public WebElement footerGfanLogo;

    // @FindBy(xpath = "html/body/div[3]/div/div[1]/strong/a/img")
    // public WebElement footerlogo;

    @FindBy(xpath = "/html/body/div[2]/div/a/img")
    public WebElement logoImag;

    //每个box的大标题
    @FindBy(xpath = "html/body/div[3]/div[1]/div[1]/h1")
    public WebElement phoneTitle;

    @FindBy(xpath = "/html/body/div[3]/div[1]/div[1]/div")
    public List<WebElement> phoneBoxs;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[1]/div/h2/a")
    public List<WebElement> phoneFirstTitle;

    //分类：标题前的分类
    @FindBy(xpath = "html/body/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    public WebElement classify01;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    public WebElement classify02;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[1]/div[3]/ul[1]/li[1]/a[1]")
    public WebElement classify03;

    //每个box的第一个标题
    @FindBy(xpath = "html/body/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[2]")
    public WebElement secondTitle01;
    @FindBy(xpath = ".//*[@id='content-top']/div/a/img")
    public WebElement switchLogo;
    @FindBy(xpath = ".//*[@id='SOHU_MAIN']/div[1]/div[3]/div/div[2]/div[1]/div/div[3]/div[2]/div/textarea")
    public WebElement changyanText;
    @FindBy(xpath = ".//*[@id='SOHU_MAIN']/div[1]/div[3]/div/div[1]/div[2]")
    public WebElement changyanButn;
    @FindBy(xpath = ".//*[@id='SOHU_MAIN']/div[5]/div/div[2]/ul/li[5]/span")
    public WebElement gfanlogin;
    @FindBy(xpath = "html/body/div[5]/div[2]/div[2]")
    public WebElement rightbanner;
    @FindBy(xpath = "html/body/div[5]/div[2]/div[2]/div[2]/a")
    public WebElement aboutRead;

    @FindBy(xpath = "html/body/div[5]/div[2]/div[2]/ul/li[1]/a")
    public WebElement jingxuanTitle;
    @FindBy(xpath = "html/body/div[6]/div/div[1]/strong/a/img")
    public WebElement getFootLogo;



    @FindBy(xpath = "html/body/div[3]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[2]")
    public WebElement secondTitle02;

    @FindBy(xpath = "html/body/div[3]/div[1]/div[1]/div[3]/ul[1]/li[1]/a[2]")
    public WebElement secondTitle03;
    //右侧banner
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div")
    public List<WebElement> right_banner;
    @FindBy(xpath = "html/body/div[3]/div[1]/div[2]/div/a[3]")
    public WebElement banerOne;

    //资讯
    @FindBy(xpath = ".//*[@id='nav01']/div[1]/div/div/a[2]")
    public List<WebElement> information;

    @FindBy(xpath = ".//*[@id='nav01']/div[1]/div/div[1]/a[2]")
    public WebElement infomationOne;

    //评测
    @FindBy(xpath = "html/body/div[3]/div[3]/div[2]/div/div/div/div/div/a[2]")
    public List<WebElement> evaluate;
    //评测下放的分类
    @FindBy(xpath = "html/body/div[3]/div[4]/div[1]/a")
    public List<WebElement> navtop;
    @FindBy(xpath = "html/body/div[3]/div[4]/div[2]/div[1]/div/div/div/div/a")
    public List<WebElement> pic;
    @FindBy(xpath = "html/body/div[3]/div[4]/div[2]/div[1]/div/div/div/div[1]/a")
    public WebElement picOne;
    @FindBy(xpath = "html/body/div[5]/div[2]/div[2]/div[2]/a")
    public WebElement secondPageAboutRead;

    @FindBy(xpath = "html/body/div[8]/p[5]/text()")
    public WebElement footTex;

    //图赏
    @FindBy(xpath = "html/body/div[3]/div[5]/div/div[1]/a")
    public WebElement leftPic;
    @FindBy(xpath = "html/body/div[3]/div[5]/div/div[2]/div/a")
    public List<WebElement> rightPic;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/ul/li")
    public List<WebElement> phoneSort;
    @FindBy(xpath = ".//*[@id='iscroll-rightbox']/ul/li/a")
    public List<WebElement> sortTitles;


}
