package com.newgfan.pub;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by xiaohua on 11/14 0014.
 */
public class SwitchToWindow {
    public static WebDriver driver;
    public static WebDriver window;
    public static String currentWindow;

    public static void switchToWindow(WebDriver driver) {
        // 得到当前窗口的句柄
        currentWindow = driver.getWindowHandle();
        // 得到所有窗口的句柄
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        while (it.hasNext()) {
            String handle = it.next();
            if (currentWindow.equals(handle)) {
                continue;
            }
            window = driver.switchTo().window(handle);// 跳转到新窗口
        }
    }


}
