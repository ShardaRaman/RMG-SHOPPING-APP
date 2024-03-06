package com.Berluti;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Berluti.genricUtils.ExcelUtils;
import com.Berluti.genricUtils.WebDriverUtils;

public class Login2Test 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		WebDriverUtils wu = new WebDriverUtils();
		wu.maximizeWindow(driver);
		ExcelUtils eu = new ExcelUtils();
		eu.readDataFromExcelFile("TestData", 1, 1);
	}
}
