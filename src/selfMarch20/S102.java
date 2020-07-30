package selfMarch20;

public class S102 {

	String myStr="7007";
	public void doStuff(String str) {
		int myNum=0;
		try {
			String myStr=str;
			myNum=Integer.parseInt(myStr);
		}catch(NumberFormatException ne) {
			System.err.println("error");
		}
		System.out.println("myStr: "+myStr+" myNum:" +myNum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       S102 s=new S102();
       s.doStuff("9009");
		
	}

}
