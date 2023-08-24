package parameter_testAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameter_Demo
{
	public static WebDriver driver;
	
@Parameters("browser")
	
@Test(priority = 0)
public void SetUp(String WebBrowserName)
{
	System.out.println("the WebBrowserName is : "+WebBrowserName);
	
	if(WebBrowserName.equalsIgnoreCase("Chrome"))
	{
//	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if(WebBrowserName.equalsIgnoreCase("Edge"))
	{
//		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	else if(WebBrowserName.equalsIgnoreCase("firefox"))
	{
//		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	else {
            System.out.println("no browser found");
	}
	
}
@Test(priority = 1)
private void Demood()
{
	driver.get("https://www.google.com//");
}
	
}

