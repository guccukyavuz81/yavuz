package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1 {

	public static void main(String[] args) throws IOException {
		
		
//FileInputStream input=new FileInputStream("C:\\Users\\Carbon\\eclipse-workspace\\hi\\configs\\test.properties");
		System.out.println(System.getProperty("user.dir"));
		String filePath1=System.getProperty("user.dir")+"\\configs\\test.properties";
		FileInputStream input=new FileInputStream(filePath1);
		
		Properties prop=new Properties();
		prop.load(input);
		
		System.out.println(prop.getProperty("browser"));  //get property and get give the same result
		System.out.println(prop.get("url"));              //get retrieves the object and getproperty retrives string
		
		prop.setProperty("takim", "jimbom");
		
		FileOutputStream output=new FileOutputStream("C:\\Users\\Carbon\\eclipse-workspace\\hi\\configs\\test.properties");
		
		prop.store(output, "added takim");
		
		
		
	}

}
