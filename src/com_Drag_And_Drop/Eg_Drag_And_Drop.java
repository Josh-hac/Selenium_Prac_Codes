package com_Drag_And_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eg_Drag_And_Drop {


    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Static.html");
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.xpath("//img[@id='angular']"));

        WebElement destination = driver.findElement(By.xpath("//div[@id='droparea']"));

        Actions a = new Actions(driver);
        a.dragAndDrop(source,destination).build().perform();


    }
}
