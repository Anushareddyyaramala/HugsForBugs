package com.HugsForBugs.BaseClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.HugsForBugs.utils.JavaUtility;
import com.HugsForBugs.utils.LogUtility;
import com.HugsForBugs.utils.PropertyFileUtility;
import com.HugsForBugs.utils.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected WebDriverUtility wLib = new WebDriverUtility();
	JavaUtility jLib = new JavaUtility();
	protected PropertyFileUtility plib=new PropertyFileUtility();
	LogUtility log=new LogUtility();
	public WebDriver driver =null;
	public static WebDriver sdriver;
	


	@Parameters("BROWSER")
	@BeforeClass
	public void bcConfig(String BROWSER) throws IOException
	{
      	//String BROWSER1 = plib.readDataFromPropertyFile("Browser");
		
		
		
		if(BROWSER.equalsIgnoreCase("CHROME"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Reporter.log("--Browser "+BROWSER+" launched successfully--",true);
//			driver.get(URL);
		}
		else if(BROWSER.equalsIgnoreCase("FIREFOX"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			Reporter.log("--Browser "+BROWSER+" launched successfully--",true);
			
		}
		else if(BROWSER.equalsIgnoreCase("EDGE"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			Reporter.log("--Browser "+BROWSER+" launched successfully--",true);
		}
		else
		{
			System.out.println("invalid browser");
		}
		
		sdriver = driver;
		wLib.maximiseWindow(driver);
		wLib.waitForElementsToLoadInDOM(driver);
         
        
	}
	@BeforeMethod
	public void launch() throws IOException {
		String URL = plib.readDataFromPropertyFile("Url");
		driver.get(URL);
        log.info("url launched");
        WebElement signin=driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
        wLib.mouseHoverOn(driver, signin);
        driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	}
	
	public void amConfig()
{
		Reporter.log("--Signout successfull--", true);
	}
	
	@AfterMethod
	public void acConfig()
	{
		driver.close();
		Reporter.log("--browser closed successfull--", true);
		log.info("Browser closed ");
	}

}
