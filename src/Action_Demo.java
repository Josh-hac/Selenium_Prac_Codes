import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Demo {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.greenstechnologys.com/");
        driver.manage().window().maximize();

        Actions a=new Actions(driver);
        WebElement courses =driver.findElement(By.xpath("//a[text()='COURSES']"));

        a.moveToElement(courses).build().perform();

        WebElement par_Courses= driver.findElement(By.xpath("//span[text()='Digital Marketing Training']"));
        a.click(par_Courses).build().perform();



    }
}
