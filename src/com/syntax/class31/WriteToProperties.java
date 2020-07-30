package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		String filePath="C:\\Users\\Carbon\\eclipse-workspace\\hi\\configs\\Examples.properties";
		
		FileInputStream fileInput=new FileInputStream(filePath);
		
		Properties pro=new Properties();
		pro.load(fileInput);
		pro.setProperty("phone", "123456789");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		pro.store(fos, "added phone");
		
		//System.out.println(pro.getProperty("phone"));
		
	}

}
