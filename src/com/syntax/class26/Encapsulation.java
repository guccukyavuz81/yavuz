package com.syntax.class26;
class Info{
	private String name;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
	if(!email.isEmpty()&&(email.length()<20)&&(email.contains("@gmail.com"))){
		this.email = email;
	}	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(!name.isEmpty()&&(name.length()<5)) {
			this.name = name;	
		}else {
			System.out.println("name can't be empty and can't exceed 4 characters");
		}
	}
}
public class Encapsulation {
public static void main(String[] args) {
	Info i=new Info();
	i.setName("ali");
	System.out.println(i.getName());
	i.setEmail("kyavuz81@gmail.com");
	System.out.println(i.getEmail());
}
}
