package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver=driver;
	}

	@FindBy(xpath="//div[@class='topheadrow']/ul/li/a")
	WebElement home;
	
	@FindBy(xpath="//span[text()='My Account'])[1]")
	WebElement MyAccount;
	
	@FindBy(xpath="(//span[text()='My Cart'])[1]")
	WebElement MyCart;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	WebElement Wishlist;
	
	
	@FindBy(xpath="//span[text()=' Log In']")
	WebElement LogIn;
	
	public String getTitle(){
		return(driver.getTitle());
	}
	
	public void clickMyAccount(){
		MyAccount.click();
	}
	
	public void clickMyCart(){
		MyCart.click();
	}
	public void clickLogin(){
		LogIn.click();
	}
	
}
