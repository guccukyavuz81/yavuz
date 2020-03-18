package yeniOgrendiklerimSelf;

class Studenttt{
	
String name;
int age;
int roll;
char grad;
void speak() {
System.out.println("my name is "+name+ " my age is  "+age+" my roll is "+roll+" my graade is "+grad);
}
void grade(int avrg){	
if((avrg>70) &&(avrg<=100)) {
	grad='A';
}else if((avrg>50)&&(avrg<=70)){
    grad='B';
}else  {
	grad='F';
}
System.out.println(grad);
}	
}
public class TestClassMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studenttt s1=new Studenttt();
		Studenttt s2=new Studenttt();
		
		s1.name="Ali";
		s1.age=15;
		s1.roll=101;
		s2.name="servet";
		s2.age=38;
		s2.roll=102;
		s1.grade(45);
		s2.grade(90);
		s1.speak();
		s2.speak();
		
	}

}
