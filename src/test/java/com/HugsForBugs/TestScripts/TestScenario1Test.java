package com.HugsForBugs.TestScripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.HugsForBugs.BaseClass.BaseTest;
import com.HugsForBugs.POM.LogOutPOM;
import com.HugsForBugs.POM.LoginPOM;

public class TestScenario1Test extends BaseTest {

	@Test
	public void logoutTest() throws IOException {

		/*login*/
		LoginPOM login=new LoginPOM(driver);
		String username=plib.readDataFromPropertyFile("Username");
		String pass=plib.readDataFromPropertyFile("password");
		
		login.Email.sendKeys(username);
		login.continuebutton.click();
		login.password.sendKeys(pass);
		login.Signin.click();
		/*logout*/
		
		LogOutPOM logout = new LogOutPOM(driver);
		logout.icon.click();
		wLib.scrollAction(driver);
		logout.signout.click();
		String Title = driver.getTitle();
		System.out.println(Title);
		String Actual = plib.readDataFromPropertyFile("ExpectedUrl");
		AssertJUnit.assertEquals(Title, Actual);
		System.out.println("It came back to Amazon Sign in");

	}

}