package com_Drag_And_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Uplload {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/FileUpload.html");

        driver.manage().window().maximize();

        String path = "C:\\Photos\\Test.jpg";

        WebElement upload_Btn = driver.findElement(By.xpath("//input[@id='input-4']"));

        upload_Btn.sendKeys(path);





    }
}
