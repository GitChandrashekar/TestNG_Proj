package dataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProvide_Integer
{
	@Test(dataProvider = "Str_Demo")

	public void Data_1(Integer i)
	{
		System.out.println(i);
	}
	
	@DataProvider
	public Integer[] Str_Demo()
	{
		Integer[] Str_11 = new Integer[] {8,9,10,11,22,33,44};
	 return Str_11;
     }
     }