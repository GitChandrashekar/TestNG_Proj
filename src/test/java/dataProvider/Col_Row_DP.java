package dataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//Eg :- if we are accessing the 2_dim array values which is change in the coloumns in each row
//then we ahve to use for loop to fetch the data from the "@DataProvider" 
//and also if the data  is considering the heterogenius values then we have to use super class Object[]

public class Col_Row_DP
{
@Test(dataProvider = "DD_Demo")
public void Liger(Object[] r)
{
//	System.out.println(r);
	for(int i=0;i<r.length;i++)
	{
		System.out.println(r[i]+" ");
	}
	System.out.println("---*-----*---");
}
	
	
	@DataProvider
	public Object[][] DD_Demo()
	{
	Object[][] DDD_3 = new Object[][]
	   {
		{"Chandhu",123,"horse",99.55},    //considers it as single array//
		{"Shekar",1996,"para"},           //considers it as single array//
		{1122,"GOAT","@wwe","tiger",999}  //considers it as single array//
	    };
		
		return DDD_3;
	}
}
