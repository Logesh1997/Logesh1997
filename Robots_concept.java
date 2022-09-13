package Naresh;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robots_concept {
     public static void main(String[] args) throws Throwable {
    	 System.setProperty("webdriver.chrome.driver",
 				"C:\\Users\\Ajith Logesh\\eclipse-workspace\\Selenium.java\\Selenium.java\\Driver\\chromedriver.exe");

 		WebDriver driver = new ChromeDriver();
 		driver.get("https://www.amazon.in/");
 		driver.manage().window().maximize();
 		Thread.sleep(3000);
 		
	  
	  WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	  
	  Actions ac = new Actions(driver);
	  
	  ac.click(searchbox).build().perform();
	  
	  Thread.sleep(3000);
	  
	  Robot rb = new Robot();
	
	  rb.keyPress(KeyEvent.VK_CAPS_LOCK);
	 Thread.sleep(3000);
	 rb.keyPress(KeyEvent.VK_O); 
	 rb.keyPress(KeyEvent.VK_N);
	 Thread.sleep(3000);
	 rb.keyPress(KeyEvent.VK_I);
	 rb.keyPress(KeyEvent.VK_O);
	 Thread.sleep(3000);
     rb.keyPress(KeyEvent.VK_N);
     }
}
