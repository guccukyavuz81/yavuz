package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ElionsClass1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String projectPath=System.getProperty("user.dir");
		
		String filePath=projectPath+ "\\TestData\\deneme.xlsx";
		
		FileInputStream input=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(input);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		int row=sheet.getPhysicalNumberOfRows();
		
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int r=0; r<row; r++) {
			for(int c=0; c<col; c++) {
				String cellvalue=sheet.getRow(r).getCell(c).toString();
				System.out.print(cellvalue+" ");
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
