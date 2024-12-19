package com_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Demo_WebTable {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://qavbox.github.io/demo/webtable/");

//        Particular Value on that Table

        WebElement single_Value = driver.findElement(By.xpath("(//td[text()='Accountant'])[1]"));
        System.out.println("Single Value = " + single_Value.getText());

//        All Values in that Table

//        List<WebElement> all_Values = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td"));
//        for (WebElement s: all_Values) {
//            System.out.println("All Values = " + s.getText());
//        }

//        specific Column

//        List<WebElement> particular_Column = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[1]"));
//        for (WebElement s: particular_Column) {
//            System.out.println("Particular Column Values = " + s.getText());
//        }

//        specific row

        List<WebElement> particular_Row = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr[1]/td"));
        for (WebElement s: particular_Row) {
            System.out.println("Particular Row Values = " + s.getText());
        }




    }
}
