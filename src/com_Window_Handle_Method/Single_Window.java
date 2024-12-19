package com_Window_Handle_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Single_Window {
    public static WebDriver driver;

    public static void right_Click(WebElement element) {
        Actions a = new Actions(driver);
        a.contextClick(element).build().perform();
    }

    public static void down_And_Enter() throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

    }

    public static void main(String[] args) throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.navigate().refresh();
        Thread.sleep(5000);

        driver.manage().window().maximize();

        WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));

        right_Click(mobiles);
        down_And_Enter();

        String parent = driver.getWindowHandle();

        Set<String> all_Tabs = driver.getWindowHandles();
        for (String s : all_Tabs) {

            if (s.equals(parent)) {
                continue;
            }else {
                driver.switchTo().window(s);
                System.out.println(driver.getCurrentUrl());
            }

        }

    }

}

