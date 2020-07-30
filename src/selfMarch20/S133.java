package selfMarch20;

class Product{
	double price;
}


public class S133 {

	public void updatePrice(Product product,double price) {
		price=price*2;
		product.price=product.price+price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product prt=new Product();
		prt.price=200;
		double newPrice=100;
		
		S133 t=new S133();
		t.updatePrice(prt, newPrice);
		System.out.println(prt.price+"  "+newPrice);
	}

}
