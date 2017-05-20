package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import Factory.DataProviderFactory;



public class LogInPage {
	
	WebDriver driver;
	public LogInPage(WebDriver driver){
		this.driver=driver;
	}

	@FindBy(xpath="//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='passwd']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement login;
	
	public void login(){
		
		email.sendKeys(DataProviderFactory.getExcel().getData(0,0,0));
		pwd.sendKeys(DataProviderFactory.getExcel().getData(0,0,1));
		login.click();
	}
	
	
	
}
