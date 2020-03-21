package yeniOgrendiklerimSelf;

public class CallMethodGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(grade(75.79));
		System.out.println(grade(69.99));
		System.out.println(grade(95.99));
		System.out.println(grade(88.29));
	}
	 static char grade(double x) {
		char grade;
		
		if(x>=90) {
		grade='A';
		}else if(x>=80) {
		grade='B';
		}else if(x>=70) {
		grade='C';
		}else {
		grade='F';
		}
		return grade;
		//System.out.println(grade);
	}
}
 