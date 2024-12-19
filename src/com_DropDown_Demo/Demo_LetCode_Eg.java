package com_DropDown_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;

public class Demo_LetCode_Eg {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");
        driver.manage().window().maximize();

        WebElement drop =driver.findElement(By.xpath("//select[@id='superheros']"));
        Select s=new Select(drop);
        boolean b=s.isMultiple();
        System.out.println("dropdown is multiple"+b);

        List<WebElement> g=s.getOptions();
        for (WebElement w:g) {
            System.out.println(w.getText());
        }

        s.selectByIndex(0);
        s.selectByIndex(1);
        s.selectByIndex(2);
        s.selectByIndex(3);
        s.selectByIndex(4);
        s.selectByIndex(5);
        s.selectByIndex(6);

        List<WebElement> n =s.getAllSelectedOptions();
        for (WebElement m :n) {
            System.out.println("Selected Options : " + m);
        }




    }
}
