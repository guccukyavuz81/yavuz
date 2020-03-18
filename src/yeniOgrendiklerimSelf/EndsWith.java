package yeniOgrendiklerimSelf;

public class EndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="cimbom";
		
		System.out.println(x.endsWith("m"));
		System.out.println("..............................................................");
		
		//replace method
		
		System.out.println(x.replace("cim","bom"));
		System.out.println("..............................................");
		
		
		System.out.println(x.indexOf('m'));
		System.out.println(x.lastIndexOf('m'));
		
		String y="cimbom sampiyon oley";
		
		System.out.println(y.indexOf("oley"));
		
		String a="gasdamonu";
		String b="angara ";
		if(a.compareTo(b)<0) {
			System.out.println(a+b);
		}else {
			System.out.println(b+a);
		}
		
	}

}
