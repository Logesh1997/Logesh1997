package Naresh;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch {
    public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
    			"C:\\Users\\Ajith Logesh\\eclipse-workspace\\Selenium.java\\Selenium.java\\Driver\\chromedriver.exe");
    	
		WebDriver driver = new ChromeDriver();
    	
    	driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
    	
    	driver.manage().window().maximize();
    	
    	TakesScreenshot ts = (TakesScreenshot) driver;
    	
    	File source = ts.getScreenshotAs(OutputType.FILE);
    	
    	File target = new File("C:\\Users\\Ajith Logesh\\eclipse-workspace\\Selenium.java\\Selenium.java\\screenshot\\greenstechnology.png");
    	
    	FileUtils.copyFileToDirectory(source, target);
    	  	
	}
	
}
