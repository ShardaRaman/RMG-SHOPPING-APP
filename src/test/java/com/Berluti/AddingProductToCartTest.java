package com.Berluti;

import java.time.Duration;

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
import com.ObjectRepo.LoginPage;

public class AddingProductToCartTest extends BaseClass
{
	@Test
public void addingProductToCartTest() throws Throwable


{
		ExcelUtils eLib = new ExcelUtils();
		FileUtils fLib=new FileUtils();
		JavaUtils jLib=new JavaUtils();
		WebDriverUtils wLib=new WebDriverUtils();
	WebDriver driver = new ChromeDriver();
	
	wLib.waitForPageLoad(driver, 20);
	wLib.maximizeWindow(driver);
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//ExcelUtils
	ExcelUtils eu = new ExcelUtils();
	String BROWSER = eu.readDataFromExcelFile("TestData", 0, 1);
	String URL = eu.readDataFromExcelFile("TestData", 1, 1);
	String USERNAME = eu.readDataFromExcelFile("TestData", 2, 1);
	String PASSWORD = eu.readDataFromExcelFile("TestData", 3, 1);
	//fileUtils
	//FileUtils fu = new FileUtils();
	//String URL = fu.readDataFromPropertyFile("url");
	//String BROWSER = fu.readDataFromPropertyFile("browser");
	//String USERNAME = fu.readDataFromPropertyFile("username");
	//String PASSWORD = fu.readDataFromPropertyFile("password");
	driver.get(URL);
	Thread.sleep(4000);
	//login to the application
	LoginPage lp = new LoginPage(driver);
	lp.login(USERNAME, PASSWORD);
	// WebElement emailAddress = driver.findElement(By.id("exampleInputEmail1"));
	 //emailAddress.sendKeys(USERNAME);//shardaraman6@gmail.com
	 //WebElement passwordTextfeild = driver.findElement(By.id("exampleInputPassword1"));
	 //passwordTextfeild.sendKeys(PASSWORD);//Ram@123
	 //driver.findElement(By.xpath("//button[@name='login']")).click();
	 
	WebElement ElectronicItem = driver.findElement(By.xpath("//a[text()=' Electronics']"));
	ElectronicItem.click();
	Select select = new Select(ElectronicItem);
	System.out.println(select.getOptions());
	select.selectByIndex(1);
	WebElement hpLaptop = driver.findElement(By.xpath("//a[text()='HP Core i5 5th Gen']"));
	hpLaptop.click();
	String firstText = hpLaptop.getText();
	System.out.println(firstText);
	WebElement addToCart = driver.findElement(By.xpath("//a[text()=' ADD TO CART']"));
	addToCart.click();
	String alertText = driver.switchTo().alert().getText();
	System.out.println(alertText);
	driver.switchTo().alert().accept();
}
}
