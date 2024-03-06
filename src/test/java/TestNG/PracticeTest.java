package TestNG;

import org.testng.annotations.Test;

public class PracticeTest 
{
	@Test(priority = -1)
public void createTest()
{
		System.out.println("--create Test--");
	}
	@Test(priority = 1, invocationCount = 2, dependsOnMethods = "deleteTest")
	public void editTest()
	{
		System.out.println("--Edit Test--");
	}
	
	@Test(dependsOnMethods = "createTest")
	public void deleteTest()
	{
		System.out.println("--Delete test--");
	}
	
}
