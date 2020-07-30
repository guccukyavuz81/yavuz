package selfMarch20;

public class V18s114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] arr= {{"A","B","C"},{"D","E"}};
		for(int x=0; x<arr.length;x++) {
			for(int y=0; y<arr[x].length;y++) {
				System.out.print(arr[x][y]);
				if (arr[x][y].equals("B")){
					break;
				}
			}
			continue;
		}
	}

}
