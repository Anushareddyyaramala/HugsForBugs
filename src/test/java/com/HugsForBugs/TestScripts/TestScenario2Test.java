package com.HugsForBugs.TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.HugsForBugs.BaseClass.BaseTest;
import com.HugsForBugs.POM.CheckoutPOM;
import com.HugsForBugs.POM.HomePagePOM;
import com.HugsForBugs.POM.LoginPOM;
import com.HugsForBugs.POM.ProductDisplayPOM;

public class TestScenario2Test extends BaseTest {
	@Test
	public void homepageTest() throws IOException, InterruptedException {
		
/*login*/
		
		LoginPOM login = new LoginPOM(driver);
		String username = plib.readDataFromPropertyFile("Username");
		String pass = plib.readDataFromPropertyFile("password");

		login.Email.sendKeys(username);
		login.continuebutton.click();
		login.password.sendKeys(pass);
		login.Signin.click();
		
/*select product*/
		
		HomePagePOM home = new HomePagePOM(driver);

		String item = plib.readDataFromPropertyFile("Item");

		home.searchbox.sendKeys(item);
		home.Searchbutton.click();
		wLib.scrollAction(driver);
//		jLib.getRandomNumber();
        home.products.click();
        
/*Add to cart page*/
        
		ProductDisplayPOM pro = new ProductDisplayPOM(driver);
		wLib.WindowHandles(driver, 1);
		wLib.scrollAction(driver);
		pro.BuyNow.click();
		String page = driver.getTitle();
		System.out.println(page);
		
/*checkout page*/
		
		CheckoutPOM checking = new CheckoutPOM(driver);
		
		String name = plib.readDataFromPropertyFile("FirstName");
		String mobile = plib.readDataFromPropertyFile("Mobile");
		String pinno = plib.readDataFromPropertyFile("Pinno");
		String address1 = plib.readDataFromPropertyFile("Address1");
		String address12 = plib.readDataFromPropertyFile("Address12");
		String land = plib.readDataFromPropertyFile("Landmark");
		String mandal = plib.readDataFromPropertyFile("Town");
		String card=plib.readDataFromPropertyFile("Card");
		String cardna=plib.readDataFromPropertyFile("Cardname");
		String cvv=plib.readDataFromPropertyFile("CvvNo");
		
/* Actions */

		checking.chechout(name, mobile, pinno, address1, address12, land, mandal,card,cardna,cvv);
	}
}
