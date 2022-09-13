package Naresh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pom_Adactin {
    public static void main(String[] args) {
		System.setProperty("WebDriver.driver.chrome" ,"C:\\Users\\Ajith Logesh\\eclipse-workspace\\Selenium.java\\Selenium.java\\Driver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       
       
       driver.get("https://adactinhotelapp.com/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       
       
       Pom_Login po = new Pom_Login(driver);
       
      po.getUsername().sendKeys("Sowmiyasri");
      po.getUsername().sendKeys("Sowmiya05");
      po.getLogin_button().click();   
       
       
    
    }
}
