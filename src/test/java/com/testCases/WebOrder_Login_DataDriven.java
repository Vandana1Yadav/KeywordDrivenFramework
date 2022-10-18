package com.testCases;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.operations.ReadObject;
import com.operations.UIOperation;
import com.testData.ApplicationTestData;

public class WebOrder_Login_DataDriven extends ApplicationTestData {

	WebDriver dr;
	ReadObject object = new ReadObject();
	UIOperation operation = new UIOperation();

	@Test(priority = 1, dataProvider = "Weborder_Login")
	public void TC_001(String uname, String upass) throws Exception {
		Properties allObjects = object.getObjectRepository();

		operation.perform(allObjects, "GOTOURL", "", "", "urlWebOrder", "");
		operation.perform(allObjects, "SETTEXT", "iduname", "id", uname, "");
		operation.perform(allObjects, "SETTEXT", "idupass", "id", upass, "");
		operation.perform(allObjects, "CLICK", "idloginButton", "id", "", "");
		operation.perform(allObjects, "THREAD_SLEEP", "", "", "", "");
		operation.perform(allObjects, "CLICK", "linklogout", "link", "", "");
		// operation.perform(allObjects,"CLOSEBROWSER", "", "", "");
	}

	@AfterTest
	public void CloseBrowser() throws Exception {
		Properties allObjects = object.getObjectRepository();
		operation.perform(allObjects, "CLOSEBROWSER", "", "", "", "");
	}

}
