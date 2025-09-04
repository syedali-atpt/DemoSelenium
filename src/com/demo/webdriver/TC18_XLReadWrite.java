package com.demo.webdriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TC18_XLReadWrite {
	// Read test data
	// 1. hardcoding
	// 2. parametrisation
	// 3. property file
	// 4. xl => apache poi jar files
	// 5. data base

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:/Users/Syed Murthuza Ali/OneDrive/Desktop/sampleTestData.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(0);

//		XSSFRow row = sheet.getRow(0);

		XSSFCell username = sheet.getRow(1).getCell(0);

//		System.out.println(username.getStringCellValue());

		int lastRow = sheet.getLastRowNum();

		// for reading username

		for (int i = 1; i <= lastRow; i++) {
			try {
				System.out.println("username: " + sheet.getRow(i).getCell(0).getStringCellValue() + " " + "password: "
						+ sheet.getRow(i).getCell(1).getStringCellValue());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		fis.close();

//		// for reading pwd
//		for (int i = 1; i <= lastRow; i++) {
//			System.out.println("password: " + sheet.getRow(i).getCell(1).getStringCellValue());
//		}

		// Write the data to excel file
		XSSFCell cell = sheet.getRow(4).getCell(3);
		cell.setCellValue("Test123");
		FileOutputStream fos = new FileOutputStream("C:/Users/Syed Murthuza Ali/OneDrive/Desktop/sampleTestData.xlsx");
		wb.write(fos);
		System.out.println("Updated data after write is done " + cell.getStringCellValue());
		fos.close();
	}

}
