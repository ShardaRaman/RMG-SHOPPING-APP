package com.Berluti;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.PropertyUtils;

import com.Berluti.genricUtils.BaseClass;
import com.Berluti.genricUtils.ExcelUtils;
import com.Berluti.genricUtils.FileUtils;
import com.Berluti.genricUtils.JavaUtils;
import com.Berluti.genricUtils.WebDriverUtils;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.LoginPage;
import com.ObjectRepo.MyCartPage;
import com.ObjectRepo.PaymentPage;
import com.ObjectRepo.ProductDetailsPage;



public class UseTrackOrderTest extends BaseClass
{
	@Test
	public void useTrackOrderTest() throws Throwable
	{
			
					//Create object of genric
					ExcelUtils eLib = new ExcelUtils();
					FileUtils fLib=new FileUtils();
					JavaUtils jLib=new JavaUtils();
					WebDriverUtils wLib=new WebDriverUtils();

			
					//get data from property file
					
//					String url = fLib.readDataFromPropertyFile("url");
//					System.out.println(url);
//					String un = fLib.readDataFromPropertyFile("un");
//					System.out.println(un);
//					String pass = fLib.readDataFromPropertyFile("pass");
//					System.out.println(pass);
					
					//get data from excel
					String ShippingAdd =	eLib.readDataFromExcelFile("Sheet1", 1, 1);
					String ShippingState =	eLib.readDataFromExcelFile("Sheet1", 2, 1);
					String ShippingCity =	eLib.readDataFromExcelFile("Sheet1", 3, 1);
					String ShippingPincode =eLib.readDataFromExcelFile("Sheet1", 4, 1);
					String BillingAdd =		eLib.readDataFromExcelFile("Sheet1", 7, 1);
					String BillingState =	eLib.readDataFromExcelFile("Sheet1", 8, 1);
					String BillingCity =	eLib.readDataFromExcelFile("Sheet1", 9, 1);
					String BillingPincode =	eLib.readDataFromExcelFile("Sheet1", 10, 1);
					
//			FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\TestScriptData RMG.xlsx");
//			Workbook wb = WorkbookFactory.create(fi);
	//
//			 String ShippingAdd = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
//			 wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
//			 wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
//			 wb.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
//			String BillingAdd = wb.getSheet("Sheet1").getRow(7).getCell(1).getStringCellValue();
//			String BillingState = wb.getSheet("Sheet1").getRow(8).getCell(1).getStringCellValue();
//			String BillingCity = wb.getSheet("Sheet1").getRow(9).getCell(1).getStringCellValue();
//			String BillingPincode = wb.getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue();
			
			//Opening the browser
			//WebDriver driver = new ChromeDriver();
			//wLib.waitForPageLoad(driver, 10);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//driver.get(url);
			//wLib.maximizeWindow(driver);
			//driver.manage().window().maximize();
			
			//login into application
			//LoginPage lp = new LoginPage(driver);
			//lp.login(un, pass);
			//driver.findElement(By.xpath("//a[.='Login']")).click();
//			driver.findElement(By.name("email")).sendKeys(un);
//			driver.findElement(By.name("password")).sendKeys(pass);
//			driver.findElement(By.name("login")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//a[@class='dropdown-toggle'and .='Home']")).click();

		
			//search for product 
			driver.findElement(By.name("product")).sendKeys("Redmi");
			driver.findElement(By.xpath("//button[@class='search-button']")).click();
			driver.findElement(By.linkText("Affix Back Cover for Mi Redmi Note 4")).click();
			
			//Add to cart 
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class='btn btn-primary' and text()=' ADD TO CART']")).click();
			Thread.sleep(2000);
			wLib.acceptAlert(driver);
			//driver.switchTo().alert().accept();
			
			//Fill Shipping and Billing Details
			MyCartPage mcp = new MyCartPage(driver);
			mcp.addToCart(driver, BillingAdd, BillingState, BillingCity, BillingPincode, ShippingAdd, ShippingState, ShippingCity, ShippingPincode);
			//WebElement shipadd = driver.findElement(By.name("billingaddress"));
			//shipadd.clear();
			//shipadd.sendKeys(ShippingAdd);
			
			//WebElement shipstate = driver.findElement(By.id("bilingstate"));
			//shipstate.clear();
			//shipstate.sendKeys(ShippingState);
			
			//WebElement shipcity = driver.findElement(By.id("billingcity"));
			//shipcity.clear();
			//shipcity.sendKeys(ShippingCity);
			
			//WebElement shipcode = driver.findElement(By.id("billingpincode"));
			//shipcode.clear();
			//shipcode.sendKeys(ShippingPincode);
			
			//WebElement billadd = driver.findElement(By.name("shippingaddress"));
			//billadd.clear();
			//billadd.sendKeys(BillingAdd);
			
			//WebElement billstate = driver.findElement(By.id("shippingstate"));
			//billstate.clear();
			//billstate .sendKeys(BillingState);
			
			//WebElement billcity = driver.findElement(By.id("shippingcity"));
			//billcity.clear();
			//billcity.sendKeys(BillingCity);
			
			//WebElement billcode = driver.findElement(By.id("shippingpincode"));
			//billcode.clear();
			//billcode.sendKeys(BillingPincode);
		
			//Proceed to Checkout
			//driver.findElement(By.name("ordersubmit")).click();
			
			PaymentPage pg=new PaymentPage(driver);
			ProductDetailsPage pd=new ProductDetailsPage(driver);
			//pg.getCODRadio();
			//driver.findElement(By.name("paymethod")).click();
			//driver.findElement(By.name("submit")).click();
			
			//TrackOrder
			driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr[last()]/td[last()]")).click();
			wLib.switchToWindow(driver,"track-order");
//			Set<String> allwh = driver.getWindowHandles();
//			String parent = driver.getWindowHandle();
//			for (String wh : allwh) {
//				driver.switchTo().window(wh);
//				
//			}
			String id = driver.findElement(By.xpath("//table/tbody/tr/td[2]")).getText();
			String track = driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).getText();
			System.out.println(track);
			System.out.println(id);
			
			driver.close();
			
			wLib.switchToWindow(driver, "order-history");
			
			//logout
			//HomePage hp = new HomePage(driver);
			//hp.getLogoutLink().click();
			//driver.findElement(By.xpath("//i[@class='icon fa fa-sign-out']")).click();
					
			
		
		}

	}

