package Naresh;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class screenshot_java {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ajith Logesh\\eclipse-workspace\\Selenium.java\\Selenium.java\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement InputVal = driver.findElement(By.id("inputValEnter"));

		Actions ac = new Actions(driver);
		
		ac.click(InputVal).build().perform();
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_H);
		rb.keyPress(KeyEvent.VK_P);
		rb.keyPress(KeyEvent.VK_L);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_P);
		
		rb.keyPress(KeyEvent.VK_T);
		rb.keyPress(KeyEvent.VK_O);
		rb.keyPress(KeyEvent.VK_P);
		
		WebElement search = driver.findElement(By.xpath("//span[text()='Search']"));
		search.click();
	
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File("C:\\Users\\Ajith Logesh\\eclipse-workspace\\Selenium.java\\Selenium.java\\screenshot\\snapdeal.png");
		
	
		
		
		
		
		
		
		
	}
}
