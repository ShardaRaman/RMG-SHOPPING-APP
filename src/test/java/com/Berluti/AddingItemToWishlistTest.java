package com.Berluti;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Berluti.genricUtils.BaseClass;
import com.Berluti.genricUtils.ExcelUtils;
import com.Berluti.genricUtils.FileUtils;
import com.Berluti.genricUtils.JavaUtils;
import com.Berluti.genricUtils.WebDriverUtils;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.LoginPage;

public class AddingItemToWishlistTest extends BaseClass
{
	@Test
	public void addingItemToWishlistTest() throws Throwable
	{
		
		//OBJECT OF GENRIC  CLASSES
		//ExcelUtils eLib = new ExcelUtils();
		//FileUtils fLib=new FileUtils();
		//JavaUtils jLib=new JavaUtils();
		//WebDriverUtils wLib=new WebDriverUtils();
		
	//WebDriver driver = new ChromeDriver();
	//MAXIMIZE
	//wLib.maximizeWindow(driver);
	
	
	//implicit wait
	//wLib.waitForPageLoad(driver, 10);
	//triggering the application
	
	//FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
	//Properties pobj = new Properties();
	//pobj.load(fis);
	//String BROWSER = pobj.getProperty("browser");
	//String URL = pobj.getProperty("url");
	//String USERNAME = pobj.getProperty("username");
	 //String PASSWORD = pobj.getProperty("password");
	
	//creating object for ExcelUtils
	//ExcelUtils eLib = new ExcelUtils();
	//String Browser = eLib.readDataFromExcelFile("TestData", 0, 1);
	//String URL = eLib.readDataFromExcelFile("TestData", 1, 1);
	//String USERNAME = eLib.readDataFromExcelFile("TestData", 2, 1);
	//String PASSWORD = eLib.readDataFromExcelFile("TestData", 3, 1);
	
	
	//creating object for FileUtils
	
	//FileUtils fu = new FileUtils();
	//String BROWSER = fu.readDataFromPropertyFile("browser");
	//String URL = fu.readDataFromPropertyFile("url");
	//System.out.println(URL);
	//String USERNAME = fu.readDataFromPropertyFile("userName");
	//System.out.println(USERNAME);
	//String PASSWORD = fu.readDataFromPropertyFile("password");
		//driver.get(URL);
		LoginPage lp = new LoginPage(driver);
//		lp.login(USERNAME, PASSWORD);
		//driver.findElement(By.xpath("//a[@href='login.php']")).click();
		//finding the textfeild and entering the data
		//driver.findElement(By.id("exampleInputEmail1")).sendKeys(USERNAME);
		//driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys(PASSWORD);
		//driver.findElement(By.xpath("//button[@name='login']")).click();

	//finding the electronics items
		HomePage hp = new HomePage(driver);
	WebElement ElectronicItem = driver.findElement(By.xpath("//a[text()=' Electronics']"));
	ElectronicItem.click();
	//selecting one option out of multiple options
	
	//wb.handleDropDown(ElectronicItem, 1);
	driver.findElement(By.xpath("//a[@href='sub-category.php?scid=6']")).click();

	WebElement hpLaptop = driver.findElement(By.xpath("//a[text()='HP Core i5 5th Gen']"));
	String firstText = hpLaptop.getText();
	hpLaptop.click();
	//String firstText = hpLaptop.getText();
	System.out.println(firstText);
	WebElement wishlistIcon = driver.findElement(By.xpath("//div[@class='favorite-button m-t-10']/child::a"));
	wishlistIcon.click();
	WebElement wishListedItem = driver.findElement(By.xpath("//a[@href='product-details.php?pid=13']"));
	String secondText = wishListedItem.getText();
	System.out.println(secondText);
	if(firstText.equalsIgnoreCase(secondText))
	{
	System.out.println("pass");	
	}
	else
	{
		System.out.println("fail");
	}
	}

}
