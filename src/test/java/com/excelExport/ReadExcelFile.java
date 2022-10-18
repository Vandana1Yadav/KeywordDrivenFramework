package com.excelExport;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcelFile {

	// Excel file having 2 different extension .xls, .xlsximport java.io.File;
	
	private static Sheet ExcelWSheet;
	private static Workbook ExcelWBook;
	
	// Excel file having 2 different extension .xls, .xlsx
	public Sheet readExcel(String filePath,String fileName,String sheetName) throws IOException{
	//Create a object of File class to open xlsx file
	File file =	new File(filePath+"\\"+fileName);
	//Create an object of FileInputStream class to read excel file
	FileInputStream inputStream = new FileInputStream(file);
	//Workbook KDWorkbook = null;
	//Find the file extension by spliting file name in substing and getting only extension name
	String fileExtensionName = fileName.substring(fileName.indexOf("."));
	//Check condition if the file is xlsx file
	if(fileExtensionName.equals(".xlsx")){
	//If it is xlsx file then create object of XSSFWorkbook class
		//KDWorkbook = new XSSFWorkbook(inputStream);
		ExcelWBook = WorkbookFactory.create(inputStream);
	}
	//Check condition if the file is xls file
	else if(fileExtensionName.equals(".xls")){
		//If it is xls file then create object of XSSFWorkbook class
		ExcelWBook = WorkbookFactory.create(inputStream);
	}
	//Read sheet inside the workbook by its name
	ExcelWSheet = ExcelWBook.getSheet(sheetName);
	 return ExcelWSheet;	
	}

}
