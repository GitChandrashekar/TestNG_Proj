//priority pgm demo//
package surya_Sir_TNG;

import org.testng.annotations.Test;

public class Priority_Basic
{
	@Test(priority = 3)
public void Ravan()
{
	System.out.println("hello");
}
	@Test(priority = 1)
public void Jakku()
{
	System.out.println("AM KING OF THE WORLD");
}
	@Test(priority = -20)
public void Lokku()
{
	System.out.println("IM A LION,, IM A TIGER.. DHONHO KA MIX THEY CALL ME LIGER,,");
}
	@Test(priority = 4)
public void Mahan()
{
	System.out.println("APPLE ball cat ");
}
}
