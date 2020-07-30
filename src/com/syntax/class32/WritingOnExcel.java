package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingOnExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String file="C:\\Users\\Carbon\\eclipse-workspace\\hi\\TestData\\TestNewTours in java.xlsx";
		
		FileInputStream input=new FileInputStream(file);
		
		Workbook work=new XSSFWorkbook(input);
		
		Sheet sheet=work.getSheet("Sheet1");
		
		sheet.getRow(0).createCell(8).setCellValue("Takim");
		
		sheet.getRow(1).createCell(8).setCellValue("Jimbom");
		
		sheet.getRow(2).createCell(8).setCellValue("Fener");

		sheet.getRow(3).createCell(8).setCellValue("Bestas");

		sheet.getRow(4).createCell(8).setCellValue("Trabzon");

		sheet.createRow(4).createCell(0).setCellValue("bes");
		
		sheet.getRow(4).createCell(1).setCellValue("yeter");
		
		sheet.getRow(4).createCell(2).setCellValue("yuh");
		
		sheet.getRow(4).createCell(3).setCellValue("oha");
		
		sheet.getRow(4).createCell(4).setCellValue("hadi");
		
		sheet.getRow(4).createCell(5).setCellValue("uza");
		
		sheet.getRow(4).createCell(6).setCellValue("sal");
		
		sheet.getRow(4).createCell(7).setCellValue("bizi");
		
		sheet.getRow(4).createCell(8).setCellValue("usta");
		
		FileOutputStream output=new FileOutputStream(file);
		
		work.write(output);
		
        int row=sheet.getPhysicalNumberOfRows();
		
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		
		//int col=sheet.getRow(0).getLastCellNum();
		
		for(int r=0; r<row; r++) {
			for(int c=0; c<col; c++) {
				String cellValue=sheet.getRow(r).getCell(c).toString();
				System.out.print(cellValue+" ");
			}System.out.println();
		}
		
		
		
	}

}
