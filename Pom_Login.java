package Naresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Login {
	
      public WebDriver driver;
      
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id= "password")
     private WebElement password;
	
	@FindBy(id = "login")
	private  WebElement login_button;

	public Pom_Login(WebDriver driver1) {
	this.driver = driver1; 
	PageFactory.initElements(driver1, this );
	}
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_button() {
		return login_button;
	}
	
}
