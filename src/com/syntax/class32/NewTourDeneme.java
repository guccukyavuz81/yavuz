package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewTourDeneme {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String filePath="C:\\Users\\Carbon\\eclipse-workspace\\hi\\TestData\\TestNewTours in java.xlsx";
		
		FileInputStream input=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(input);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		System.out.println(sheet.getRow(1).getCell(0).toString());
		
		sheet.getRow(0).getCell(0).setCellValue("isim");
		
		FileOutputStream output=new FileOutputStream(filePath);
		
		book.write(output);

	}

}
