package selfMarch20;

public class S173 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[]= {2010,2013,2014,2015,2014};
		int key=2014;
		int count=0;
		for(int e:data) {
			if(e!=key) {
				continue;
			//	count++;  Unreachable code
			}
		}
	}

}
