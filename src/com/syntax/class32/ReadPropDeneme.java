package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropDeneme {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String filePath="C:\\Users\\Carbon\\eclipse-workspace\\hi\\configs\\Examples.properties";
		
		FileInputStream input=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		
		prop.load(input);
		
		System.out.println(prop.getProperty("lastName"));
		
		prop.setProperty("takim", "jimbom");
		
		FileOutputStream output=new FileOutputStream(filePath);
		
		prop.store(output, "added takim");
		
		System.out.println(prop.getProperty("takim"));
		
		
	}

}
