package annotation_class;

import org.testng.annotations.Test;

public class Groups_Demo
{
@Test(description = "odd one",groups = "odd")
public void X()
{
	System.out.println("A");
}
@Test(description = "even one",groups = "even")
public void X1()
{
	System.out.println("B");
}
@Test(description = "odd one",groups = "odd")
public void X2()
{
	System.out.println("C");
}
@Test(description = "even one",groups = "even")
public void X3()
{
	System.out.println("D");
}
}
