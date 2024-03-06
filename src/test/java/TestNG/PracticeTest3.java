package TestNG;

import org.testng.annotations.Test;

public class PracticeTest3 
{
	@Test(dependsOnMethods   = "delete" )
public void create()
{
System.out.println("---CreateAccount---");	
}
	@Test
public void login()
{
	System.out.println("---login---");
	}
	@Test(priority = 1, invocationCount = 0)
public void edit()
{
	System.out.println("---edit---");
}
	@Test
public void delete()
{
	int []a = {1,2,3,4};
	System.out.println(a[5]);
	System.out.println("---delete test---");
	
}
}

