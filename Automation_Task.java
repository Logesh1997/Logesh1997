package Naresh;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation_Task {
   public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajith Logesh\\eclipse-workspace\\Selenium.java\\Selenium.java\\Driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement Email = driver.findElement(By.id("email"));
	Email.sendKeys("ajithkrmmc97.m@gmail.com");
	
	WebElement Password = driver.findElement(By.id("passwd"));
	Password.sendKeys("ajithajith");
	
	WebElement login = driver.findElement(By.id("SubmitLogin"));
	Actions ac = new Actions(driver);
	ac.click(login).build().perform();
	
	WebElement Search = driver.findElement(By.id("search_query_top"));
	ac.click(Search).build().perform();
	
	Robot rb = new Robot();
	
	rb.keyPress(KeyEvent.VK_B);
	rb.keyPress(KeyEvent.VK_L);	
	rb.keyPress(KeyEvent.VK_O);
	rb.keyPress(KeyEvent.VK_U);
	rb.keyPress(KeyEvent.VK_S);
	rb.keyPress(KeyEvent.VK_E);
	
	WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	ac.click(submit).build().perform();
	
	WebElement Add = driver.findElement(By.xpath("//span[text()='In stock									']"));
	ac.click(Add).build().perform();
	
	WebElement Addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
	ac.click(Addtocart).build().perform();
	
	WebElement checkout = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
	checkout.click();
	
	WebElement proceed = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
	ac.click(proceed).build().perform();
	
	WebElement proceedtocheckout = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
	ac.click(proceedtocheckout).build().perform();
	
	WebElement agree = driver.findElement(By.id("cgv"));
	ac.click(agree).build().perform();
	
	WebElement processcarrier = driver.findElement(By.name("processCarrier"));
	ac.click(processcarrier).build().perform();
	
	WebElement cheque = driver.findElement(By.xpath("//a[@class='cheque']"));
	ac.click(cheque).build().perform();
	
	WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	ac.click(confirmorder).build().perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
   
    
}

