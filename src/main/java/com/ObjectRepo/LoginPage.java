package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
  //declaration
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginLink;
	
	@FindBy(xpath = "//input[@id='exampleInputEmail1']")
	private WebElement loginEmailTextfeild;
	
	@FindBy(xpath = "//input[@id='exampleInputPassword1']")
	private WebElement loginPasswordTextfeild;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//input[@id='fullname']")
	private WebElement createAccountFullName;
	
	@FindBy(xpath ="//input[@id='email']")
	private WebElement createAccountEmailTextfeild;
	
	@FindBy(xpath ="//input[@id='contactno']")
	private WebElement createAccountContactNumberTextFeild;
	
	@FindBy(xpath ="//input[@id='password']")
	private WebElement createAccountPasswordTextfeild;
	
	@FindBy(xpath ="//input[@id='confirmpassword']")
	private WebElement createAccountConfirmPassword;
	
	@FindBy(xpath = "//button[@id='submit']")
	private WebElement signUpbtn;

	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	public WebElement getLoginEmailTextfeild() {
		return loginEmailTextfeild;
	}

	public WebElement getLoginPasswordTextfeild() {
		return loginPasswordTextfeild;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getCreateAccountFullName() {
		return createAccountFullName;
	}

	public WebElement getCreateAccountEmailTextfeild() {
		return createAccountEmailTextfeild;
	}

	public WebElement getCreateAccountContactNumberTextFeild() {
		return createAccountContactNumberTextFeild;
	}

	public WebElement getCreateAccountPasswordTextfeild() {
		return createAccountPasswordTextfeild;
	}

	public WebElement getCreateAccountConfirmPassword() {
		return createAccountConfirmPassword;
	}

	public WebElement getSignUpbtn() {
		return signUpbtn;
	}
	
	//business libraries
	public void login(String Username , String Password)
	{
		loginLink.click();
		loginEmailTextfeild.sendKeys(Username);
		loginPasswordTextfeild.sendKeys(Password);
		loginBtn.click();
	}

	public void createAccount(String Username, String Email, String Contactnumber, String Password, String ConfirmPassword) 
	{
		loginLink.click();
		createAccountFullName.sendKeys(Username);
		createAccountEmailTextfeild.sendKeys(Email);
		createAccountContactNumberTextFeild.sendKeys(Contactnumber);
		createAccountPasswordTextfeild.sendKeys(Password);
		createAccountConfirmPassword.sendKeys(ConfirmPassword);
		signUpbtn.click();
	}
}
