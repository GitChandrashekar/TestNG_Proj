//Assert_Ex Demo//
package surya_Sir_TNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Ex
{
	@Test(priority = 1)
public void T1()
{
	int i=50;
	int j=20;
	Assert.assertEquals(i, j);
}
	
	@Test(priority =2)
	public void T2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String ExpTitle = "Google";
		String ActualTitle = driver.getTitle();
		
		Assert.assertEquals(ExpTitle, ActualTitle);
		
	}
}
