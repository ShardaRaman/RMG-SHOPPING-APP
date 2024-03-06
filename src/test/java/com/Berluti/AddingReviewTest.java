package com.Berluti;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Berluti.genricUtils.BaseClass;
import com.Berluti.genricUtils.ExcelUtils;
import com.Berluti.genricUtils.FileUtils;
import com.Berluti.genricUtils.JavaUtils;
import com.Berluti.genricUtils.WebDriverUtils;
import com.ObjectRepo.LoginPage;
import com.ObjectRepo.ProductDetailsPage;

public class AddingReviewTest extends BaseClass 
{
	@Test	
public  void  addingReviewTest() throws Throwable
{
	 String username ="Sharda";
	//WebDriver driver = new ChromeDriver();
	ExcelUtils eLib = new ExcelUtils();
	FileUtils fLib=new FileUtils();
	JavaUtils jLib=new JavaUtils();
	WebDriverUtils wLib=new WebDriverUtils();
	wLib.waitForPageLoad(driver, 20);
	wLib.maximizeWindow(driver);
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	Thread.sleep(6000);
	//ExcelUtils
	
	String BROWSER = eLib.readDataFromExcelFile("TestData", 0, 1);
	String URL = eLib.readDataFromExcelFile("TestData", 1, 1);
	String USERNAME = eLib.readDataFromExcelFile("TestData", 2, 1);
	String PASSWORD = eLib.readDataFromExcelFile("TestData", 3, 1);
	String NAME = eLib.readDataFromExcelFile("TestData", 7, 1);
	String SUMMARY = eLib.readDataFromExcelFile("TestData", 8, 1);
	String REVIEW = eLib.readDataFromExcelFile("TestData", 9, 1);
	//FileUtils
	//FileUtils fu = new FileUtils();
	//String USERNAME = fu.readDataFromPropertyFile("username");
	//String PASSWORD = fu.readDataFromPropertyFile("password");
	//String BROWSER = fu.readDataFromPropertyFile("browser");
	//String URL = fu.readDataFromPropertyFile("url");
	//triggering the url
	//driver.get(URL);
	//WebElement login = driver.findElement(By.xpath("//a[@href='login.php']"));
	//login.click();
	LoginPage lp = new LoginPage(driver);
	lp.getLoginBtn().click();
	lp.login(USERNAME, PASSWORD);
	//login to the application
	//WebElement email = driver.findElement(By.xpath("//input[@id='exampleInputEmail1']"));
	//email.sendKeys(USERNAME);// anuj.lpu1@gmail.com
	//WebElement password = driver.findElement(By.xpath("//input[@id='exampleInputPassword1']"));
	//password.sendKeys(PASSWORD);//Test@123
	//WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
	//loginButton.click();
	//finding the electronics category
	WebElement electronics = driver.findElement(By.xpath("//a[text()=' Electronics']"));
	electronics.click();
	
	//finding the laptop in electronics category
	WebElement laptop = driver.findElement(By.xpath("//a[@href='sub-category.php?scid=6']"));
	laptop.click();
	//finding the lenevo laptop
	WebElement lenovoLaptop = driver.findElement(By.xpath("//a[text()='Lenovo Ideapad 110 APU Quad Core A6 6th Gen']"));
	lenovoLaptop.click();
	//finding the review 
	ProductDetailsPage pd = new ProductDetailsPage(driver);
	pd.review(NAME, SUMMARY, REVIEW);
	//WebElement review = driver.findElement(By.xpath("//a[text()='REVIEW']"));
	//wait.until(ExpectedConditions.elementToBeClickable(review));
	//review.click();
	//WebElement quality = driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr[1]/td[5]"));
	//quality.click();
	//WebElement price = driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr[2]/td[5]"));
	//price.click();
	//WebElement value = driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr[3]/td[5]"));
	//value.click();
	//WebElement name = driver.findElement(By.xpath("//input[@id='exampleInputName']"));
	//name.sendKeys("Sharda");
	//WebElement summary = driver.findElement(By.xpath("//input[@id='exampleInputSummary']"));
	//summary.sendKeys("Good");
	//WebElement review1 = driver.findElement(By.xpath("//input[@name='review']"));
	//wait.until(ExpectedConditions.elementToBeClickable(review1));
	//review1.sendKeys("Good");
	//Robot r = new Robot();
	//r.keyPress(KeyEvent.VK_TAB);
	//driver.switchTo().activeElement().sendKeys("Good");
	
	//WebElement submitButton = driver.findElement(By.xpath("//button[@name='submit']"));
	//submitButton.click();
	//driver.findElement(By.xpath("//a[text()='REVIEW']")).click();
	
	//WebElement customerName = driver.findElement(By.xpath("//h4[@class='title']/parent::div[@class='product-reviews']/descendant::span[@class='name']"));
	WebElement customerName = driver.findElement(By.xpath("//span[text()='2024-02-19 12:12:12']/ancestor::div[@class='product-reviews']/descendant::span[@class='name']"));
	String customer = customerName.getText();
	System.out.println(customer);
	//verifing the test
	if(customer.equalsIgnoreCase(username))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}

}
}
