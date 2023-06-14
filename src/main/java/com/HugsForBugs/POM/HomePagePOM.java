package com.HugsForBugs.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM {

	WebDriver driver;
	
	public HomePagePOM(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	public WebElement Searchbutton;
	
	@FindBy(xpath="//span[text()='POCO X4 Pro 5G (Yellow, 6GB RAM 128GB Storage)']")
	public WebElement Item;
	

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getSearchbutton() {
		return Searchbutton;
	}

	public WebElement getItem() {
		return Item;
	}
	

}
