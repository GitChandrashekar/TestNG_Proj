//TestNG_Annotaion demo//

package annotation_class;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotaion
{
	
@Test
public void Data()
{
		System.out.println("this is test");
}
	
@BeforeClass
public void A()
{
	System.out.println("im from @BeforeClass"); //executes Third//
}

@BeforeMethod
public void B()
{
	System.out.println("im from @BeforeMethod"); //executes last//
}

@BeforeSuite
public void C()
{
	System.out.println("im from @BeforeSuite");  //executes first//
}

@BeforeTest
public void D()
{
	System.out.println("im from @BeforeTest");  //executes Second//
}

@AfterClass
public void E()
{
	System.out.println("im from @AfterClass");  //executes 2nd//
}
@AfterMethod
public void F()
{
	System.out.println("im from @AfterMethod");  //executes 1st//
}
@AfterTest
public void G()
{
	System.out.println("im from @AfterTest");  //executes 3rd//
}
@AfterSuite
public void H()
{
	System.out.println("im from @AfterSuite");  //executes 4th//
}
}
