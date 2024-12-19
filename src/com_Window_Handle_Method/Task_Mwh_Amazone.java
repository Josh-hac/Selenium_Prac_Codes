package com_Window_Handle_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

public class Task_Mwh_Amazone {
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

        WebElement best = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
        WebElement customer = driver.findElement(By.xpath("(//a[text()='Customer Service'])[1]"));
        WebElement electronics = driver.findElement(By.xpath("(//a[text()=' Electronics '])[1]"));

        right_Click(mobiles);
        down_And_Enter();

        right_Click(best);
        down_And_Enter();

        right_Click(customer);
        down_And_Enter();

        right_Click(electronics);
        down_And_Enter();


        String b = "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers";


        Set<String> all_Tabs = driver.getWindowHandles();
        for (String s : all_Tabs) {

            if (driver.switchTo().window(s).getCurrentUrl().equals(b)) {
                System.out.println(driver.getCurrentUrl());
                break;
            }

        }

    }

}

