package com_WebDriver_Methods_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_Website_Automation {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");

        WebElement user_Name = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        user_Name.sendKeys("Joshitha");

      WebElement password=  driver.findElement(By.xpath("//input[@name='pass']"));
        password.sendKeys("46789900");

//       WebElement login= driver.findElement(By.name("login"));
//        login.click();

        WebElement w= driver.findElement(By.xpath("//div[@id='header_block']"));
        System.out.println(w.getText());
        driver.quit();


    }
}
