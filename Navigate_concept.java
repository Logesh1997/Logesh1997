package Naresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_concept {
   
	public static void main(String[] args) throws Throwable {
		 System.setProperty("webdriver.chrome.driver",
	 				"C:\\Users\\ajith\\eclipse-workspace\\Ajith\\Drivers\\chromedriver.exe");

	 		WebDriver driver = new ChromeDriver();
	 		driver.get("https://www.google.com/");
	 		driver.manage().window().maximize();
	 		Thread.sleep(3000);
	 		
	 		driver.navigate().to("https://www.amazon.in/");
	      
	 		driver.navigate().to("https://www.facebook.com/");
	 		
	 		driver.navigate().back();
	 		
	 		driver.navigate().back();
	 		
	 		driver.navigate().forward();
	 		driver.navigate().forward();
	 		driver.navigate().forward();
	 		driver.navigate().refresh();
	 		driver.close();
	 		
	 		
	 		
	 		
    	
	
	}
	
	
	
	
}
