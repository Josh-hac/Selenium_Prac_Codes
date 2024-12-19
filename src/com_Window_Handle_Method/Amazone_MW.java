package com_Window_Handle_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Amazone_MW {

    public static WebDriver driver;

    public static void right_Click(WebElement element){
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


    public static void main(String[] args) throws AWTException, InterruptedException {

        driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.navigate().refresh();

        Thread.sleep(10000);

       WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));
       WebElement bestSellers = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
       WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
       WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics ']"));

       right_Click(sell);
       down_And_Enter();

        right_Click(bestSellers);
        down_And_Enter();

        right_Click(mobiles);
        down_And_Enter();

        right_Click(electronics);
        down_And_Enter();

        String target_Window = "https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles";

         String parent= driver.getWindowHandle();

         Set<String> all_Windows= driver.getWindowHandles();

        for (String target:all_Windows) {
            if (driver.switchTo().window(target).getCurrentUrl().equals(target_Window)){
                System.out.println("Current URL" + driver.getCurrentUrl());
                break;
            }

        }

    }
}
