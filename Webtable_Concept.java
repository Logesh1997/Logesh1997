package Naresh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Concept {
  public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith Logesh\\eclipse-workspace\\Selenium.java\\Selenium.java\\Driver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	
	List<WebElement> Alldatas = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
	
	for (WebElement datas : Alldatas) {
		System.out.println(datas.getText());
	}
	
}
}
