package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ElionRew {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String projectPath=System.getProperty("user.dir");
		
		String filePath=projectPath+"\\configs\\test.properties";
		
		FileInputStream input=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		
		prop.load(input);
		
		System.out.println(prop);
		
		System.out.println(prop.getProperty("takim"));
		
		prop.setProperty("memleket", "gasdamonu");
		
		FileOutputStream output=new FileOutputStream(filePath);
		
		prop.setProperty("hava", "yagmurlu");
		
		prop.store(output, "added hava durumu");
		
	}

}
