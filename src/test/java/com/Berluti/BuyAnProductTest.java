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
import com.ObjectRepo.MyCartPage;

public class BuyAnProductTest extends BaseClass
{
	@Test
public void  buyAnProductTest() throws Throwable
{
		ExcelUtils eLib = new ExcelUtils();
		FileUtils fLib=new FileUtils();
		JavaUtils jLib=new JavaUtils();
		WebDriverUtils wLib=new WebDriverUtils();
	//WebDriver driver = new ChromeDriver();
	Thread.sleep(5000);
	
	wLib.waitForPageLoad(driver, 10);
	wLib.maximizeWindow(driver);
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//ExcelUtils
	
//	String BROWSER = eu.readDataFromExcelFile("TestData", 0, 1);
//	System.out.println(BROWSER);
	//String URL = eu.readDataFromExcelFile("TestData", 1, 1);
	//System.out.println(URL);
	String USERNAME = eLib.readDataFromExcelFile("Sheet1", 2, 1);
	System.out.println(USERNAME);
	String PASSWORD = eLib.readDataFromExcelFile("Sheet1", 3, 1);
	System.out.println(PASSWORD);
	String BILLINGADDRESS = eLib.readDataFromExcelFile("Sheet1", 10, 1);
	String BILLINGSTATE = eLib.readDataFromExcelFile("Sheet1", 11, 1);
	String BILLINGCITY = eLib.readDataFromExcelFile("Sheet1", 12, 1);
	String BILLINGPINCODE = eLib.readDataFromExcelFile("Sheet1", 13, 1);
	String SHIPPINGADDRESS = eLib.readDataFromExcelFile("Sheet1", 14, 1);
    String SHIPPINGSTATE = eLib.readDataFromExcelFile("Sheet1", 15, 1);
    String SHIPPINGCITY = eLib.readDataFromExcelFile("Sheet1", 16, 1);
	String SHIPPINGPINCODE = eLib.readDataFromExcelFile("Sheet1", 17, 1);
	
	//FileUtils fu = new FileUtils();
	//String BROWSER = fu.readDataFromPropertyFile("browser");
	//String URL = fu.readDataFromPropertyFile("url");
	//String USERNAME = fu.readDataFromPropertyFile("userName");
	//String PASSWORD = fu.readDataFromPropertyFile("password");
	//triggering the application
	//driver.get("http://rmgtestingserver/domain/Online_Shopping_Application/");

	//LoginPage lp = new LoginPage(driver);
	//lp.login(USERNAME, PASSWORD);
	//driver.findElement(By.xpath("//a[@href='login.php']")).click();
	//finding the textfeild and entering the data
	//driver.findElement(By.id("exampleInputEmail1")).sendKeys(USERNAME);
	//driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys(PASSWORD);
	//driver.findElement(By.xpath("//button[@name='login']")).click();
    //Thread.sleep(5000);
	WebElement ElectronicItem = driver.findElement(By.xpath("//a[text()=' Electronics']"));
	ElectronicItem.click();
	driver.findElement(By.xpath("//a[@href='sub-category.php?scid=6']")).click();

	WebElement hpLaptop = driver.findElement(By.xpath("//a[text()='HP Core i5 5th Gen']"));
	String firstText = hpLaptop.getText();
	System.out.println(firstText);
	hpLaptop.click();
	//WebDriverUtils wu = new WebDriverUtils();
	//wu.handleDropDown(ElectronicItem, 1);
	//Select select = new Select(ElectronicItem);
	//System.out.println(select.getOptions());
	//select.selectByIndex(1);
	//WebElement hpLaptop = driver.findElement(By.xpath("//a[text()='HP Core i5 5th Gen']"));
	//hpLaptop.click();
	//String firstText = hpLaptop.getText();
	MyCartPage mcp = new MyCartPage(driver);
	mcp.addToCart(driver, BILLINGADDRESS, BILLINGSTATE, BILLINGCITY, BILLINGPINCODE, SHIPPINGADDRESS, SHIPPINGSTATE, SHIPPINGCITY, SHIPPINGPINCODE );
	
	//WebElement addToCart = driver.findElement(By.xpath("//a[text()=' ADD TO CART']"));
	//addToCart.click();
	//String alertText = wb.getTextOfAlert(driver);
	//String alertText = driver.switchTo().alert().getText();
	//System.out.println(alertText);
	//wb.acceptAlert(driver);
	//driver.switchTo().alert().accept();
	//WebElement billingAddress = driver.findElement(By.xpath("//textarea[@name='billingaddress']"));
	//billingAddress.sendKeys("BTM");
	//WebElement billingState = driver.findElement(By.xpath("//input[@id='bilingstate']"));
	//billingState.sendKeys("Karnataka");
	//WebElement billingCity = driver.findElement(By.xpath("//input[@id='billingcity']"));
	//billingCity.sendKeys("Bangalore");
	//WebElement pinCode = driver.findElement(By.xpath("//input[@id='billingpincode']"));
	//pinCode.sendKeys("560076");
	//wb.acceptAlert(driver);
	//driver.switchTo().alert().accept();
	//WebElement updateShippingAddress = driver.findElement(By.xpath("//button[@name='update']"));
	//updateShippingAddress.click();
	//WebElement shippingAdress =  driver.findElement(By.xpath("//textarea[@name='shippingaddress']"));
	//shippingAdress.sendKeys("BTM");
	//WebElement shippingState = driver.findElement(By.xpath("//input[@id='shippingstate']"));
	//shippingState.sendKeys("Karnataka");
	//WebElement shippingCity = driver.findElement(By.xpath("//input[@id='shippingcity']"));
	//shippingCity.sendKeys("Bangalore");
	//WebElement shippingPincode = driver.findElement(By.xpath("//input[@id='shippingpincode']"));
	//shippingPincode.sendKeys("560076");
	//String text = wb.getTextOfAlert(driver);
	//System.out.println(text);
	
	//driver.switchTo().alert().getText();
	//wb.acceptAlert(driver);
	//String text = wb.getTextOfAlert(driver);
	//driver.switchTo().alert().accept();
	

}
}
