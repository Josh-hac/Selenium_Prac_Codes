package com_DropDown_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_FaceBook {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");

        driver.manage().window().maximize();
       WebElement SignUp=driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
        SignUp.click();

      WebElement  firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.click();

        firstName.sendKeys("Hrithik");

        WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.click();
        lastName.sendKeys("Roshan");

      WebElement  day=driver.findElement(By.xpath("//select[@id='day']"));

        Select s=new Select(day);
        s.selectByIndex(18);
        WebElement  month=driver.findElement(By.xpath("//select[@id='month']"));
        month.click();
        Select s1=new Select(month);
        s1.selectByValue("3");


        WebElement  year=driver.findElement(By.xpath("//select[@id='year']"));
        year.click();
        Select s2=new Select(year);
        s2.selectByValue("1990");
        year.click();

        WebElement  gender=driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
        gender.click();

        WebElement  phn=driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number ')]"));
        phn.click();
        phn.sendKeys("98765432176");



    }
}
