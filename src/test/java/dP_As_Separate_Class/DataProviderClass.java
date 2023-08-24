package dP_As_Separate_Class;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass
{
	
@Test(dataProvider ="Data_D", dataProviderClass = Separate_DP_Data.class )
public void Mana(String s)
{
	System.out.println(s);
}

@Test(dataProvider ="Data_DD", dataProviderClass = Separate_DP_Data_DD.class )
public void Mana11(String r)
{
	System.out.println(r);
}
}
