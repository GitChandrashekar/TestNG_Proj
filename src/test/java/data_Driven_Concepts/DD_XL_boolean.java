package data_Driven_Concepts;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DD_XL_boolean {

	public static void main(String[] args) throws Throwable 
	{
	String path = "D:\\For_Selenium\\ankush_Sir_TNG_Concepts\\src\\test\\resources\\sample.xlsx";
	FileInputStream Boo_data= new FileInputStream(path);
	Workbook work_Boo = WorkbookFactory.create(Boo_data);
	
	//to find the cell data type//
	CellType work11= work_Boo.getSheet("Sheet1").getRow(0).getCell(1).getCellType();
	System.out.println("the Cell data type is : "+work11);
	
	//to fetch the value from the Excel sheet//
	boolean Data_True = work_Boo.getSheet("Sheet1").getRow(0).getCell(1).getBooleanCellValue();
	System.out.println(Data_True);
	
	}

}
