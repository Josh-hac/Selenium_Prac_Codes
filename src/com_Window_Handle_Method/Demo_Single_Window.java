package com_Window_Handle_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Demo_Single_Window {
    public  static  WebDriver driver;
    public static void rightClick(WebElement element){
        Actions a=new Actions(driver);
        a.contextClick(element).build().perform();
        a.moveToElement(element).build().perform();
        a.scrollToElement(element).build().perform();

    }

    public  static  void down_Enter ()throws AWTException{
        Robot r= new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

    }


    public static void main(String[] args)throws InterruptedException,AWTException{
         driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        Thread.sleep(5000);

        WebElement pay =driver.findElement(By.xpath("(//a[text()='Amazon Pay'])[1]"));

        rightClick(pay);
        down_Enter();

        String parent=driver.getWindowHandle();
        System.out.println(parent);

        Set<String> all_Tabs=driver.getWindowHandles();
        for (String s:all_Tabs) {
            if (s.equals(parent)) {
                continue;
            }else {
                driver.switchTo().window(s);
                System.out.println(driver.getCurrentUrl());
            }
            WebElement scroll=driver.findElement(By.xpath("(//div[contains(@class,'a-section a-spacing-none s')])[1]"));
            rightClick(scroll);

        }


    }
}
