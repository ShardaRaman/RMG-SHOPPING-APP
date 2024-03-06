package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishlistPage 
{
	//declaration
	@FindBy(xpath = "//a[@class='btn-upper btn btn-primary']")
	private WebElement addToCart;
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement canclebtn;
	
	@FindBy(xpath = "//i[@class='icon fa fa-heart']")
	private WebElement heartBtn;
	
	//initialization
	public MyWishlistPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	//utilizaion
	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getCanclebtn() {
		return canclebtn;
	}

	public WebElement getHeartBtn() {
		return heartBtn;
	}
	
	
}
