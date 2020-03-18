package yeniOgrendiklerimSelf;

public class StringMethodToUPPERlOWERcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="niaber yaw eyimisiniz";
		System.out.println(x.toUpperCase());
		
		String y="NABER";
		System.out.println(y.toLowerCase());
		
		System.out.println("x in ilk character sununla bulunuyor :    "+ x.charAt(0));
		System.out.println("x in character sayisi :  " +x.length());
		// burda length i array dekiyle ayni yazamiyoruz length() gerekiyor
		System.out.println("x in 5 index sayili elemani  : "+x.charAt(5));
		System.out.println("bir de tam tersini yerini veren indexOf var:   "+ x.indexOf("r"));
		// indexOf first occurance i veriyor yani birden fazla gecen karakterin ilkinin yerini soyluyor
		System.out.println("x in icindeki yaw substring deniyor index sayilarina gore   :  "+x.substring(7,10));
		
		String t="we r the \"CIMBOM\" HUAA";
		System.out.println(t);
		String r="i\'m tired";
		System.out.println(r);
		String z="backslash \\";
		System.out.println(z);
		String h="hello\r\nworld";
		// \r or \n creates a new line \r\n gives a single line \r\r or \n\r or \n\n gives a double line
		System.out.println(h);
		String b=("hi\tbye");
		System.out.println(b);
		
	
	}

}
