package indices_DP;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Indices_DP
{
@Test(dataProvider = "Dam")
public void In_Dp(String t)
{
	System.out.println(t);
}
@DataProvider(indices = {0,3,2})
public String[] Dam()
{
	String[] data_Str = {"Chandhu","GOAT","LIGER","RAT","BOAT","WOAT"};
	return data_Str;
	
}
}
