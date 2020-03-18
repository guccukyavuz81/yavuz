package yeniOgrendiklerimSelf;

public class CallVoidMethodGrade {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			grade(97.87);
			grade(69.99);
			grade(86.43);
			grade(75.71);
		
		}
			public static void grade (double x) {
				
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
