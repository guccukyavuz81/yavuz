package com.syntax.class19;

class Book{
	String author;
	int pages;
	
	Book(String author){
	this.author=author;	
	System.out.println(" ay em da otir "+author);
	}
	Book(int pages){
	this.pages=pages;	
	System.out.println(" ay hev "+pages+" peycis");
	}
	//void displayauthor(){
	//	System.out.println("kitabin yazari "+author);
	//}
	//void displaypages() {
	//	System.out.println("aha da bu kitap "+pages+" sayfa yuhhhhh");
	//}

}
public class Task2 {

	public static void main(String[] args) {
		// Write program as a Book class   that will have 2 Constructors. While creating an object make sure:
		//Instance variables are being initialized
		//Both Constructors are being executed
		Book b=new Book("aleksandir kitapkurduyev");
		Book c=new Book(1234567899);
	//	b.displayauthor();
	//	c.displaypages();

		

	}

}
