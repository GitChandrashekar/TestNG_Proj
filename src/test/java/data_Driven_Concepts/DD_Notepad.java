package data_Driven_Concepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class DD_Notepad {

	public static void main(String[] args) throws Exception
	{
		String path = "D:\\For_Selenium\\TestNG_DD\\src\\test\\resources\\Notepad.properties";
     FileInputStream fis = new FileInputStream(path);
     
//     FileInputStream fis = new FileInputStream("D:\\For_Selenium\\TestNG_DD\\src\\test\\java\\Notepad.properties");

     Properties prop = new Properties();
     prop.load(fis);
     
     String Str_data_N = prop.getProperty("name");
     String Str1_data_p = prop.getProperty("pass");
     
     System.out.println(Str_data_N);
     System.out.println(Str1_data_p);

	}

}
