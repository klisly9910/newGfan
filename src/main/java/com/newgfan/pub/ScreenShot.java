package com.newgfan.pub;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import javax.sql.CommonDataSource;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by xiaohua on 11/22 0022.
 */
public class ScreenShot {
    public ScreenShot(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public  void takeScreenshot(String screenPath, WebDriver driver) {
        try {
            File scrFile = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(screenPath));
        } catch (IOException e) {
            System.out.println("Screen shot error: " + screenPath);
            Reporter.log("该错误可以查看截图："+screenPath);
        }

    }

    public  void takeScreenshot(WebDriver driver) {
        String screenPicName = Calendar.getInstance().getTimeInMillis() + ".jpg";
//        String screenName=CommonFunction.getFormatDate()+".jpg";
        File dir = new File("snapshot");
        if (!dir.exists())
            dir.mkdirs();
        String screenPath = dir.getAbsolutePath() + "/" + screenPicName;
        takeScreenshot(screenPath, driver);
    }
}
