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

public class TestLogin {

	WebDriver driver=BrowserProviderFactory.getBrowser("chrome");
	
	  @BeforeMethod
	  public void setup(){
		  driver.get(DataProviderFactory.getConfig().getURL());
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  }
	
	@Test
	public void checklogin(){
		HomePage h= PageFactory.initElements(driver,HomePage.class);
		h.clickLogin();
		LogInPage p=PageFactory.initElements(driver,LogInPage.class);
	p.login();
	System.out.println("logged in");
	Dashboard d=PageFactory.initElements(driver,Dashboard.class);
	Assert.assertTrue(d.verifylogin());

	}
	
	@AfterTest
	public void packup(){
		driver.quit();
	}
	
}
