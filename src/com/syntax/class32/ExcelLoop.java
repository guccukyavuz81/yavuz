package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLoop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String filePath="C:\\Users\\Carbon\\Desktop\\test.xlsx";
		
		FileInputStream input=new FileInputStream(filePath);
		
		Workbook work=new XSSFWorkbook(input);
		
		Sheet sheet=work.getSheet("Sheet1");
		
		int numrows=sheet.getPhysicalNumberOfRows();
		
		int numcolls=sheet.getRow(0).getLastCellNum();
		
		for(int r=0; r< numrows; r++) {
			for(int c=0; c< numcolls; c++) {
				String cellValue=sheet.getRow(r).getCell(c).toString();
				System.out.print(cellValue+" ");
			}System.out.println();
		}
		
		
		
		
		
		
	}

}
