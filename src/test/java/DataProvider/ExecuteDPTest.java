package DataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Berluti.genricUtils.ExcelUtils;
import com.Berluti.genricUtils.FileUtils;
import com.Berluti.genricUtils.WebDriverUtils;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.LoginPage;

public class ExecuteDPTest 
{
@Test(dataProvider ="genricDP")
	public void getData(String username, String password) throws Throwable
	{
		//System.out.println("From---> "+src+" To ---> "+dstn+ "Price--->"+price);
	FileUtils f = new FileUtils();
	WebDriverUtils wb = new WebDriverUtils();
	String url = f.readDataFromPropertyFile("url");
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	
	LoginPage lp = new LoginPage(driver);
	HomePage hp = new HomePage(driver);
	hp.getLoginbtn().click();
	
	lp.login(username, password);
		//System.out.println("USERNAME--->"+username +"PASSWORD--->"+ password);
	}
@DataProvider
public Object[][] genricDP() throws Throwable
{
	ExcelUtils eu = new ExcelUtils();
	Object [][] value = eu.readMultipleDataProvider("MultipleData");
	return value;
}
}

