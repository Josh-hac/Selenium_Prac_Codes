import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Tasks_Sel {
    public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/login/");
      String n= driver.getTitle();
        System.out.println(n);

        String g=driver.getCurrentUrl();
        System.out.println(g);

        String t=driver.getPageSource();
        System.out.println(t);

//      driver.close();

       driver.navigate().refresh();

     driver.manage().window().maximize();


        driver.manage().window().fullscreen();
        driver.manage().window().minimize();

       Dimension y = driver.manage().window().getSize();
        System.out.println(y);

        Dimension d=new Dimension(1234,534);
        driver.manage().window().setSize(d);







    }
}
