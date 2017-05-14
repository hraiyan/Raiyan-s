package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard {

	WebDriver driver;
	public Dashboard(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(xpath="//span[text()=' Log Out']")
	WebElement logout;
	
	public Boolean verifylogin(){
		return(logout.isDisplayed());
		
	}
}
