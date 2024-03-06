package DataProvider;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.DataProvider;

public class DataProviderTest1 
{
	@DataProvider
public Object[][]  setData()
{
Object [][] obj= new Object[2][2];

obj [0][0] ="Testyantra";
obj [0][1] ="Bangalore";
obj [1][0] ="Qspiders";
obj [1][1] ="BTM";
return obj;
}

@DataProvider()
public Object[][] Travel()
{
	Object [][]  obj = new Object [3][3];

	obj[0][0] = "Bangalore";
	obj[0][1] = "Mysore";
	obj[0][2] = 200;
	obj[0][0] = "Bangalore";
	obj[0][1] = "Mumbai";
	obj[0][2] = 1200;
	obj[0][0] = "Mumbai";
	obj[0][1] = "Bangalore";
	obj[0][2] = 1200;
	return obj;
	
}
}

