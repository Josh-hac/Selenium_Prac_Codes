package com_Screenshot_Task;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class Facebook_ScreenShot_Task {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();

       WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.click();
        email.sendKeys("87654333907");

        WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
        password.click();
        password.sendKeys("ffdddfggg");

        TakesScreenshot ts=(TakesScreenshot) driver;
        File source =ts.getScreenshotAs(OutputType.FILE);
        File des = new File("C:\\Users\\HP\\IdeaProjects\\Selenium_Prac_Demo\\src\\Screenshot\\Demo_Fb.png");
        FileUtils.copyFile(source,des);

        WebElement signUp=driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
        signUp.click();
       WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
//        firstName.click();
        firstName.sendKeys("guhhjiojio");

       WebElement lastname= driver.findElement(By.xpath("//input[@name='lastname']"));
//        lastname.click();
        lastname.sendKeys("fygiii");

        WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
        day.click();
        Select s=new Select(day);
        s.selectByIndex(5);

        WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
        month.click();
        Select s1=new Select(month);
        s1.selectByValue("4");

        WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
        year.click();
        Select s2=new Select(year);
        s2.selectByIndex(10);

        WebElement gender=driver.findElement(By.xpath("(//input[@id='sex'])[1]"));
        gender.click();

        WebElement phn=driver.findElement(By.xpath("//input[@name='reg_email__']"));
//        phn.click();
        phn.sendKeys("589908765");

        WebElement password1=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
//        password1.click();
        password1.sendKeys("bgffdfdffd");


    }
}
