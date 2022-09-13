package Naresh;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Task1 {
     public static void main(String[] args) throws Throwable {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajith Logesh\\eclipse-workspace\\Selenium.java\\Selenium.java\\Driver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Email = driver.findElement(By.id("email"));
		
		Actions ac = new Actions(driver);
		
		ac.click(Email).build().perform();
		
		Thread.sleep(3000);
    
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_A);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_J);
		rb.keyPress(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_T);
		rb.keyPress(KeyEvent.VK_H);
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_9);
		rb.keyPress(KeyEvent.VK_7);
		rb.keyPress(KeyEvent.VK_G);
		rb.keyPress(KeyEvent.VK_M);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_L);
		rb.keyPress(KeyEvent.VK_C);
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_O);
		rb.keyPress(KeyEvent.VK_M);
	    Thread.sleep(3000);
	    rb.keyPress(KeyEvent.VK_SHIFT);
	    rb.keyPress(KeyEvent.VK_RIGHT);
	    rb.keyPress(KeyEvent.VK_CUT);
         WebElement password = driver.findElement(By.id("pass"));
		
		ac.click(password).build().perform();
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_PASTE);
		
		
		
		
		
		
		
		
		
		
		
     }
}
