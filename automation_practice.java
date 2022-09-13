package Naresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class automation_practice {
  public static void main(String[] args) throws Throwable {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Logesh\\eclipse-workspace\\Selenium.java\\Selenium.java\\Driver\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
     driver.manage().window().maximize();
     
     WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
     login.click();
     
     WebElement email = driver.findElement(By.id("email_create"));
     email.sendKeys("ajithkrmmc97.m@gmail.com");
     Thread.sleep(3000);
     WebElement submitcreate = driver.findElement(By.id("SubmitCreate"));
     submitcreate.click();
     
     Thread.sleep(3000);
     
     WebElement radio = driver.findElement(By.xpath("//input[@type='radio'][1]"));
     radio.click();
     Thread.sleep(3000);
     
     WebElement customer = driver.findElement(By.id("customer_firstname"));
     customer.sendKeys("Ajith");
 
     WebElement lastname = driver.findElement(By.id("customer_lastname"));
     lastname.sendKeys("Logeshwaran");
     
     WebElement passwd = driver.findElement(By.id("passwd"));
     passwd.sendKeys("ajithajith");
     
     Thread.sleep(3000);
     
     WebElement days = driver.findElement(By.id("days"));
     
     Select s = new Select(days);
     s.selectByValue("27");
     Thread.sleep(3000);
     
     WebElement months = driver.findElement(By.id("months"));
     Select s1 = new Select(months);
     s1.selectByVisibleText("July ");
     Thread.sleep(3000);
     
     WebElement years = driver.findElement(By.id("years"));
     Select s2 = new Select(years);
     s2.selectByValue("1997");
     Thread.sleep(3000);
     
     WebElement newsletter = driver.findElement(By.id("newsletter"));
     newsletter.click();
     Thread.sleep(3000);
     
     WebElement optin = driver.findElement(By.id("optin"));
     optin.click();
     Thread.sleep(3000);
     
     WebElement company = driver.findElement(By.id("company"));
     company.sendKeys("Access healthcare");
     Thread.sleep(3000);
     
    WebElement address = driver.findElement(By.id("address1"));
    address.sendKeys("po box 1428 lexington,KY 50412"); 
    Thread.sleep(3000);

    WebElement address2 = driver.findElement(By.id("address2"));
    address2.sendKeys("access healthcare illnois boston");
    Thread.sleep(3000);
    
    WebElement city = driver.findElement(By.id("city"));
    city.sendKeys("austin");
    Thread.sleep(3000);
    
    
    WebElement state = driver.findElement(By.id("id_state"));
    Select s3 = new Select(state);
    s3.selectByVisibleText("California");
    Thread.sleep(3000);

    WebElement postcode = driver.findElement(By.id("postcode"));
    postcode.sendKeys("40518");
    Thread.sleep(3000);
    
    WebElement country = driver.findElement(By.id("id_country"));
    Select s4 = new Select(country);
    s4.selectByVisibleText("United States"); 
    
    WebElement otherinfo = driver.findElement(By.id("other"));
    otherinfo.sendKeys("java automation practice test");
    Thread.sleep(3000);
    
    WebElement phonenumber = driver.findElement(By.id("phone"));
    phonenumber.sendKeys("8778423210");
    Thread.sleep(3000);
    
    WebElement mobilenumber = driver.findElement(By.id("phone_mobile"));
    mobilenumber.sendKeys("8015661352");
    Thread.sleep(3000);
    
    WebElement alias = driver.findElement(By.id("alias"));
    alias.sendKeys("ajithajith97@gmail");
    Thread.sleep(3000);
    
    WebElement register = driver.findElement(By.id("submitAccount"));
    register.click();
    Thread.sleep(3000);
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
  }
 
}
