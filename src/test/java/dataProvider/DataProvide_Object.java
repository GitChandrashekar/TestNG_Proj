package dataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvide_Object
{

@Test(dataProvider="data1")
public void validate(String s,String l)
{
	System.out.println("the FirstName is "+s);
	System.out.println("the Lastname is "+l);
	System.out.println("---------------------");
}

@DataProvider(name="data1")
public Object[] User_Meth()
{
	Object[][] Str = new Object[2][2];
	Str[0][0] = "Chandhu";
	Str[0][1] = "Shekar";
	
	Str[1][0] = "GOAT";
	Str[1][1] = "Fight";
	
	return Str;
}
}
