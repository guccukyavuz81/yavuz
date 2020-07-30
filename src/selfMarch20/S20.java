package selfMarch20;

public class S20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char colorcode='y';
		int color=0;
		switch(colorcode) {
		case 'r':
			color =100;
			break;
		case 'b':
			color=10;
			break;
		case'y':
			color=1;
			break;
		}
		System.out.println(color); //color cannot be resolved to a variable
	}

}
