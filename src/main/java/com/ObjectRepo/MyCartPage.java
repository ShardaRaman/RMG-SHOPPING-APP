package com.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Berluti.genricUtils.WebDriverUtils;

public class MyCartPage extends WebDriverUtils
{
	//declaration
		@FindBy(xpath = "//a[@class='btn btn-primary' and text()=' ADD TO CART']")
		private WebElement AddToCartbtn;
		
		@FindBy(xpath = "//input[@name='remove_code[]']")
		private WebElement removeCheckBox;
		
		@FindBy(xpath = "//a[text()='Continue Shopping']")
		private WebElement continueShopping;
		
		@FindBy(xpath = "//input[@name='submit']")
		private WebElement updateShoppingCart;
		
		@FindBy(xpath = "//textarea[@name='billingaddress']")
		private WebElement billingAddress;
		
		@FindBy(xpath = "//input[@id='bilingstate']")
		private WebElement billingState;
		
		@FindBy(xpath = "//input[@id='billingcity']")
		private WebElement billingCity;
		
		@FindBy(xpath = "//input[@id='billingpincode']")
		private WebElement billingPincode;
		
		@FindBy(xpath = "//button[@name='update']")
		private WebElement billingAddressUpdate;
		
		@FindBy(xpath = "//textarea[@name='shippingaddress']")
		private WebElement shippingAddress;
		
		@FindBy(xpath = "//input[@id='shippingstate']")
		private WebElement shippingState;
		
		@FindBy(xpath = "//input[@id='shippingcity']")
		private WebElement shippingCity;
		
		@FindBy(xpath = "//input[@id='shippingpincode']")
		private WebElement shippingPincode;
		
		@FindBy(xpath = "//button[@name='shipupdate']")
		private WebElement shippingUpdatebtn;
		
		@FindBy(xpath = "//button[.='PROCCED TO CHEKOUT']")
		private WebElement proceedToCheckOutbtn;
		
		@FindBy(xpath = "//input[@name='submit']")
		private WebElement paymentSubmitbtn;
		
		public WebElement getPaymentSubmitbtn() {
			return paymentSubmitbtn;
		}

		public void setPaymentSubmitbtn(WebElement paymentSubmitbtn) {
			this.paymentSubmitbtn = paymentSubmitbtn;
		}

		//initialization
		public MyCartPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//utilization
		public WebElement getAddToCartbtn() {
			return AddToCartbtn;
		}

		public WebElement getRemoveCheckBox() {
			return removeCheckBox;
		}

		public WebElement getContinueShopping() {
			return continueShopping;
		}

		public WebElement getUpdateShoppingCart() {
			return updateShoppingCart;
		}

		public WebElement getBillingAddress() {
			return billingAddress;
		}

		public WebElement getBillingState() {
			return billingState;
		}

		public WebElement getBillingCity() {
			return billingCity;
		}

		public WebElement getBillingPincode() {
			return billingPincode;
		}

		public WebElement getBillingAddressUpdate() {
			return billingAddressUpdate;
		}

		public WebElement getShippingAddress() {
			return shippingAddress;
		}

		public WebElement getShippingState() {
			return shippingState;
		}

		public WebElement getShippingCity() {
			return shippingCity;
		}

		public WebElement getShippingPincode() {
			return shippingPincode;
		}

		public WebElement getShippingUpdatebtn() {
			return shippingUpdatebtn;
		}

		public WebElement getProceedToCheckOutbtn() {
			return proceedToCheckOutbtn;
		}
		
		public void addToCart(WebDriver driver, String BillingAddress, String BillingState, String BillingCity, String Pincode, String ShippingAddress, String ShippingState, String ShippingCity, String ShippingPincode )
	{
			AddToCartbtn.click();
			WebDriverUtils wb = new WebDriverUtils();
			wb.acceptAlert(driver);
			//billingAddress.clear();
			billingAddress.sendKeys(BillingAddress);
			//billingState.clear();
			billingState.sendKeys(BillingState);
			//billingCity.clear();
			billingCity.sendKeys(BillingCity);
			//billingPincode.clear();
			billingPincode.sendKeys(Pincode);
			billingAddressUpdate.click();
			wb.acceptAlert(driver);
			//shippingAddress.clear();
			shippingAddress.sendKeys(ShippingAddress);
			//shippingState.clear();
			shippingState.sendKeys(ShippingState);
			//shippingCity.clear();
			shippingCity.sendKeys(ShippingCity);
			//shippingPincode.clear();
			shippingPincode.sendKeys(ShippingPincode);
			shippingUpdatebtn.click();
			wb.acceptAlert(driver);
			proceedToCheckOutbtn.click();
			//wb.acceptAlert(driver);
			paymentSubmitbtn.click();
		
		}
		
		
		
		
		
}
