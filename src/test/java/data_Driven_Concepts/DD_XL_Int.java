package data_Driven_Concepts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DD_XL_Int  {

	public static void main(String[] args) throws Throwable
	{
FileInputStream XL_int_Data = new FileInputStream("D:\\For_Selenium\\ankush_Sir_TNG_Concepts\\src\\test\\resources\\sample.xlsx");
Workbook work = WorkbookFactory.create(XL_int_Data) ;

//to find the cell data type//
CellType work_Int= work.getSheet("Sheet1").getRow(1).getCell(0).getCellType();
System.out.println("the Cell data type is "+work_Int);

//to fetch the value from the Excel sheet//
double Int_Data = work.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
System.out.println(Int_Data);
	}

}
