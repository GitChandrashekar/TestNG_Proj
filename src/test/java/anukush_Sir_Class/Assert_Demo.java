package anukush_Sir_Class;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Demo
{
	@Test
	public void assert1()
	{
		String Act_Res = "Chandhu";
		String Exp_Res=  "Shekar";
		
		Assert.assertEquals(Act_Res, Exp_Res);
	}



}
