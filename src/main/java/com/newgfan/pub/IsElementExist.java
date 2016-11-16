package com.newgfan.pub;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/**
 * Created by xiaohua on 11/16 0016.
 */
public class IsElementExist {
    public static boolean doesWebElementExist(WebDriver driver, By selector) throws Exception{

        try {
            driver.findElement(selector);
            System.out.println("url is error");
            return true;
        } catch (NoSuchElementException e) {
//            System.out.println("url is correct!");
            return false;
        }
    }
}
