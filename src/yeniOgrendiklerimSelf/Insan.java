package yeniOgrendiklerimSelf;

public class Insan {

	String name;
	int age;
	
	void speak() {
		System.out.println(name);
	}
	static int multip(int x, int y) {
	int mult=x*y;
	return mult;
	//System.out.println(sum);
	}
	static int toplam(int a, int b){
	int sum=a+b;
	return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Insan i1=new Insan();
		//Insan i2=new Insan();
		//i1.name="Ali";
		//i2.name="Kemal";
		//System.out.println(i1.name);
		//System.out.println(i2.name);
		
		//i1.speak();
		//i2.speak();
		System.out.println(multip(3, 10));
		
		System.out.println(toplam(35, 87));
		
	}

}
