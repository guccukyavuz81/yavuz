package com.syntax.class24;

abstract class File{
	String file;
	public File(String file) {
		this.file = file;
	}
	abstract void open();
	void edit() {
	System.out.println(file+" opens");	
	}
	void close() {
	System.out.println(file+" closes");	
	}
}
class Javafile extends File{
	public Javafile(String file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	@Override
	void open() {
		System.out.println("javafile opens with notepad");
	}
}
class Wordfile extends File{
	public Wordfile(String file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	@Override
	void open() {
		System.out.println("wordfile opens with microsoft office");
	}
}
class Pdffile extends File{
	public Pdffile(String file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	@Override
	void open() {
		System.out.println("pdffile opens with adobe");
	}
}




public class Task2 {

	public static void main(String[] args) {
//		Create a class File that will have the following behaviors: open, edit, close. 
//		Edit and close are implemented method while open is an abstract. 
//		Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour: 
//	    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need 
//	    Microsoft word to be installed etc

		File [] files= {new Javafile("Javafile"),new Wordfile("WordFile"),new Pdffile("PDFFile")};
		for(File f:files) {
			f.open();
			f.edit();
			f.close();
		}

	}

}
