package com_Mw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Mw_Handles_Demo {
   public static WebDriver driver;
    public static  void rightClick(WebElement element){
        Actions a=new Actions(driver);
        a.contextClick(element).build().perform();
    }

    public static  void down_Enter() throws  AWTException{
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void main(String[] args) throws AWTException,InterruptedException {
         driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        Thread.sleep(10000);

       WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));
        WebElement bestSell = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
        WebElement todaysDeal = driver.findElement(By.xpath("//a[contains(text(),'Today')]"));
        WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));

        rightClick(sell);
        down_Enter();

        rightClick(bestSell);
        down_Enter();

        rightClick(todaysDeal);
        down_Enter();

        rightClick(mobiles);
        down_Enter();


        String s="https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles";

        String p=driver.getWindowHandle();

       Set<String> t= driver.getWindowHandles();
        for (String e:t) {
            if (driver.switchTo().window(e).getCurrentUrl().equals(s)){
                System.out.println("current Url"+driver.getCurrentUrl());
                break;
            }

        }


    }
}
