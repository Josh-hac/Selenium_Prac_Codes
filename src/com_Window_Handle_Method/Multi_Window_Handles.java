package com_Window_Handle_Method;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Multi_Window_Handles {

     public static WebDriver driver;

     public static void mouseHover(WebElement element){
         Actions a = new Actions(driver);
         a.moveToElement(element).build().perform();

     }

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


    public static void main(String[] args) throws AWTException {

        driver=new ChromeDriver();
        driver.get("https://www.greenstechnologys.com/");

        driver.manage().window().maximize();

        WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));

        WebElement management = driver.findElement(By.xpath("//span[text()='Product Management Training']"));

        WebElement ba_training = driver.findElement(By.xpath("//span[text()='Business Analyst Training']"));

        WebElement pmp_Training = driver.findElement(By.xpath("//span[text()='PMP Training']"));

        WebElement rcm_Training = driver.findElement(By.xpath("//span[text()='RCM Training']"));

        mouseHover(courses);

        right_Click(management);
        down_And_Enter();

        right_Click(ba_training);
        down_And_Enter();

        right_Click(pmp_Training);
        down_And_Enter();

        right_Click(rcm_Training);
        down_And_Enter();

        String s = "https://greenstechnologys.com/pmp-training-in-chennai.html";

        String parent_Window = driver.getWindowHandle();

        Set<String> all_Windows = driver.getWindowHandles();

//        for (String q:all_Windows) {
//
//
//        }

    }

}
