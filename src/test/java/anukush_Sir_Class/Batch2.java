package anukush_Sir_Class;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Batch2 
{
	@Test
	public void tc4()
	{
		Reporter.log("from TC4",true);
	}
	@Test
	public void tc5()
	{
		Reporter.log("from TC5",true);
	}
@Test
	public void tc6()
	{	Assert.fail();

		Reporter.log("from TC6",true);
	}
}
