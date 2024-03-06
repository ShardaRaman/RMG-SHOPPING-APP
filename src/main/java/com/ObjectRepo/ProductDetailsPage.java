package com.ObjectRepo;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage
{
	@FindBy(xpath = "//i[@class='fa fa-heart']")
	private WebElement wishlist;
	
	@FindBy(xpath = "//i[@class='fa fa-shopping-cart inner-right-vs']")
	private WebElement addToCart;
	
	@FindBy(xpath = "//i[@class='icon fa fa-sort-asc']")
	private WebElement increaseItem;
	
	@FindBy(xpath = "//i[@class='icon fa fa-sort-desc']")
	private WebElement decreaseItem;
	
	@FindBy (xpath = "//a[text()='REVIEW']")
	private WebElement reviewLink;
	
	@FindBy (xpath = "//a[text()='DESCRIPTION']")
	private WebElement descriptionLink;
	
	@FindBy (xpath = "//table[@class='table table-bordered']/tbody/tr[1]/td[2]")
	private  WebElement qualityRating1;
	
	@FindBy (xpath = "//table[@class='table table-bordered']/tbody/tr[1]/td[3]")
	private  WebElement qualityRating2;
	
	@FindBy (xpath = "//table[@class='table table-bordered']/tbody/tr[1]/td[4]")
	private  WebElement qualityRating3;
	
	@FindBy (xpath = "//table[@class='table table-bordered']/tbody/tr[1]/td[5]")
	private  WebElement qualityRating4;
	
	@FindBy (xpath = "//table[@class='table table-bordered']/tbody/tr[1]/td[6]")
	private  WebElement qualityRating5;
	
	@FindBy (xpath = "//table[@class='table table-bordered']/tbody/tr[2]/td[2]")
	private WebElement priceRating1;
	
	@FindBy (xpath = "//table[@class='table table-bordered']/tbody/tr[2]/td[3]")
	private WebElement priceRating2;
	
	@FindBy (xpath = "//table[@class='table table-bordered']/tbody/tr[2]/td[4]")
	private WebElement priceRating3;
	
	@FindBy (xpath = "//table[@class='table table-bordered']/tbody/tr[2]/td[5]")
	private WebElement priceRating4;
	
	@FindBy (xpath = "//table[@class='table table-bordered']/tbody/tr[2]/td[6]")
	private WebElement priceRating5;
	
	@FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr[3]/td[2]")
	private WebElement valueRating1;
	
	@FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr[3]/td[3]")
	private WebElement valueRating2;
	
	@FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr[3]/td[4]")
	private WebElement valueRating3;
	
	@FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr[3]/td[5]")
	private WebElement valueRating4;
	
	@FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr[3]/td[6]")
	private WebElement valueRating5;
	
	@FindBy(xpath = "//input[@id='exampleInputName']")
	private WebElement yourNameTextfeild;
	
	@FindBy(xpath = "//input[@id='exampleInputSummary']")
	private WebElement summaryTextfeild ;
	
	@FindBy(xpath = "//textarea[@id='exampleInputReview']")
	private WebElement reviewTextfeild;
	
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement submitReviewButton;
	
	//initialization
	public ProductDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	//utilization
	public WebElement getWishlist() {
		return wishlist;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getIncreaseItem() {
		return increaseItem;
	}

	public WebElement getDecreaseItem() {
		return decreaseItem;
	}

	public WebElement getReviewLink() {
		return reviewLink;
	}

	public WebElement getDescriptionLink() {
		return descriptionLink;
	}

	public WebElement getQualityRating1() {
		return qualityRating1;
	}

	public WebElement getQualityRating2() {
		return qualityRating2;
	}

	public WebElement getQualityRating3() {
		return qualityRating3;
	}

	public WebElement getQualityRating4() {
		return qualityRating4;
	}

	public WebElement getQualityRating5() {
		return qualityRating5;
	}

	public WebElement getPriceRating1() {
		return priceRating1;
	}

	public WebElement getPriceRating2() {
		return priceRating2;
	}

	public WebElement getPriceRating3() {
		return priceRating3;
	}

	public WebElement getPriceRating4() {
		return priceRating4;
	}

	public WebElement getPriceRating5() {
		return priceRating5;
	}

	public WebElement getValueRating1() {
		return valueRating1;
	}

	public WebElement getValueRating2() {
		return valueRating2;
	}

	public WebElement getValueRating3() {
		return valueRating3;
	}

	public WebElement getValueRating4() {
		return valueRating4;
	}

	public WebElement getValueRating5() {
		return valueRating5;
	}

	public WebElement getYourNameTextfeild() {
		return yourNameTextfeild;
	}

	public WebElement getSummary() {
		return summaryTextfeild;
	}

	public WebElement getReview() {
		return reviewTextfeild;
	}

	public WebElement getSubmitReview() {
		return submitReviewButton;
	}
	//business logic
	public void review(String name, String summary, String review)
	{
		reviewLink.click();
		qualityRating5.click();
		priceRating4.click();
		valueRating4.click();
		yourNameTextfeild.sendKeys(name);
		summaryTextfeild.sendKeys(summary);
		reviewTextfeild.sendKeys(review);
		submitReviewButton.click();
		reviewLink.click();
	}
	
}
