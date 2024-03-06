package com.Berluti.genricUtils;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.ObjectRepo.HomePage;
import com.ObjectRepo.LoginPage;

public class BaseClass 
{
public DataBaseUtils dLib = new DataBaseUtils();
public ExcelUtils eLib = new ExcelUtils();
public FileUtils fLib = new FileUtils();
public JavaUtils jLib = new JavaUtils();
public WebDriverUtils wLib = new WebDriverUtils();
public WebDriver driver;
@BeforeSuite
public void connectToDB() throws SQLException
{
	dLib.connectToDataBase();
	System.out.println("--Connect to Database--");
	}
@BeforeClass
public void launchBrowser() throws Throwable
{
	String BROWSER = fLib.readDataFromPropertyFile("browser");
	String URL = fLib.readDataFromPropertyFile("url");
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		driver = new ChromeDriver();
	}
	else if (BROWSER.equalsIgnoreCase("firefox"))
	{
		driver = new FirefoxDriver();
	}
	else if(BROWSER.equalsIgnoreCase("edge"))
	{
		driver = new EdgeDriver();
	}
	else
	{
		System.out.println("---Invalid Browser---");
	}
	wLib.maximizeWindow(driver);
	wLib.waitForPageLoad(driver, 10);
	driver.get(URL);
	System.out.println("URL Triggered");
}
@BeforeMethod
public void loginToApplication() throws Throwable
{
String UserName = fLib.readDataFromPropertyFile("username");
String Password = fLib.readDataFromPropertyFile("password");
HomePage hp=new HomePage(driver);
hp.getLoginbtn().click();
LoginPage lp = new LoginPage(driver);
lp.login(UserName, Password);
System.out.println("Logged in Sucessfully");

}
//@AfterMethod
//public void logoutFromApplication()
//{
//HomePage hp = new HomePage(driver)	;
//hp.getLogoutLink().click();
//System.out.println("LoggedOut Successfully");
//}
//@AfterClass
//public void closeBrowser()
//{
//	driver.quit();
//}
}
