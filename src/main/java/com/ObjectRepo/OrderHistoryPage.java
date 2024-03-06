package com.ObjectRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrderHistoryPage 
{
	//declaration

		@FindBy(xpath="//table[@class='table table-bordered']/tbody/tr/td[10]")
		private WebElement TrackOrder;
		
		//Initialization
		
		public OrderHistoryPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		

		//Utilization
		
		public WebElement getTrackOrder() {
			return TrackOrder;
		}
		
		
		

	}

