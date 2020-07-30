package com.syntax.class26;
class Registration{
	private String email;
	private String userName;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.contains("yahoo")) {
			this.email = email;	
		}else {
			System.out.println("must be yahoo email");
		}
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		if(!userName.isEmpty()&&userName.length()>6 ){
			this.userName = userName;	
		}	
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(!password.isEmpty()){
		if(password.length()>6 ) {
			if(!password.contains(userName)) {
				this.password = password;	
			}else {
				System.out.println("can't contain username");
			}	
		}else {
			System.out.println("password can't be less than 7 char");
		}	
	}else {
		System.out.println("password can't be empty");
	}
	
}
}
public class TaskEnc {

	public static void main(String[] args) {
//		Create Registration Class in which you would have variables as email, userName and password 
//		that have an access scope only within its own class. After creating an object of the class user 
//		should be able to call methods and in each method separately pass values to set users email, username and password. 
//		Requirements: 
//		Valid email consider to be only yahoo
//		Valid userName and password cannot be empty and should be of length larger than 6 characters.
//		Also valid password cannot contain userName.

		Registration r=new Registration();
		r.setEmail("kyavuz81@yahoo.com");
		r.setUserName("guccukyavuz81");
		r.setPassword("Kyavuz81");
		System.out.println(r.getEmail());
		System.out.println(r.getUserName());
		System.out.println(r.getPassword());


	}

}
