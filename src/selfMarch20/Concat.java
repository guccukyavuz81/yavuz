package selfMarch20;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String[] strs={"A","B"};
	        int idx=0;
	        for (String s : strs) {
	            strs[idx].concat("element "+idx);
	            idx++;
	            System.out.print(s);
	        }
	        
	}

}
