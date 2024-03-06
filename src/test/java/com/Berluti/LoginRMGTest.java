package com.Berluti;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Berluti.genricUtils.BaseClass;
import com.Berluti.genricUtils.ExcelUtils;
import com.Berluti.genricUtils.WebDriverUtils;
import com.ObjectRepo.LoginPage;

public class LoginRMGTest extends BaseClass 
{
	@Test
public void loginRMGTest() throws Throwable 
{
	//WebDriver driver = new ChromeDriver();
	WebDriverUtils wb=new WebDriverUtils();
	wb.waitForPageLoad(driver, 10);
	wb.maximizeWindow(driver);
	//using ExcelUtils
	ExcelUtils eu = new ExcelUtils();
	String BROWSER = eu.readDataFromExcelFile("TestData", 0, 1);
	String URL = eu.readDataFromExcelFile("TestData", 1, 1);
	String USERNAME = eu.readDataFromExcelFile("TestData", 2, 1);
	String PASSWORD = eu.readDataFromExcelFile("TestData", 3, 1);
	//String EMAILID = eu.readDataFromExcelFile("TestData", 4, 1);
	//String CONTACTNO = eu.readDataFromExcelFile("TestData", 5, 1);
	//String PASSWORD2 = eu.readDataFromExcelFile("TestData", 6, 1);
	
	//using fileUtils
	
	//FileUtils fu = new FileUtils();
	//FileInputStream fis = new FileInputStream("src\\test\\resources\\CommonData.properties");
	//Properties pobj = new Properties();
	//pobj.load(fis);
	//String browser = pobj.getProperty("browser");
	//System.out.println(browser);
	//String URL = pobj.getProperty("url");
	//String USERNAME = pobj.getProperty("username");
	//String PASSWORD = pobj.getProperty("password");
	//triggering the application
	driver.get(URL);
	LoginPage lp = new LoginPage(driver);
	lp.login(USERNAME, PASSWORD);
	//driver.findElement(By.xpath("//a[@href='login.php']")).click();
	//finding the textfeild and entering the data
	//driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys(USERNAME);
	//driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys(PASSWORD);
	//driver.findElement(By.xpath("//button[@name='login']")).click();
}
}
