package com_Screenshot_Task;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Task_One {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");

//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        File des = new File("C:\\Users\\HP\\IdeaProjects\\Selenium_Prac_Demo\\src\\Screenshot\\amazon.png");
//        FileUtils.copyFile(source,des);

        TakesScreenshot ts= (TakesScreenshot) driver;
       File source= ts.getScreenshotAs(OutputType.FILE);
       File des=new File("C:\\Users\\HP\\IdeaProjects\\Selenium_Prac_Demo\\src\\Screenshot\\amazon.png");
       FileUtils.copyFile(source,des);


    }
}
