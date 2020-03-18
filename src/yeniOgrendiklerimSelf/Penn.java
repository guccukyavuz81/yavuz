package yeniOgrendiklerimSelf;

public class Penn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pen p=new Pen();
		System.out.println(p.color);
		System.out.println(p.type);
		System.out.println(p.point);
		
		System.out.println(p.clicked);
		p.click();
		System.out.println(p.clicked);
		p.unclick();
		System.out.println(p.clicked);
	}

}
