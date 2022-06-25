package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\basicData.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		
		if(browserName.equals("chrome"))
		{
			 driver =  WebDriverManager.chromedriver().create();
		}
		
		else 
		{
			//execute in firefox driver
			driver = WebDriverManager.firefoxdriver().create();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	

}
