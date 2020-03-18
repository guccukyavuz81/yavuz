package yeniOgrendiklerimSelf;

class Team{
	
	String name;
	int star;
	String color;

	void input(String n,int s,String c) {
		name=n;
		star=s;
		color=c;
	}
	void display() {
	System.out.println("we are "+name+" our color is "+color+" we have "+star+" stars");	
	}
}

public class ObjMetClsPrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Team c=new Team();
		Team f=new Team();
		Team b=new Team();
		
		c.input("cimbom", 4, "yellowred");
		f.input("fener", 3, "yellowdeepblue");
		b.input("besiktas", 3, "blackwhite");
		c.display();
		f.display();
		b.display();

		

	}

}
