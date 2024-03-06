package com.Berluti;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.Berluti.genricUtils.BaseClass;
import com.Berluti.genricUtils.ExcelUtils;
import com.Berluti.genricUtils.FileUtils;
import com.Berluti.genricUtils.JavaUtils;
import com.Berluti.genricUtils.WebDriverUtils;

public class LoginTest extends BaseClass
{
public void loginTest() throws Throwable
{
	ExcelUtils eLib = new ExcelUtils();
	FileUtils fLib=new FileUtils();
	JavaUtils jLib=new JavaUtils();
	WebDriverUtils wLib=new WebDriverUtils();
	//WebDriver driver = new ChromeDriver();
	wLib.maximizeWindow(driver);
	wLib.waitForPageLoad(driver, 10);
	driver.get("https://www.berluti.com/en-int/homepage/");
	Actions act=new Actions(driver);
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Continue without accepting']")).click();
	driver.findElement(By.xpath("//span[text()='My Berluti Account']")).click();
	driver.findElement(By.xpath("//div[@id='sidebar-login']/descendant::button[@class='text-uppercase register-btn button btn-full btn-dark']")).click();
	driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_email']")).sendKeys("shardaraman6@gmail.com");
	WebElement pass=driver.findElement(By.xpath("//input[@id='dwfrm_profile_login_password_d0uegmmjbefj']"));
	//act.moveToElement(pass).click();
	pass.sendKeys("Raman@12345");
	driver.findElement(By.xpath("//button[@class='button btn-large btn-full btn-dark login-popin']")).click();
}
}//input[@id='dwfrm_login_password_d0cvetztqmco']
//button[@class='text-uppercase register-btn button btn-full btn-dark']/../../descendant::div[@class='text-uppercase register-btn button btn-full btn-dark']