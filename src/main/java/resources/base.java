package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fls = new FileInputStream("C:Seleniumframework\\src\\main\\java\\resources\\data.properties");
		prop.load(fls);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			
			System.setProperty("webdrive.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browserName.equals("firefox"))
		{
			// execute firefox driver data.properties
		
		}
		else if (browserName.equals("IE"))
		{
			// execute IE driver
		}
		return driver;
			
	}
	

}

