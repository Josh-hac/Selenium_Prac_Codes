package com_DropDown_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete_Demo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/AutoComplete.html");

        WebElement text = driver.findElement(By.xpath("//input[@id='searchbox']"));
        text.click();
        text.sendKeys("India");


    }
}
