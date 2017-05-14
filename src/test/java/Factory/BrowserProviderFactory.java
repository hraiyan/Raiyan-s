package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserProviderFactory {

	static WebDriver driver;
	public static WebDriver getBrowser(String browsername){
		
		if(browsername.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			
		}
	
	
	if(browsername.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver",DataProviderFactory.getConfig().getChromeDriver());
		driver=new ChromeDriver();
	}
	return driver;
}}
