package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class StartingPage {
	
	public StartingPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(name = "email")
	public WebElement emailField;
	
	@FindBy(name = "password")
	public WebElement passwordField;
	
	@FindBy(xpath = "//button[@class='button is-dark']")
	public WebElement signInButton;

}
