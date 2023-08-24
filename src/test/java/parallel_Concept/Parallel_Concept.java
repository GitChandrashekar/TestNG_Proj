package parallel_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Concept
{
@Test
public void Data2()
{
	WebDriver driver = new ChromeDriver();
	driver.get("https:/www.google.com//");
	
}

@Test
public void Data3()
{
	WebDriver driver = new ChromeDriver();
	driver.get("https:/www.facebook.com//");
}
}
