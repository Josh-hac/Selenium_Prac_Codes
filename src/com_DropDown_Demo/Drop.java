package com_DropDown_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");

        driver.manage().window().maximize();

       WebElement element = driver.findElement(By.xpath("//div[text()='Select Option']"));
       element.click();


    }
}
