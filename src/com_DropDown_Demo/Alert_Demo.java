package com_DropDown_Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");

        driver.manage().window().maximize();

//         Simple Alert
//
        WebElement simple_Alert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        simple_Alert.click();
        Thread.sleep(5000);
        Alert a = driver.switchTo().alert();
        a.accept();


        // Confirm Alert

        WebElement cTab = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
        cTab.click();
        WebElement confirm_Alert = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        confirm_Alert.click();
        Thread.sleep(5000);
        String text = a.getText();
        System.out.println(text);
        a.accept();

        //
       WebElement textBox= driver.findElement(By.xpath("//a[@href='#Textbox']"));
        textBox.click();
//        Thread.sleep(5000);
     WebElement   g=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
     g.click();
//        Thread.sleep(5000);


        a.sendKeys("joshitha");
//        Thread.sleep(5000);


        a.accept();

        WebElement widget=driver.findElement(By.xpath("//a[@href='Widgets.html']"));
        widget.click();
       WebElement autoComplete=driver.findElement(By.xpath("//a[@href='AutoComplete.html']"));
        autoComplete.click();

      WebElement  checkBox=driver.findElement(By.xpath("//input[@id='searchbox']"));
//        checkBox.click();
        Thread.sleep(5000);
        checkBox.click();

//       WebElement india = driver.findElement(By.xpath("//div[contains(@class,'ui-autocomplete')]"));
//        india.click();

    }
}
