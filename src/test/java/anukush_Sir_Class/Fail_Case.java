package anukush_Sir_Class;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Fail_Case
{
@Test
public void TCC1()
{
	System.out.println("Hi Heloo");
}

@Test
public void TCC2()
{
	Assert.fail();
	System.out.println("DJ");
	
}
}
