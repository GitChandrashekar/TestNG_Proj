//Depends_on_Method Demo//
package surya_Sir_TNG;
import org.testng.Assert;
import org.testng.annotations.Test;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Depends_on_Method 
{
	
//TestCase1//	
	@Test(priority =1)
public void Start()
{
	System.out.println("Start");
}
	
	
//TestCase2//
	@Test(priority =2)
public void Assert_Demo()
{
	String Expected_Val = "Cha123";
	String Actual_Val   = "bah@123";
	Assert.assertEquals(Actual_Val, Expected_Val);
}

	//TestCase3//
	@Test(priority =3,dependsOnMethods = "Assert_Demo" )
	public void Welcome()
	{
		System.out.println("Welcome to the Soft");
	}
	
	//TestCase4//
	@Test(priority = 4)
	public void Test4()
	{
		System.out.println("End");
	}
	
}
