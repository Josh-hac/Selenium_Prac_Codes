package com_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Pac_WebTable {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://qavbox.github.io/demo/webtable/");
        driver.manage().window().maximize();

//        WebElement single_Value =driver.findElement(By.xpath("//td[text()='System Architect']"));
//        System.out.println(single_Value.getText());

//       List<WebElement> all_values=driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td"));
//        for (WebElement e:all_values) {
//            System.out.println(e.getText());
//
//        }

//       List<WebElement> row= driver.findElements(By.xpath("//table[@id='table02']/tbody/tr/td[4]"));
//        for (WebElement t:row) {
//            System.out.println(t.getText());
//
//        }

//        List<WebElement> column=driver.findElements (By.xpath("//table[@id='table02']/tbody/tr[2]/td"));
//        for (WebElement r:column) {
//            System.out.println(r.getText());
//
//        }

       WebElement a =driver.findElement(By.xpath("//table[@id='table02']/tbody/tr[2]/td"));
        System.out.println(a.getText());




    }
}
