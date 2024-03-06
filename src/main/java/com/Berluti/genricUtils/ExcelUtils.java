package com.Berluti.genricUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ExcelUtils 
{
public String readDataFromExcelFile(String sheetName, int row, int cell) throws Throwable
{
	FileInputStream fis= new FileInputStream(IpathConstants.ExcelPath);
   Workbook wb = WorkbookFactory.create(fis);
   String value = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
   return value;
  }
public void getLastRowNo(String sheetName,int row, int cell, String value) throws Throwable
{
FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath)	;
 Workbook wb = WorkbookFactory.create(fis);
 wb.getSheet(sheetName).getRow(row).createCell(cell).setCellValue(value);
 
 FileOutputStream fos =new FileOutputStream(IpathConstants.ExcelPath);
 wb.write(fos);
 wb.close();
}
public HashMap<String, String> readMultipleData(String sheetname,int cell, WebDriver driver) throws Throwable
{
	FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetname);
	int rowCount = sh.getLastRowNum();
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	for(int i =0; i<rowCount; i++)
	{
		String key = sh.getRow(i).getCell(cell).getStringCellValue();
		String value = sh.getRow(i).getCell(cell+1).getStringCellValue();
		map.put(key, value);
	}
	
	return map;
}
	public Object[][] readMultipleDataProvider(String sheetName) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis) ;
		Sheet sh = wb.getSheet(sheetName);
		int lastRow = sh.getLastRowNum()+1;
		int lastCell = sh.getRow(0).getLastCellNum();
		 Object[][] obj = new Object[lastRow][lastCell];
		 for(int i = 0; i<lastRow; i++)
		 {
			 for(int j = 0; j<lastCell; j++)
			 {
				obj[i][j]	 = sh.getRow(i).getCell(j).getStringCellValue();
				 }
		 }
		return obj;

	}
	
	
	
	
}

