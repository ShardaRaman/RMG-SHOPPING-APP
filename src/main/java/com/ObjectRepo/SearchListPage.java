package com.ObjectRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class SearchListPage {
		
		//declaration
		@FindBy(xpath="//a[@title='Wishlist']")
		private WebElement AddToWishlistInSearch;
		
		@FindBy(xpath="//button[.='Add to cart']")
		private WebElement AddTocartInSearch;
		
		//Initialization
		
		public SearchListPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//Utilization
		public WebElement getAddToWishlistInSearch() {
			return AddToWishlistInSearch;
		}
		
		public WebElement getAddTocartInSearch() {
			return AddTocartInSearch;
		}
		
		

		
		

	
}


