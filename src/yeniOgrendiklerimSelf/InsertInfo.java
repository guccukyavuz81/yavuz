package yeniOgrendiklerimSelf;

class Kisi{
	String name;
	int roll;
	
	void insertinfo(int r, String n ) {
		roll=r;
		name=n;
	}
	
	void displayinfo() {
		System.out.println("benim numaram: "+roll+"  ve de benim ismim: "+name+" dir ona gore...yanlis olmasin alooo..");
	}
}
public class InsertInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kisi s1=new Kisi();
		Kisi s2=new Kisi();
		s1.insertinfo(101, "abuzer");
		s2.insertinfo(102, "necati");
		s1.displayinfo();
		s2.displayinfo();
	}

}
