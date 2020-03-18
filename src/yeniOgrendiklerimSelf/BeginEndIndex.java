package yeniOgrendiklerimSelf;

public class BeginEndIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="library bile kapali olacakmis bu ara";
		
		System.out.println(x.substring(5,15));
		
		System.out.println(x.substring(15));
		
		System.out.println(x.subSequence(0, 23));
		
		System.out.println(x.indexOf("kapali"));
		
		String a="cim bom bom bom bom";
		
		System.out.println(a.lastIndexOf("bom"));
		
		
	}

}
