package Naresh;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowntask6_concept {
   public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajith Logesh\\eclipse-workspace\\Selenium.java\\Selenium.java\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement firstname = driver.findElement(By.id("firstName"));
	firstname.click();
	
	Robot rb = new Robot();
	rb.keyPress(KeyEvent.VK_A);
	rb.keyPress(KeyEvent.VK_J);
	rb.keyPress(KeyEvent.VK_I);
	rb.keyPress(KeyEvent.VK_T);
	rb.keyPress(KeyEvent.VK_H);
	
	WebElement Lastname = driver.findElement(By.id("lastName"));
	Lastname.click();
	
	rb.keyPress(KeyEvent.VK_L);
	rb.keyPress(KeyEvent.VK_O);
	rb.keyPress(KeyEvent.VK_G);
	rb.keyPress(KeyEvent.VK_E);
	rb.keyPress(KeyEvent.VK_S);
	rb.keyPress(KeyEvent.VK_H);
	
	WebElement Email = driver.findElement(By.id("userEmail"));
	Email.sendKeys("ajithajith97.m@gmail.com");
	
	WebElement Male = driver.findElement(By.xpath("//label[text()='Male']"));
	Male.click();
	
	WebElement Mobile = driver.findElement(By.id("userNumber"));
	Mobile.sendKeys("9841230533");	
	
	WebElement subject = driver.findElement(By.id("subjectsContainer"));
	subject.sendKeys("Testing concept");
	
	
}
}
