package DataProvider;

import org.testng.annotations.DataProvider;

public class PracticeTest1 
{
	@DataProvider()
public void storeData()
{
	Object [] [] bis= new Object[3] [2];
	bis[0][0] ="Parle-G";
	bis[0][1]= "5";
	
	bis[1][0]= "Orio";
	bis[1][1]= "10";
	
	bis[2][0]="MarieGold";
	bis[2][1]="20";
}

}
