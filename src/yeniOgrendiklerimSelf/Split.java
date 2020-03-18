package yeniOgrendiklerimSelf;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String p="Ahmet bey ben anlamadim diyor inanalim mi? yoksa ayak mi cekiyor?";
		String[]s=p.split(" ");
		System.out.println(s.length);
		System.out.println(s[1]);
		//for(int x=0; x<s.length; x++) {
			//System.out.println(s[x]);
		
		for(String a:s) {
			System.out.println(a);
		}
	}

}
