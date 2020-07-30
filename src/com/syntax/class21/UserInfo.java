package com.syntax.class21;

public class UserInfo extends UserClass{

	String useraddress;
	UserInfo(String useraddress){
		super("ali "," 03153519872 ");
		this.useraddress=useraddress;
	}
	void userDetails() {
		System.out.println(name+mobile+useraddress);
	}
}
