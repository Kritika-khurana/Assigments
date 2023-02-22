package assignment11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public void ReadExcel1() throws IOException {
		File src = new File("C:/Users/kriti/eclipse-workspace/Selenium/testdata/Test_Data.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);


	wb.getSheet("login").getRow(0).getCell(0).getStringCellValue();
	
	
	
	
	
		
	}
	
}
