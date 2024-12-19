package com_Task_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_One {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        Actions a=new Actions(driver);

       WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));

        a.moveToElement(fashion).build().perform();
        WebElement menFootwear=driver.findElement(By.xpath("//a[text()='Men Footwear']"));

        a.moveToElement(menFootwear).build().perform();

        WebElement sports=driver.findElement(By.xpath("(//a[contains(text(),' Sports')])[3]"));
         a.click(sports).build().perform();


    }
}
