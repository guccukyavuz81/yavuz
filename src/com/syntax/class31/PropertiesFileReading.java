package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String filePath="C:\\Users\\Carbon\\eclipse-workspace\\hi\\configs\\Examples.properties";
		
		FileInputStream fileInput=new FileInputStream(filePath);
		
		Properties pro=new Properties();
		
		pro.load(fileInput);
		System.out.println(pro.getProperty("name"));
		System.out.println(pro.getProperty("lastName"));
		System.out.println(pro.getProperty("city"));
		System.out.println(pro.getProperty("phone"));
		Set<Object>keys=pro.keySet();
		System.out.println(keys);
		
		for(Object key:keys) {
			System.out.println(key);
		}


	}

}
