package com_Window_Handle_Method;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Prac_Window_Handles {
    public static void main(String[] args)throws AWTException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        WebElement searchOption =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchOption.sendKeys("iphone13 pro"+ Keys.ENTER);
//        searchOption.click();
       WebElement s= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
       s.click();

       WebElement iphone=driver.findElement(By.xpath("//h2[@aria-label='Apple iPhone 13 (128GB) - Midnight']"));
        iphone.click();
        //two windows
        Set<String> s1=driver.getWindowHandles();
        System.out.println(s1);

        String s2=driver.getWindowHandle();
        System.out.println(s2);
        for (String out : s1){
            if(!s2.equals(out)){
                driver.switchTo().window(out);

            }
            Robot r=new Robot();
            r.keyPress(KeyEvent.VK_TAB);

            
        }





//        String w=driver.getWindowHandle();
//        System.out.println(w);


    }
}
