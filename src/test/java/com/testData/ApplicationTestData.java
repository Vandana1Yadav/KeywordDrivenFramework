package com.testData;

import org.testng.annotations.DataProvider;

public class ApplicationTestData {

	@DataProvider(name="Login")
	public Object[][] getDataFromDataprovider(){

	    return new Object[][] {

			{"Admin", "admin123"},
			{"Admin", "admin123" },
			{"Admin", "admin123" }

	            };
	}
	
	@DataProvider(name="Weborder_Login")
	public Object[][] getDataforWebOrderLogin(){

	    return new Object[][] {

			{"Tester", "test"},
			{"Tester", "test" },
			{"Tester", "test" }

	            };
	}
	
	@DataProvider(name="Sheet_Name")
	public Object[][] getTestCaseID(){

	    return new Object[][] {

			{"TC_001"},
			{"TC_002" }
	            };
	}
}
