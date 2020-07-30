package selfMarch20;

public class V18s44 {

	public static void menu() {
		System.out.println("1.left 2.right 0.stop");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int option=5;
		do {
			menu();
			System.out.println(option);
			option--;
		}while(option!=0);
		
	}

}
