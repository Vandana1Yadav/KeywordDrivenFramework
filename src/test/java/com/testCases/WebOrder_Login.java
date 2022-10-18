package com.testCases;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.operations.ReadObject;
import com.operations.UIOperation;

public class WebOrder_Login {

	WebDriver dr ;
	ReadObject object = new ReadObject();
	UIOperation operation = new UIOperation();
	@Test(priority = 1)
	public void TC_001() throws Exception {
		Properties allObjects =  object.getObjectRepository();
		//Read keyword sheet
		//operation.perform(p, operation, objectName, objectType, value);
	//	dr.findElement(By.id(null))
		operation.perform(allObjects,"GOTOURL", "", "", "urlWebOrder","");
		operation.perform(allObjects,"SETTEXT", "iduname", "id", "Tester","");
		operation.perform(allObjects,"SETTEXT", "idupass", "id", "test","");
		operation.perform(allObjects,"CLICK", "idloginButton", "id", "","");
		operation.perform(allObjects,"THREAD_SLEEP", "", "", "","");
		
		//operation.perform(allObjects,"CLICK", "linklogout", "link", "");
		//operation.perform(allObjects,"CLOSEBROWSER", "", "", "");
	}
	
	@Test(priority = 2)
	public void TC_002() throws Exception {
		Properties allObjects =  object.getObjectRepository();
		
		operation.perform(allObjects,"CLICK", "clickorderlink", "LINK", "","");
		operation.perform(allObjects,"SELECTDROPDOWNVALUE", "ddproduct", "NAME", "MyMoney","ByText"); //ByText
		Thread.sleep(5000);
		operation.perform(allObjects,"SELECTDROPDOWNVALUE", "ddproduct", "NAME", "2","ByIndex"); //ByIndex
		Thread.sleep(5000);
		operation.perform(allObjects,"SELECTDROPDOWNVALUE", "ddproduct", "NAME", "ScreenSaver","ByValue"); //ByValue
		Thread.sleep(5000);
		operation.perform(allObjects,"SETTEXT", "namequantity", "NAME", "2","");
		operation.perform(allObjects,"SETTEXT", "namepriceperunit", "NAME", "80","");
		operation.perform(allObjects,"SETTEXT", "namediscount", "NAME", "10","");
		operation.perform(allObjects,"SETTEXT", "nametotal", "NAME", "","");
		
		//Address Info
		operation.perform(allObjects,"SETTEXT", "namecustomername", "NAME", "Minnie","");
		operation.perform(allObjects,"SETTEXT", "namestreet", "NAME", "Downey","");
		operation.perform(allObjects,"SETTEXT", "namecity", "NAME", "Manchester","");
		operation.perform(allObjects,"SETTEXT", "namestate", "NAME", "CT","");
		operation.perform(allObjects,"SETTEXT", "namezip", "NAME", "00010","");
		
		//Payment Info
		operation.perform(allObjects,"SELECTRADIOBUTTON", "forpaymentinfo", "XPATH", "","");
		operation.perform(allObjects,"SETTEXT", "namecardnum", "NAME", "1001200532149006","");
		operation.perform(allObjects,"SETTEXT", "nameexpirydate", "NAME", "0928","");
		//operation.perform(allObjects,"SETTEXT", "nameexpirydate", "NAME", "09/28");
		
		//Click on Process button
		operation.perform(allObjects,"CLICK", "idprocess", "ID", "","");
		Thread.sleep(10000);
		operation.perform(allObjects,"CLOSEBROWSER", "", "", "","");
		
	}
	
}
