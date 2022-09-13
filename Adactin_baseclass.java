package Naresh;

import org.openqa.selenium.By;

public class Adactin_baseclass extends Baseclass_concept {
    
 public static void main(String[] args) {
	     
	driver = browserLaunch("Chrome");
	getUrl("https://adactinhotelapp.com/");
	
	
	inputElement(driver.findElement(By.id("username")),"SowmiyaSri");
	inputElement(driver.findElement(By.id("password")),"Sowmiya05");
     clickOnElement(driver.findElement(By.id("login")));   	 
     
     
     
     
	 
}	
	
	
	
	}
	
	
	 
	

	
	

