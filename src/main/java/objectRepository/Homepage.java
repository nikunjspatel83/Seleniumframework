package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	WebDriver driver;
	// create constructor 
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search = By.id("srchword");
	By submit = By.xpath("//input[@type='submit']");
	
	public WebElement search ()
	{
		return driver.findElement(search);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
}
