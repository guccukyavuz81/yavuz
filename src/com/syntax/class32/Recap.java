package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Recap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream input=new FileInputStream("C:\\Users\\Carbon\\eclipse-workspace\\hi\\configs\\test.properties");
		
		Properties prop=new Properties();
		
		prop.load(input);
		
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("hava", "bulutlu");
		
		FileOutputStream output=new FileOutputStream("C:\\Users\\Carbon\\eclipse-workspace\\hi\\configs\\test.properties");
		
		prop.store(output, "added hava durumu");
		
		System.out.println(prop.getProperty("hava"));
		
		
		
		
		
	}

}
