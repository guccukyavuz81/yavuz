package yeniOgrendiklerimSelf;

class Team{
	
	String name;
	int star;
	String color;

	void Team(String n,int s,String c) {
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
		
		c.Team("cimbom", 4, "yellowred");
		f.Team("fener", 3, "yellowdeepblue");
		b.Team("besiktas", 3, "blackwhite");
		c.display();
		f.display();
		b.display();

		

	}

}
