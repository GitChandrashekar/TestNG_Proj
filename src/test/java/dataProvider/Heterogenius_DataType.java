package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Heterogenius_DataType
{
	
//here we can send dataProvider value as  "@DataProvider"  method name or//
//"@DataProvider" attribute value such as name value//
	
@Test(dataProvider ="Dom_1") 
public void Heterogenius_DataType_Demo(Object r)
{
	System.out.println(r);
	
}

@DataProvider
public Object[] Dom_1()
{
	Object[] Obj_Data = new Object[] {1,"Chandhu","Shekar",99.33,};
	return Obj_Data;
}
}
