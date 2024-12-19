package com_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webdriver_Method {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/login.php/");
        driver.manage().window().maximize();

        Thread.sleep(5000);

      WebElement signin =  driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
        System.out.println( signin.getCssValue("color"));
    }
}
