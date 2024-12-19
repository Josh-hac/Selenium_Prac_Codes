import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Prac {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();


        WebElement facebook =driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
       String facebookText= facebook.getText();
        System.out.println(facebookText);

        WebElement f=driver.findElement(By.xpath("//input[@id='email']"));
       boolean  e=f.isDisplayed();
        System.out.println(e);
        WebElement l=driver.findElement(By.xpath("//button[@id='loginbutton']"));
         Boolean t= l.isEnabled();
        System.out.println(t);

         String size=  l.getCssValue("background-color");

        System.out.println("Login Button Size : " + size);

       WebElement password= driver.findElement(By.xpath("//input[@id='pass']"));
        boolean p=password.isSelected();
        System.out.println(p);
        driver.quit();
    }
}
