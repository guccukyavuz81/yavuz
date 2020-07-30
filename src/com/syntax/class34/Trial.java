package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Trial {

	static int division(int x,int y) {
		
		int result=0;
		try {
			result=x/y;
			System.out.println(result);
		}catch(Exception ae) {
		//	ae.printStackTrace();
			//System.out.println(ae.getMessage());
			//System.out.println(ae);
		}finally {
			System.out.println("i am a finally block");
		}return result;
	}
	
	static void read(String filePath){
		
		FileInputStream	input = null; 
		try {
		input = new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
		try {
			if(input!=null) {
				input.close();	
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		division(10,5);
		division(10,0);
		
		System.out.println("-------rest of the code--------");
		read("");
	}

}
