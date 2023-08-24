package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide_String
{
	
@Test(dataProvider = "Str_Demo")

public void Data_1(String e)
{
	System.out.println(e);
}

@DataProvider
public String[] Str_Demo()
{
 String[] Str_11 = new String[] {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
 return Str_11;
}
}
