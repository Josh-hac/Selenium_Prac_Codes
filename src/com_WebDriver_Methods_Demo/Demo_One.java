package com_WebDriver_Methods_Demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_One {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://playwright.dev/");

        String s = driver.getTitle();
        System.out.println(s);

        String d = driver.getCurrentUrl();
        System.out.println(d);

        driver.navigate().to("https://www.selenium.dev/");

        driver.navigate().back();

        Thread.sleep(5000);

        driver.navigate().forward();

        driver.navigate().refresh();

//        driver.manage().window().maximize();
//
//        driver.manage().window().fullscreen();
//
//        driver.manage().window().minimize();

        Dimension dimension = driver.manage().window().getSize();
        System.out.println(dimension);

        Dimension g = new Dimension(1200,800);
        driver.manage().window().setSize(g);

        driver.quit();


    }

}
