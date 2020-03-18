package yeniOgrendiklerimSelf;

public class String3Charc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="cimbomm";
		if(!s.isEmpty()) {
			if((s.length() %2==1)&&(s.length() >=3)){
				System.out.println(s.charAt(s.length()/2));
			}
		}
	}

}
