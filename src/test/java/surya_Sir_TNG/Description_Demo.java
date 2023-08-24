package surya_Sir_TNG;

import org.testng.annotations.Test;

public class Description_Demo
{
	//in order to add the description for the particular test case we will go with the description keyword in test annotation//
	
	//if we want to restrict the execution of a particular test case then we will assign false for the enabled keyword//
	
@Test(priority = 6,description = "validating the Thara",enabled = true)
public void Thara()
{
	System.out.println("ABC");
}
	
	
@Test(priority = -20,description = "validating the Forra",enabled = true)
public void Forra()
{
	System.out.println("DEF");
}

@Test(priority = 1,description = "validating the Harra",enabled = true)
public void Harra()
{
	System.out.println("XYZ");
}
}
