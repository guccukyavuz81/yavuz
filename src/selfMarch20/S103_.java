package selfMarch20;

public class S103_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] arr= {{"a","b","c"},{"d","e"}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				if(arr[i][j].equals("b")) {
					continue;
				}
			}
			continue;
		}
	}

}
