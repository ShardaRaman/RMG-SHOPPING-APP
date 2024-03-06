package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsCategoryPage
{
	//declarization
@FindBy(xpath = "//a[@class='dropdown-toggle']/parent::li[@class='dropdown menu-item']/child::a[@href=\"sub-category.php?scid=6\"]")
private WebElement laptopLink;

@FindBy(xpath = "//button[@class='btn btn-primary']")
private WebElement addToCartButton;

@FindBy(xpath = "//i[@class='icon fa fa-heart']")
private WebElement wishlistLink;

//initialization
public ElectronicsCategoryPage (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


//utilization
public WebElement getLaptopLink() {
	return laptopLink;
}

public WebElement getAddToCartButton() {
	return addToCartButton;
}

public WebElement getWishlistLink() {
	return wishlistLink;
}



}
