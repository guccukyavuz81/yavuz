package yeniOgrendiklerimSelf;

public class VoidWithReturnGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		grade(80);
		grade(110);
		grade(90);
		grade(70);		
	}	
		public static void grade (double x) {
			
		    char grade=0;
			if(x<0 || x>100) {
			System.out.println("invalid");
			return;
			}
			else if(x>=90) {
			grade='A';
			}else if(x>=80) {
			grade='B';
			}else if(x>=70) {
			grade='C';
			}else {
			grade='F';
			}
			System.out.println(grade);	
	}
// coz void can't return, it jumps out... 
}
