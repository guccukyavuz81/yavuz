package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ListMap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

String file="C:\\Users\\Carbon\\eclipse-workspace\\hi\\TestData\\TestNewTours in java.xlsx";
		
		FileInputStream input=new FileInputStream(file);
		
		Workbook work=new XSSFWorkbook(input);
		
		Sheet sheet=work.getSheet("Sheet1");
		
        int row=sheet.getPhysicalNumberOfRows();
		
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		
		List<Map<String, String>> listMap=new ArrayList<Map<String,String>>();
		
		for(int r=1; r<row; r++) {
		Map<String, String> map=new LinkedHashMap<String, String>();
			for(int c=0; c<col; c++) {
			String key=sheet.getRow(0).getCell(c).toString();
			String value=sheet.getRow(r).getCell(c).toString();	
			map.put(key, value);
			}
			listMap.add(map);
		}
		
		System.out.println(listMap);
		
		
		
	}

}
