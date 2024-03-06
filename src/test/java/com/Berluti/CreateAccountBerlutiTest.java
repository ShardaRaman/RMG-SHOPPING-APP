package com.Berluti;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountBerlutiTest {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.berluti.com/en-int/homepage/");
		driver.findElement(By.xpath("//button[text()='Continue without accepting']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='sidebar-btn-wrap']")).click();
		// input[@id='dwfrm_profile_customer_email']
		WebElement createAccount = driver.findElement(By.xpath(
				"//div[@class='join-club sidebar-asset text-center']/descendant::button[@class='text-uppercase register-btn button btn-full btn-dark']"));
		createAccount.click();
		WebElement emailTextfeild = driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_email']"));
		emailTextfeild.sendKeys("shardaraman7@gmail.com");
		WebElement passWordTextfeild = driver
				.findElement(By.xpath("//input[@class='input-text   required show-pass-input']"));
		passWordTextfeild.sendKeys("Raman@12345");

		WebElement createAccountButton = driver
				.findElement(By.xpath("//button[@class='button btn-full btn-dark btn-large step1-btn']"));
		createAccountButton.click();
		WebElement title = driver.findElement(By.xpath("//select[@class='input-select   required title-select']"));
		title.click();
		Select sel = new Select(title);
		sel.selectByVisibleText("Mr");
		WebElement firstNameTextfeild = driver.findElement(By.id("dwfrm_profile_customer_firstname"));
		firstNameTextfeild.sendKeys("Sharda");
		WebElement lastNameTextfeild = driver.findElement(By.id("dwfrm_profile_customer_lastname"));
		lastNameTextfeild.sendKeys("Raman");
		WebElement regionCode = driver
				.findElement(By.xpath("//select[@class='input-select phone-group-notrequired ']"));

		Select select = new Select(regionCode);
		select.selectByValue("IN");
		WebElement mobileNumberTextfeild = driver
				.findElement(By.xpath("//input[@id='dwfrm_profile_customer_phoneinput']"));
		mobileNumberTextfeild.sendKeys("7894561230");
		WebElement nextButton = driver
				.findElement(By.xpath("//button[@class='button btn-full btn-dark btn-large step2-btn']"));
		nextButton.click();
		nextButton.click();
		WebElement nationality = driver
				.findElement(By.xpath("//select[@id='dwfrm_profile_customer_nationalities_nationality']"));
		Select select1 = new Select(nationality);
		select1.selectByValue("IND");
		WebElement shippingRegion = driver.findElement(By.id("dwfrm_profile_customer_countries_country"));
		
		Select select2 = new Select(shippingRegion);
		select2.selectByValue("IND");
		WebElement createAnAccountButton = driver
				.findElement(By.xpath("//button[@class='g-recaptcha button btn-full btn-dark btn-large step3-btn']"));
		Thread.sleep(2000);
		createAnAccountButton.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='username']")).click();
		driver.manage().window().minimize();
		

	}
}
