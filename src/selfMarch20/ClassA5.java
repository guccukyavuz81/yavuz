package selfMarch20;

public class ClassA5 {

	
		void m(){  
			System.out.println(this);//prints same reference ID  
			}  
			public static void main(String args[]){  
			ClassA5 obj=new ClassA5();  
			System.out.println(obj);//prints the reference ID  
			obj.m();  
			 
			  
	}

}
// PROVING THE this KEYWORD  THEY PRINT THE SAME REFERENCE ID  

//selfMarch20.ClassA5@15db9742
//selfMarch20.ClassA5@15db9742
