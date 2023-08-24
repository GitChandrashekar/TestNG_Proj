package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Two_Dimensional_Demo
{
@Test(dataProvider = "DD_Demo")


public void Two_Demo(String username,String pass)
//public void Two_Demo(String[] s)

{

	System.out.println(username+" --> "+pass);
//	System.out.println(s[0]+" --> "+s[1]);

}

@DataProvider
public String[][] DD_Demo()
{
	String[][] DDD_2 = new String[][]{{"Chandhu","@123"},{"Shekar","@1996"},{"GOAT","@wwe"}};
	
	return DDD_2;
}
}
