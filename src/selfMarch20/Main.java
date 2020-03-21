package selfMarch20;
class Tesst   {  
    int i;   
    public Tesst(int k)  {  
        i=k;  
        }  
    public Tesst(int k, int m) {  
        System.out.println("Hi I am assigning the value max(k, m) to i");  
        if(k>m) {  
            i=k;   
        }  
        else {  
            i=m;  
        }  
   }   
}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Tesst test1 = new Tesst(10);  
	        Tesst test2 = new Tesst(12, 15);  
	        System.out.println(test1.i);  
	        System.out.println(test2.i); 
	}
}
//BU COK SHIK BUNA BAK