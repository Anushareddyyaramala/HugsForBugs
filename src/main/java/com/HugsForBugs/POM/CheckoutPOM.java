package com.HugsForBugs.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HugsForBugs.BaseClass.BaseTest;

public class CheckoutPOM extends BaseTest{

	WebDriver driver;
	@FindBy(linkText="Checkout")private WebElement Checkout;
	@FindBy(css="#addressChangeLinkId")private WebElement change;
	@FindBy(xpath="//a[@id='add-new-address-popover-link']")private WebElement addnewaddress;
	@FindBy(xpath="//*[@id='address-ui-widgets-countryCode-dropdown-nativeId']")private WebElement country;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")private WebElement firstname;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPhoneNumber']")private WebElement Mobile;
	@FindBy(css="#address-ui-widgets-enterAddressPostalCode")private WebElement Pincode;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")private WebElement address;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine2']")private WebElement address2;
	@FindBy(xpath="//input[@id='address-ui-widgets-landmark']")private WebElement landmark;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressCity']")private WebElement town;
	@FindBy(xpath="//select[@id='address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId']")
	private WebElement state;
	@FindBy(css="#address-ui-widgets-form-submit-button")private WebElement Usethisaddress;
	@FindBy(xpath="//*[@id=\"address-list\"]/div/div[1]/div/fieldset[2]/div[1]/span/div/label/span/span[2]/text()")private WebElement total;
	@FindBy(css="#orderSummaryPrimaryActionBtn")private WebElement useaddress;
	
	@FindBy(xpath="//span[text()='HDFC Bank']']")private WebElement netbanking;
	@FindBy(xpath="//*[@id=\"pp-HyAz3G-140\"]/span/input")private WebElement usepayment;

	
	public WebElement getchange() {
		return change;
	}
	public WebElement getAddnewaddress() {
		return addnewaddress;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getMobile() {
		return Mobile;
	}
	public WebElement getPin() {
		return Pincode;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getAddress2() {
		return address2;
	}
	public WebElement getLandmark() {
		return landmark;
	}
	public WebElement getTown() {
		return town;
	}
	public WebElement getState() {
		return state;
	}
	
//	public WebElement getuseaddress() {
//		return useaddress;
//	}
	public WebElement getusethisAddress() {
		return Usethisaddress;
	}
		public WebElement gettotal() {
			return total;
		
		}
	
	public WebElement getNetbanking() {
		return netbanking;
	}
	public WebElement getusepayment() {
		return usepayment;
	}
	
	public CheckoutPOM(WebDriver driver){
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	public void chechout(String name, String mobile, String Pinno, String address1, String Address12, String land, String mandal) {
		
		
		change.click();
		addnewaddress.click();
		wLib.handleDropDown(country, "India");
		firstname.sendKeys(name);
		Mobile.sendKeys(mobile);
		Pincode.sendKeys(Pinno);
		address.sendKeys(address1);
		address2.sendKeys(Address12);
		landmark.sendKeys(land);
		town.sendKeys(mandal);
		//wLib.handleDropDown(country, "TELANGANA");
		Usethisaddress.click();
//		
//		System.out.println(total.getText());
		
//		useaddress.click();
		
//		netbanking.click();
	}
}
