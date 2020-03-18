package yeniOgrendiklerimSelf;
import java.util.Scanner;
public class ReyhanQuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner (System.in) ;
        System.out.println("How many animals do you have?");
        int num= scan.nextInt();
        System.out.println(num);
        String [] animals= new String [num];
        
        
        for (int i=0; i<num; i++) {
        	System.out.println("Give me an animal name :");
             animals[i]=scan.next(); 
            
            
        }
        
        System.out.println("These are anilmals : ");
        for (String animal : animals) {
            System.out.print(animal+" ");
            
        }
        
       
       
       
       
       
       
       
       
       
       
              
       
   }

	}


