package com.ObjectRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage 
{
        //declaration
		
		@FindBy(xpath="//input[@value=\"COD\"]")
		private WebElement CODRadio;
		
		
		@FindBy(xpath="//input[@value=\"Internet Banking\"]")
		private WebElement InternetBankingRadio;
		
		@FindBy(xpath="//input[@name=\"submit\"]")
		private WebElement CardRadio;
		
		@FindBy(xpath="//input[@name=\"submit\"]")
		private WebElement Submit;
		
		//Initialization
		public PaymentPage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}


		//Utilization
		
		public WebElement getCODRadio() 
		{
			return CODRadio;
		}

}