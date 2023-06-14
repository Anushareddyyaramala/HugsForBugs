package com.HugsForBugs.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {

	
	WebDriver driver;
	
	
	
	/*creating webelements*/
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement Email;
	
	@FindBy(xpath="//input[@id='continue']")
	public WebElement continuebutton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	public WebElement Signin;
	
	
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getContinuebutton() {
		return continuebutton;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignin() {
		return Signin;
	}
	
	public LoginPOM(WebDriver driver){
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
}
