package Screenshot;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Robot_faceBook_Eg {
    public static void main(String[] args) throws AWTException{

        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");

        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();

        Robot r= new Robot();

        WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        email.click();

//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.alertIsPresent());

//        r.keyPress(KeyEvent.VK_CAPS_LOCK);
//        r.keyRelease(KeyEvent.VK_CAPS_LOCK);
        r.keyPress(KeyEvent.VK_J);
        r.keyRelease(KeyEvent.VK_J);

        r.keyPress(KeyEvent.VK_O);
        r.keyRelease(KeyEvent.VK_O);


        r.keyPress(KeyEvent.VK_S);
        r.keyRelease(KeyEvent.VK_S);

        r.keyPress(KeyEvent.VK_H);
        r.keyRelease(KeyEvent.VK_H);

        r.keyPress(KeyEvent.VK_I);
        r.keyRelease(KeyEvent.VK_I);

        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_T);

        r.keyPress(KeyEvent.VK_H);
        r.keyRelease(KeyEvent.VK_H);

        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_A);


        Actions a=new Actions(driver);
        r.keyPress(KeyEvent.VK_TAB);
//        WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
//        a.click(password).build().perform();
//
        r.keyPress(KeyEvent.VK_6);
        r.keyRelease(KeyEvent.VK_6);

        r.keyPress(KeyEvent.VK_5);
        r.keyRelease(KeyEvent.VK_5);

        r.keyPress(KeyEvent.VK_0);
        r.keyRelease(KeyEvent.VK_O);

        r.keyPress(KeyEvent.VK_TAB);

//       WebElement login= driver.findElement(By.xpath("//button[@name='login']"));
//       a.click(login).build().perform();
//
        r.keyPress(KeyEvent.VK_TAB);
       driver.navigate().back();












    }
}
