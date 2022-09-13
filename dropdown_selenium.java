package Naresh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.ConstantThrowable;

public class dropdown_selenium {
     
    public static void main(String[] args) throws ConstantThrowable, InterruptedException {
		
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith Logesh\\eclipse-workspace\\Selenium.java\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
		
		WebElement Createaccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
    	Createaccount.click();
    	
    	WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
    	firstname.sendKeys("Logeshwaran");
         
    	WebElement secondname = driver.findElement(By.name("lastname"));
    	secondname.sendKeys("ajithajith");
    	
    	WebElement mobilenumber = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
    	mobilenumber.sendKeys("9841230533");
    	
    	WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
    	password.sendKeys("9876543211");
    	
    	WebElement date = driver.findElement(By.id("day"));
    	
    	Select s = new Select(date);
    	
    	s.selectByValue("4");
    	
    	WebElement months = driver.findElement(By.id("month"));
    	
    	Select s1  = new Select(months);
    	
    	s1.selectByVisibleText("Feb");
    	
    	WebElement year = driver.findElement(By.id("year"));
    	
    	Select s2 = new Select(year);
    	
    	s2.selectByVisibleText("2020");
    	
    	WebElement Female = driver.findElement(By.xpath("//input[@type='radio']"));
    	Female.click();
    	
    	WebElement signup = driver.findElement(By.xpath("//button[text()='Sign Up']"));
    	signup.click();  	
    	 }

}
