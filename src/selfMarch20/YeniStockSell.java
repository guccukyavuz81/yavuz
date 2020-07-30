package selfMarch20;

public class YeniStockSell {

	private static int stock=10;
	static int  qty;
	public  void purchase(int qty) {
		this.qty=qty;
		stock+=qty;
	}
	public  void sell(int qty) {
		this.qty=qty;
		stock-=qty;
	}
	public static void printStock(String action) {
		System.out.println(action+":"+qty+"items.Stock in Hand: "+stock);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		YeniStockSell k1=new YeniStockSell();
		k1.sell(5);
		k1.printStock("Sold");
		YeniStockSell k2=new YeniStockSell();
		k2.purchase(5);
		k2.printStock("Purchased");
		
		
	}

}
