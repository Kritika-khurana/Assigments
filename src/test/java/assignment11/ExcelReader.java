package assignment11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	static XSSFWorkbook wb;
	public static Object[][] getDatafromsheet(String SheetName) {

		Object[][] arr = null;
		// XSSFWorkbook wb = new XSSFWorkbook();
		File src = new File(System.getProperty("user.dir") + "/testdata/TestData.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			 wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(SheetName);
			int row = sh.getPhysicalNumberOfRows();
			int column = sh.getRow(0).getPhysicalNumberOfCells();
			arr = new Object[row][column];
			for (int i = 0; i < row; i++) {

				for (int j = 0; j < column; j++) {

					//arr[i][j] = wb.getSheet(SheetName).getRow(i).getCell(j).getStringCellValue();
					arr[i][j] =	getData(SheetName, i, j);
			}

			}} catch (FileNotFoundException e) {

			System.out.println("could not find the file" + e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("not able to load the file" + e.getMessage());
			e.printStackTrace();
		}
		return arr;

	}
	
	public static String getData(String SheetName,int row, int column) {
	XSSFCell cell=	wb.getSheet(SheetName).getRow(row).getCell(column);
	String Data= "";
	if(cell.getCellType()==CellType.STRING) {
		
		 Data= cell.getStringCellValue();
		}
	else if(cell.getCellType()==CellType.NUMERIC) {
		Double	DataInDouble= cell.getNumericCellValue();
		Data= String.valueOf(DataInDouble);

		
	}
	else if(cell.getCellType()==CellType.BLANK){
		Data="";
		
	}
		return Data;
	}
	}


