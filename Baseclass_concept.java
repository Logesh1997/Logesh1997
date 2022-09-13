package Naresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass_concept {
	public static WebDriver driver;
   public static WebDriver browserLaunch(String browsername) { 
     
	   if (browsername.equalsIgnoreCase("chrome")) {
		   System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
           
	   }  else if (browsername.equalsIgnoreCase("Firefox")) {
        	   System.setProperty("WebDriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
                driver = new FirefoxDriver();
               
           }else if (browsername.equalsIgnoreCase("IE")) {
        	   System.setProperty("WebDriver.ie.driver",System.getProperty("user.dir")+"\\Driver\\iedriver.exe");
               driver = new InternetExplorerDriver();
			
		}    
               return driver; 	  	   
}
      public static void getUrl(String Url) {
	      
    	 driver.get(Url); 	 

	}
     public static void inputElement(WebElement element, String text) {
    	element.sendKeys("text");
    
	}
     public static void clickOnElement(WebElement element) {
	  element.click();
	  
	}
         
    public static void dropDown(WebElement element, String option, String value) {
	    
    	Select s = new Select(element);

    	if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (option.equalsIgnoreCase("value")) {
			s.selectByValue("value");
		}else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
    	
    	
    	
    	
    	
	}
      
}
