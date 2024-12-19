package com_JsE;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg_JavaScriptE_Prac {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");

        driver.manage().window().maximize();

        WebElement email =driver.findElement(By.xpath("//input[@name='email']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='joshitha@gmail.com'",email);

        js.executeScript("arguments[0].setAttribute('style','color:green')",email);

        WebElement sign_Up= driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
        js.executeScript("arguments[0].click()",sign_Up);

        Thread.sleep(5000);

        WebElement already = driver.findElement(By.xpath("//a[text()='Already have an account?']"));
        js.executeScript("arguments[0].scrollIntoView()",already);

       WebElement a= driver.findElement(By.xpath("//a[@aria-label='Already have an account?']"));
       a.click();
       WebElement email1=driver.findElement(By.xpath("//input[@id='email']"));
       js.executeScript("arguments[0].value='helloworld@123'",email1);
       js.executeScript("arguments[0].setAttribute('style','color:yellow')",email1);
       WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
       js.executeScript("arguments[0].value='123455678'",password);
       js.executeScript("arguments[0].setAttribute('style','color:olive')",password);
       WebElement loginButton=driver.findElement(By.xpath("//button[@id='loginbutton']"));
       js.executeScript("arguments[0].click()",loginButton);

       WebElement group=driver.findElement(By.xpath("//a[@href='/groups/discover/']"));
        js.executeScript("arguments[0].scrollIntoView()",group);
        Thread.sleep(1000);


        WebElement login=driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
        js.executeScript("arguments[0].scrollIntoView()",login);

        driver.navigate().back();

       WebElement forgotten= driver.findElement(By.xpath("//a[text()='Forgotten account?']"));
        forgotten.click();
        WebElement mobile=driver.findElement(By.xpath("(//input[@name='email'])[1]"));
        js.executeScript("arguments[0].value='joshithasunil22@gmail.com'",mobile);
        js.executeScript("arguments[0].setAttribute('Style','color:orange')",mobile);

        WebElement submit=driver.findElement(By.id("did_submit"));
        submit.click();

        WebElement address=driver.findElement(By.name("email"));
        address.sendKeys("67789900887");

        WebElement pass=driver.findElement(By.name("pass"));
        pass.sendKeys("greattttttt");

        WebElement cancel=driver.findElement(By.xpath("(//a[@role='button'])[1]"));
        cancel.click();






//       driver.quit();
}
}
