package com_DropDown_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Demo_One {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns");

        driver.manage().window().maximize();

        WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
        Select s = new Select(fruits);
        Boolean b = s.isMultiple();
        System.out.println("Dropdown is Multiple" + b);

        List<WebElement> options = s.getOptions();
        for (WebElement o:options) {
            System.out.println(o.getText());
        }
        s.selectByIndex(1);
        s.selectByValue("1");
        s.selectByVisibleText("Pine Apple");

        List<WebElement> n =s.getAllSelectedOptions();
        for (WebElement m :n) {
            System.out.println("Selected Options : " + m);
        }






    }

}
