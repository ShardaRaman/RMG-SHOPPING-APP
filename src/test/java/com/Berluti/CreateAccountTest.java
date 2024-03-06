package com.Berluti;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Berluti.genricUtils.BaseClass;
import com.Berluti.genricUtils.ExcelUtils;
import com.Berluti.genricUtils.FileUtils;
import com.Berluti.genricUtils.JavaUtils;
import com.Berluti.genricUtils.WebDriverUtils;
import com.ObjectRepo.LoginPage;

public class CreateAccountTest extends BaseClass
{
	@Test
public void  createAccountTest() throws Throwable  
{
		ExcelUtils eLib = new ExcelUtils();
		FileUtils fLib=new FileUtils();
		JavaUtils jLib=new JavaUtils();
		WebDriverUtils wLib=new WebDriverUtils();
	//WebDriver driver = new ChromeDriver();
	
	wLib.waitForPageLoad(driver, 20);
	wLib.maximizeWindow(driver);
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//ExcelUtils
		
		String BROWSER = eLib.readDataFromExcelFile("TestData", 0, 1);
		String URL = eLib.readDataFromExcelFile("TestData", 1, 1);
		String USERNAME = eLib.readDataFromExcelFile("TestData", 2, 1);
		String PASSWORD = eLib.readDataFromExcelFile("TestData", 3, 1);
		String EMAILID = eLib.readDataFromExcelFile("TestData", 4, 1);
		String CONTACTNO = eLib.readDataFromExcelFile("TestData", 5, 1);
		String PASSWORD2 = eLib.readDataFromExcelFile("TestData", 6, 1);
		//FileUtils fu = new FileUtils();
		//String BROWSER = fu.readDataFromPropertyFile("browser");
		//String URL = fu.readDataFromPropertyFile("url");
		//String USERNAME = fu.readDataFromPropertyFile("userName");
		//String PASSWORD = fu.readDataFromPropertyFile("password");
		//triggering the application

	//triggering the application
	//driver.get("http://rmgtestingserver/domain/Online_Shopping_Application/login.php");
	LoginPage lp = new LoginPage(driver);
	lp.createAccount(USERNAME, EMAILID, CONTACTNO, PASSWORD, PASSWORD2);
	//WebElement loginButton = driver.findElement(By.xpath("//i[@class='icon fa fa-sign-in']"));
	//loginButton.click();
	//finding the fullname textfeild and enter the data
	//WebElement nameTextFeild = driver.findElement(By.id("fullname"));
	//nameTextFeild.sendKeys("USERNAME");
	//finding the email textfeild and entering the data
	//WebElement emailId = driver.findElement(By.id("email"));
	//emailId.sendKeys("EMAILID");
	//finding the contact details textfeild and entering the value
	//WebElement contactNumber = driver.findElement(By.id("contactno"));
	//contactNumber.sendKeys("CONTACTNO");
	//finding the password textfeild and entering the value
	//WebElement passwordTextfeild = driver.findElement(By.id("password"));
	//passwordTextfeild.sendKeys("PASSWORD2");
	//finding the confirm password textfeild and entering the value
	//WebElement confirmTextfeild = driver.findElement(By.id("confirmpassword"));
	//confirmTextfeild.sendKeys("PASSWORD2");
	
	//driver.findElement(By.id("submit")).click();
	
	
}
}
