package com.ita.selenium.actitime.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	public static File file = null;
	public static FileInputStream fis = null;
	public static Workbook wb = null;
	public static Sheet sh = null;
	public static Row row = null;
	public static Cell cell = null;

	public static Workbook getWorkBook() {
		file = new File("data/Actitime_TestData.xls");
		try {
			fis = new FileInputStream(file);
			wb = WorkbookFactory.create(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wb;
		
	}

	public static Sheet getSheet(String sheetName)
	{
		wb = getWorkBook();
		return wb.getSheet(sheetName);
	}
	
	
	public static Row getRow(String sheetName, int rowNum)
	{
		sh = getSheet(sheetName);
		row = sh.getRow(rowNum);
		return row;
		
	}
	public static int getRowCount(String sheetName)
	{
		sh = getSheet(sheetName);
		return sh.getLastRowNum()+1;
		
	}
	
	public static String getCell(String sheetName,int rowNum, int colNum) {
		row = getRow(sheetName, rowNum);
		cell = row.getCell(colNum);
		return cell.toString();
		
	}
	
	
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//
//		File file = new File("data/Actitime_TestData.xls");
//		FileInputStream fis = new FileInputStream(file);
//		Workbook wb = WorkbookFactory.create(fis);
//		int sheetCount = wb.getNumberOfSheets();
//		for (int i = 0; i < sheetCount; i++) {
//			System.out.println(wb.getSheetName(i));
//		}
//
//		Sheet sheet = wb.getSheet("createcustomer");
//		int rowCount = sheet.getLastRowNum() + 1;
//		System.out.println("Row count : " + rowCount);
//
//		for (int i = 0; i < rowCount; i++) {
//			Row row = sheet.getRow(i);
//			System.out.println(row.getCell(0).toString() + " | " + row.getCell(1).toString());
//		}
//
//	}
}
