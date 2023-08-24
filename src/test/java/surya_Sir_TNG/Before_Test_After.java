package surya_Sir_TNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Before_Test_After
{
public static  WebDriver driver ;


@BeforeTest
public void Before_Val()
{
	System.out.println("before test Validate_1");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}


@Test
public void Validate_1()
{
	driver.get("https://testpages.herokuapp.com/basic_html_form.html//");
}



@AfterTest
public void Validate_2()
{
	System.out.println("complete the validation");
}


}


