package annotation_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Chrome_Demo
{
WebDriver driver;

@BeforeSuite
public void Dam() 
{
	driver = new ChromeDriver();
}

@Test
public void Fro() throws InterruptedException
{
	driver.get("https:www.Google.com//");
	Thread.sleep(2500);
}
@AfterMethod
public void Dam1()
{
	driver.quit();
}

}
