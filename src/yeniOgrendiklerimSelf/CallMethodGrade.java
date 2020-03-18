package yeniOgrendiklerimSelf;

public class CallMethodGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		grade(75.79);
		grade(69.99);
		grade(95.99);
		grade(88.29);
	}
	public static void grade(double x) {
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
		System.out.println(grade);
	}
}
 