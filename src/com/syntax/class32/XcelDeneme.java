package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XcelDeneme {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        String path=System.getProperty("user.dir");
		
		String filePath=path+"\\TestData\\deneme.xlsx";
		
		FileInputStream input=new FileInputStream(filePath);
		
		Workbook book=new XSSFWorkbook(input);
		
		Sheet sheet=book.getSheet("Sheet1");
		
		int row=sheet.getPhysicalNumberOfRows();
		
		int r=0;
		
		int col=sheet.getRow(r).getPhysicalNumberOfCells();
		
		List<Map<String, String>> list=new ArrayList<Map<String,String>>();
		
		for(r=1; r<row; r++) {
			Map<String, String> map=new LinkedHashMap<String, String>();
			for(int c=0; c<col; c++) {
//			String key=sheet.getRow(0).getCell(c).toString();
//			String value=sheet.getRow(r).getCell(c).toString();
//			map.put(key, value);                                    or as a shortcut below in one step
			map.put(sheet.getRow(0).getCell(c).toString(), sheet.getRow(r).getCell(c).toString());
			}list.add(map);
		}System.out.println(list);
		
		Map<String, String> m=new LinkedHashMap<>();
		
		for(int x=0; x<col; x++) {
			String k=sheet.getRow(0).getCell(x).toString();
			String v=sheet.getRow(1).getCell(x).toString();
			m.put(k, v);
		}System.out.println(m);
		
		
	}

}
