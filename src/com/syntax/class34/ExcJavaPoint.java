package com.syntax.class34;

import java.io.IOException;

public class ExcJavaPoint {

	    static void m()throws IOException{  
		    throw new IOException("device error");//checked exception  
		  }  
		  static void n()throws IOException{  
		    m();  
		  }  
		static  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handled");}  
		  }  
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		p();
	}

}
