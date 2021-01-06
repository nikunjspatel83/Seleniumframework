package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	WebDriver driver;
	
	// add constructor
	
	public  Loginpage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	By username = By.id("login1");
	By password = By.id("password");
	By login = By.name("proceed");
	
	// we need to add methods.
	
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement login ()
	{
		return driver.findElement(login);
	}
}

