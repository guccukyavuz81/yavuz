package com.syntax.class21;

public class TestTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher t=new Teacher("badi ","ekrem");
		t.display();
		MathTeacher m=new MathTeacher("mahmut ","hoca");
		m.display();
		MathTeacher mk=new MathTeacher("tarih");
		mk.son();
	}

}
