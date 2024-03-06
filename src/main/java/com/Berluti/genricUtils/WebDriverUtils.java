package com.Berluti.genricUtils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils 
{
WebDriver driver;
public void waitForPageLoad(WebDriver driver, int sec)
{
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec))	;
}
public void maximizeWindow(WebDriver driver)
{
	driver.manage().window().maximize();
}
public void minimizeWindow(WebDriver driver)
{
	driver.manage().window().minimize();
}

public void waitTillPageLoad(WebDriver driver,int sec) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
}
public void waitUntilEleToBeVisible(WebDriver driver, int sec, WebElement element)
{	
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
wait.until(ExpectedConditions.alertIsPresent());
}
public void handleDropDown(WebElement element, int index)
{
Select sel = new Select(element);
sel.selectByIndex(index);
}
public void handleDropDown(WebElement element, String value)
{
Select sel = new Select(element);
sel.selectByValue(value);
}
public void handleDropDown(String txt, WebElement element)
{
	Select select  = new Select(element);
	select.selectByVisibleText(txt);
}
public Actions actionObj(WebDriver driver)
{
	Actions act = new Actions(driver);
	return act;
	
	}
public void dragAndDrop(WebDriver driver, WebElement src, WebElement dst) 
{
	actionObj(driver).dragAndDrop(src, dst).perform();
}
 public void mouseHoverOnEle(WebDriver driver, WebElement element)
 {
	 actionObj(driver).click(element).perform();
	 
 }
 public void doubleClickAction(WebDriver driver, WebElement element)
 {
	 actionObj(driver).doubleClick(element);
 }
public void doubleClickAction(WebDriver driver)
{
	actionObj(driver).doubleClick().perform();
}
public void rightClick(WebDriver driver, WebElement element)
{
	actionObj(driver).contextClick(element);
}
public void rightClick(WebDriver driver)
{
actionObj(driver).contextClick().perform();	
}
public void enterKeyPress(WebDriver driver)
{
	actionObj(driver).sendKeys(Keys.ENTER).perform();
}
public void entryKey() throws Throwable
{
	Robot rb = new Robot();
	rb.keyPress(KeyEvent.VK_ENTER);
}
public void enterRelese() throws Throwable
{
Robot rb = new Robot();
rb.keyRelease(KeyEvent.VK_ENTER);
}
public void switchToFrame(WebDriver driver, String nameOrld)
{
	driver.switchTo().frame(nameOrld);
}
public void switchToFrame(WebDriver driver, WebElement address)
{
driver.switchTo().frame(address);
}
public void acceptAlert(WebDriver driver)
{
driver.switchTo().alert().accept();	
}
public void cancleAlert(WebDriver driver)
{
driver.switchTo().alert().dismiss();	
}
public void switchToWindow(WebDriver driver, String partialWinTitle)
{
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	while(it.hasNext())
	{
	String windId = it.next();
	String currentWinTitle = driver.switchTo().window(windId).getTitle();
	if(currentWinTitle.contains(partialWinTitle))
	{
		break;
	}
	}
}
public String getScreenShot(WebDriver driver, String screenShotName) throws Throwable
{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	String path = ".\\screenshot\\"+screenShotName+".png";
	File dstn = new File(path);
	FileUtils.copyFile(src, dstn);
	return dstn.getAbsolutePath();
}
public void scrollAction(WebDriver driver)
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,500)", "");
	
}
public void scrollAction(WebDriver driver, WebElement element)
{
JavascriptExecutor js = (JavascriptExecutor)driver;
int y= element.getLocation().getY();
js.executeScript("window.scrollBY(0,"+y+")", element);
js.executeScript("argument[0].scrollIntoView()", element);
}
public String getTextOfAlert(WebDriver driver)
{
	String alertText = driver.switchTo().alert().getText();
	return alertText;
}
public void acceptAlert1(WebDriver driver)
{
	driver.switchTo().alert().accept();
}
}
