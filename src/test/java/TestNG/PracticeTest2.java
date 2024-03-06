package TestNG;

import org.testng.annotations.Test;

public class PracticeTest2 
{
	@Test(priority = 0)
public void create()
{
	System.out.println("--Account Created--");
}
	@Test(priority = 1, dependsOnMethods = "create")
	public void login()
	{
		System.out.println("--Login--");
	}
	@Test(priority = 1, dependsOnMethods = "delete", invocationCount = 2)
	public void edit()
	{
		System.out.println("--Edit--");
	}
	@Test
	public void delete()
	{
		System.out.println("--Delete--");
	}
}
