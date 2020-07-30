package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String filePath="C:\\Users\\Carbon\\Desktop\\test.xlsx";
		
		FileInputStream input=new FileInputStream(filePath);
		
		Workbook wbook=new XSSFWorkbook(input);
		
		Sheet sheet=wbook.getSheet("Sheet1");
		
		Row row1=sheet.getRow(0);
		
		Cell cell=row1.getCell(1);
		
		String row1cell2=cell.toString();
		
		System.out.println(row1cell2);
		
		Row row2=sheet.getRow(1);
		
		Cell cell2=row2.getCell(2);
		
		String row2cell3=cell2.toString();
		
		System.out.println(row2cell3);
		
		String cellValue=sheet.getRow(1).getCell(4).toString();
		
		System.out.println(cellValue);
		
		String [] stringzip=cellValue.split("\\.");
		
		System.out.println(stringzip[0]);
		
		double zip=sheet.getRow(1).getCell(4).getNumericCellValue();
		
		System.out.println(zip);
		
	//	int z= (int)zip;  either this way in two steps or below in a single shot
		
		System.out.println((int)zip);
		
	
		
	}

}
