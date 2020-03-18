package yeniOgrendiklerimSelf;

public class Dollar {

	public static void main(String[] args) {
		// $$$$    22 23 32 33 
	   //  $  $
	   //  $  $
		// $$$$

		for(int x=1; x<=4; x++) {
			for(int y=1; y<=4; y++) {
				if(((x==2)&&(y==2)) || ((x==2)&&(y==3)) || ((x==3)&&(y==2)) || ((x==3)&&(y==3))){
					System.out.print(" "+" ");
					continue;
				}
			 System.out.print("$"+" ");
			}System.out.println();
		}
		
	}

}
