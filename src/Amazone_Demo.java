import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Amazone_Demo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();

     WebElement search =driver.findElement(By.xpath("//input[@id='inputValEnter']"));
     search.click();
       search.sendKeys("crop Tops",Keys.ENTER);
//      WebElement se=driver.findElement(By.xpath("//span[text()='Search']"));
//        se.click();
        WebElement partialText=driver.findElement(By.xpath("(//p[contains(text(),'Ketch Black Polyester')])[2]"));
        partialText.click();
    }
}
