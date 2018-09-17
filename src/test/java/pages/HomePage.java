package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HomePage {
	
	 
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath="//a[@href='/hunt']")
	public WebElement huntButton;
	
	@FindBy(xpath = "//a[@href='/schedule/my']")
	public WebElement scheduleButton;
	

}
