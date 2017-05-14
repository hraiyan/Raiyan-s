package TestCases;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ApplicationPages.Dashboard;
import ApplicationPages.HomePage;
import ApplicationPages.LogInPage;
import Factory.BrowserProviderFactory;
import Factory.DataProviderFactory;

public class TestHome {

	WebDriver driver=BrowserProviderFactory.getBrowser("chrome");
	
	  @BeforeMethod
	  public void setup(){
		  driver.get(DataProviderFactory.getConfig().getURL());
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  }
	  
	@Test
	public void checkTitle(){
		HomePage h= PageFactory.initElements(driver,HomePage.class);
		String title=h.getTitle();
		System.out.println(title);
	Assert.assertEquals("Title not matched", "Avactis Demo Store", title);
	}
	
	
	
	@AfterTest
	public void packup(){
		driver.quit();
	}
	
}
