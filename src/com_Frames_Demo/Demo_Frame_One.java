package com_Frames_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Frame_One {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");

        driver.switchTo().frame("singleframe");

        WebElement textBox =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        textBox.sendKeys("dggj");

        driver.switchTo().defaultContent();

        WebElement f=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
        f.click();

        Thread.sleep(1000);

        WebElement outer_Frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outer_Frame);
        Thread.sleep(1000);

        WebElement inner_Frame=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(inner_Frame);
        Thread.sleep(1000);

       WebElement textBox1= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        textBox1.sendKeys("fytgj");
        Thread.sleep(1000);

        driver.switchTo().defaultContent();

        WebElement single=driver.findElement(By.xpath("//a[@href='#Single']"));
       single.click();
       WebElement i= driver.findElement(By.xpath("//a[@href='#Multiple']"));
      i.click();



//       driver.quit();



    }

}
