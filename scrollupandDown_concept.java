package Naresh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollupandDown_concept {
     public static void main(String[] args) {
    	 System.setProperty("webdriver.chrome.driver",
     			"C:\\Users\\Ajith Logesh\\eclipse-workspace\\Selenium.java\\Selenium.java\\Driver\\chromedriver.exe");
     	
 		WebDriver driver = new ChromeDriver();
     	
     	driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
     	
     	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	WebElement scrolldown = driver.findElement(By.xpath("//a[text()=' Privacy Policy']"));
	
	js.executeScript("arguments[0].scrollintoview();",scrolldown);
	
	
	WebElement scrollup = driver.findElement(By.xpath("//a[text()=' Enroll Now']"));
	
	js.executeScript("argument[0].scrollIntoview();",scrollup);
	}
        
     
    }

