package anukush_Sir_Class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporter_Print
{
@Test
public void A()
{
	Reporter.log("Hii",true);
}
@Test
public void B()
{
	String Data = "jai";
	String Data1 = "Veyy";
	Assert.assertEquals(Data, Data1);
	Reporter.log("Hello");
}
}
