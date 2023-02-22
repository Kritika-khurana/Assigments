package assignment11;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	
	
	@DataProvider(name="Sample")
	public static Object[][] getdata(){
			Object[][] arr= ExcelReader.getDatafromsheet("Emp");
			return arr;
			
			
		}


}
