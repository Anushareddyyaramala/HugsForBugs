package com.HugsForBugs.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HugsForBugs.BaseClass.BaseTest;

import freemarker.ext.jsp.TaglibFactory.WebInfPerLibJarMetaInfTldSource;

public class ProductDisplayPOM extends BaseTest{

	WebDriver driver;
	
//	@FindBy(xpath="//input[@id='add-to-cart-button']")private WebElement addtocart;
//	
//	@FindBy(xpath="//span[@id=\"attach-sidesheet-checkout-button\"]//input[@type=\"submit\"]")
//	private WebElement proceedtocheck ;
	
	@FindBy(id="buy-now-button")
	public WebElement BuyNow;



	public WebElement getBuyNow() {
		return BuyNow;
	}

	//	public WebElement getAddtocart() {
//		return addtocart;
//	}
//	public WebElement getproceedtocheck() {
//		return proceedtocheck;
//	}
//	
	public ProductDisplayPOM(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
