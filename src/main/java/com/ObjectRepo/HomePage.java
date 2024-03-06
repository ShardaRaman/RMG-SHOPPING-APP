package com.ObjectRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
//declaration
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginbtn;
	
	@FindBy(xpath = "//a[text()='My Cart']")
	private WebElement myCartbtn;
	
	@FindBy(xpath = "//a[text()='Wishlist']")
	private WebElement wishlistbtn;
	
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement myaccoubtbtn;
	
	@FindBy(xpath = "//span[text()='Track Order']")
	private WebElement tractOrderbtn;
	
	@FindBy(xpath = "//input[@name='product']")
	private WebElement searchBar;
	
	@FindBy(xpath = "//button[@name='search']")
	private WebElement searchbtn;
	
	@FindBy(xpath = "//a[@class='dropdown-toggle lnk-cart']")
	private WebElement cartLink;
	
	
	@FindBy(xpath = "//li[@class='active dropdown yamm-fw']")
	private WebElement homeLink;
	
	@FindBy(xpath = "//a[text()=' Electronics']")
	private WebElement electronicsLink;
	
	@FindBy(xpath = "//a[text()=' Fashion']")
	private WebElement fashionLink;
	
	@FindBy(xpath = "//a[text()=' KIDS']")
	private WebElement kidsLink;
	
	@FindBy(xpath = "//a[text()=' ornaments']")
	private WebElement ornamentsLink;
	
	@FindBy(xpath = "//a[text()=' Sport']")
	private WebElement sportLink;
	
	@FindBy(xpath = "//a[text()=' Bicycles']")
	private WebElement bicycleLink;
	
	@FindBy (xpath = "//i[@class='icon fa fa-sign-out']")
	private WebElement logoutLink;
	
	


	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	public WebElement getLogoutLink() {
		return logoutLink;
	}


	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getMyCartbtn() {
		return myCartbtn;
	}

	public WebElement getWishlistbtn() {
		return wishlistbtn;
	}

	public WebElement getMyaccoubtbtn() {
		return myaccoubtbtn;
	}

	public WebElement getTractOrderbtn() {
		return tractOrderbtn;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getCartLink() {
		return cartLink;
	}

	public WebElement getHomeLink() {
		return homeLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getFashionLink() {
		return fashionLink;
	}

	public WebElement getKidsLink() {
		return kidsLink;
	}

	public WebElement getOrnamentsLink() {
		return ornamentsLink;
	}

	public WebElement getSportLink() {
		return sportLink;
	}

	public WebElement getBicycleLink() {
		return bicycleLink;
	}
	
// business logic
	
	
	
	
}
