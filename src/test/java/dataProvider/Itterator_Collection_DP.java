package dataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Itterator_Collection_DP
{
@Test(dataProvider ="P_D_1")
//public void I_C_DP9(String d)
public void I_C_DP9(String[] d)
{
	System.out.println(d[0]+" --> "+d[1]+" == "+d[2]);
}
@DataProvider
//public Iterator<String> P_D_1()
public Iterator<String[]> P_D_1()
{	
//	1.normal collection
//	List<String> Data_DP = new ArrayList<String>();
//	Data_DP.add("Chandhu");
//	Data_DP.add("Shaekar");
//	Data_DP.add("Ranna");
//	Data_DP.add("Iteartor");
//	return  Data_DP.iterator() ;
	
//	2.string of array collection
	List<String[]> Data_DP = new ArrayList<String[]>();
	Data_DP.add(new String[] {"Chandhu","Shekar","lalla"} );
	Data_DP.add(new String[] {"Horse","parrot","Loper"} );
	Data_DP.add(new String[] {"Liger","Lotus","Lakka"} );
	return  Data_DP.iterator() ;

}
}
