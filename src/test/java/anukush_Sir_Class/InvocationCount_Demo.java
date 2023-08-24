package anukush_Sir_Class;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount_Demo
{
@Test(invocationCount = 10)
public void InVo_Demo()
{
	Reporter.log("hi hello",true);
}
}
