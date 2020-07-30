package com.syntax.class21;

public class Task1 {

	public static void main(String[] args) {
// Write program: userClass  that has a constructor that initializes instance variable name 
//and mobile number. Create a subclass  userInfo that will have user address variable and it 
//also being initialized through constructor call. Print users name, mobile number and address in userDetails method. Test your code.

		UserClass u=new UserClass("abuzer ","3743746");
		u.display();
		UserInfo us=new UserInfo("19 mayis cad. cumhuriyet sok.");
		us.userDetails();
	}

}
