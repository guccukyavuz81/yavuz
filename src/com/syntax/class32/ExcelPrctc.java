package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPrctc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path=System.getProperty("user.dir");
		
		String filePath=path+"\\TestData\\deneme.xlsx";
		
		FileInputStream input=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(input);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		int row=sheet.getPhysicalNumberOfRows();
		
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int r=0; r<row; r++) {
			for(int c=0; c<col; c++) {
				String cellValue=sheet.getRow(r).getCell(c).toString();
				System.out.print(cellValue+" ");
			}System.out.println();
		}
		Row row0=sheet.getRow(0);
		int cellnum0=row0.getPhysicalNumberOfCells();
		
		for(int x=0; x<cellnum0; x++) {
			System.out.println(row0.getCell(x));
		}
		
        int ro=sheet.getPhysicalNumberOfRows();
        int w=0;
		int co=sheet.getRow(w).getPhysicalNumberOfCells();
		
		List<Map<String, String>> listmap=new ArrayList<>();
		
		for(w=1; w<row; w++) {
			Map<String, String> map=new LinkedHashMap<String, String>();
			for(int q=0; q<col; q++) {
			String key=sheet.getRow(0).getCell(q).toString();
			String value=sheet.getRow(w).getCell(q).toString();
			map.put(key, value);
		}  listmap.add(map);	
		}
		System.out.println(listmap);
		
		Map<String, String> m=new LinkedHashMap<>();
		for(int e=0; e<col; e++) {
	//		String header=sheet.getRow(0).getCell(e).toString();
	//		String data=sheet.getRow(2).getCell(e).toString();
	//		m.put(header, data);       
			m.put(sheet.getRow(0).getCell(e).toString(), sheet.getRow(2).getCell(e).toString());                                  //or as a shortcut
		}
		System.out.println(m);
	}

}
