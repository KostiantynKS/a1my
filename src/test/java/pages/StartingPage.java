package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class StartingPage {
	
	public StartingPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "/html/body/app-root/div/app-sign-in-page/div/div/div/div/form/div[1]/div[2]/div/p/input")
	public WebElement emailField;
	
	@FindBy(xpath = "/html/body/app-root/div/app-sign-in-page/div/div/div/div/form/div[2]/div[2]/div/p/input")
	public WebElement passwordField;
	
	@FindBy(className = "button is-dark")
	public WebElement signInButton;

}
