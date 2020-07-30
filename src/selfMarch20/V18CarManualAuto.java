package selfMarch20;

class Vehiclee{
	String type="4W";
	int maxSpeed=100;
	
	Vehiclee(String type,int maxSpeed){
		this.type=type;
		this.maxSpeed=maxSpeed;
	}
	Vehiclee(){}
}
public class V18CarManualAuto extends Vehiclee{

	String trans;
	V18CarManualAuto(String trans){
		this.trans=trans;
	}
	V18CarManualAuto(String type,int maxSpeed,String trans){
		super(type,maxSpeed);
		this.trans=trans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V18CarManualAuto c1=new V18CarManualAuto("Auto");
		V18CarManualAuto c2=new V18CarManualAuto("4W",150,"Manual");
		System.out.println(c1.type+" "+c1.maxSpeed+" "+c1.trans);
		System.out.println(c2.type+" "+c2.maxSpeed+" "+c2.trans);

		
	}

}
