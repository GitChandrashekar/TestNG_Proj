package data_Driven_Concepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DD_XL_String
{
public static void main(String[] args) throws Throwable
{
	//Stream into the cell path in excel sheet//
	FileInputStream fs1 = new FileInputStream("D:\\For_Selenium\\ankush_Sir_TNG_Concepts\\src\\test\\resources\\sample.xlsx");
	Workbook work = WorkbookFactory.create(fs1);
	
	//to find the cell data type//
	CellType work11= work.getSheet("Sheet1").getRow(0).getCell(0).getCellType();
	System.out.println("the cell data type is :"+work11);
	
	//to fetch the value from the Excel sheet//
	String Data = work.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(Data);
}
}
