package yeniOgrendiklerimSelf;
class deneme{
	
	static int sum(int x1,int x2) {
		int total=0;
		for(int x=x1; x<=x2; x++) {
	    total=total+x;
		
		}
		return total;
	}
	
	
	
	
}
public class CallReturnMethod {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CallReturnMethod call= new CallReturnMethod();
		//System.out.println(call.sum(1,100));
		// eger object olsuturursak static olmadan da objrefervariable ile call yapabiliyoruz
		//eger object yoksa call etmek icin STATIC METHOD olmak zorunda
		
		System.out.println(deneme.sum(1,10));
	}

}
