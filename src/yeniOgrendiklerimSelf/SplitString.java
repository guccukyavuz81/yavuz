package yeniOgrendiklerimSelf;

public class SplitString {

	public static void main(String[] args) {
		

		String a="TENCERE TAVA YINE GELDI JAVA";
		
		String [] b=a.split(" ");
		
		for(int x=0; x<b.length; x++ ) {
			System.out.println(b[x]);
			
		}
		System.out.println(".........YA DAAA......................");
		
		String [] c=a.split(" ",4);
		
		for(int y=0; y<c.length; y++) {
		System.out.println(c[y]);	
		}
	}

}
