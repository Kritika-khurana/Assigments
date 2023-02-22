package assignment11;


import org.testng.annotations.Test;

public class SampleTestDDT {
	@Test(dataProvider="Sample", dataProviderClass =CustomDataProvider.class)
	public void sample(String fname, String lname, String country,String d) {
		System.out.println("Test Started");
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(country);
		System.out.println(d);
		System.out.println("Test Ended");
	}
	
	
}
