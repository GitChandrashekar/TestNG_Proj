package surya_Sir_TNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Launch_G_E
{
@Test
public void Test1()
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@Test
public void Test2()
{
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.pixbay.com/");
}
}
