package selfMarch20;

public class S124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double discount=0;
		//int qty=Integer.parseInt(args[0]);
		int qty=85;
		//discount=(qty>=90) ? 0.5 : 0;
		//discount=(qty>80) ? 0.2 : 0;  //birincide verdigi 0.5 degerini burda da >80 oldugu icin 0.2 ye ceviriyor
		
		if(qty>=90) {
			discount=0.5;
		}
		if(qty>80 && qty<90) {
			discount=0.2;
		}
		
		System.out.println(discount);
	}

}
