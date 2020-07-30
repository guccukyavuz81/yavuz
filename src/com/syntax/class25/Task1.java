package com.syntax.class25;

interface WebDriver{
	String fileExtension=".png";
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}
interface Download{
	void download();
	static void upload() {
	System.out.println("uploads too");	
	}
	default void slow() {
	System.out.println("downloads slow");	
	}
}
class ChromeDriver implements WebDriver,Download{

	@Override
	public void openBrowser() {
		System.out.println("open chrome browser");	
	}
	@Override
	public void closeBrowser() {
		System.out.println("close chrome browser");	
	}
	@Override
	public void maximizeWindow() {
		System.out.println("maximize chrome window");	
	}
	@Override
	public void findElement() {
		System.out.println("chrome find that element nowww!!!");	
	}
	@Override
	public void download() {
		System.out.println("chrome download that app now");
		
	}
}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("open firefox browser");	
	}
	@Override
	public void closeBrowser() {
		System.out.println("close firefox browser");	
	}
	@Override
	public void maximizeWindow() {
		System.out.println("firefox maximize the window");	
	}
	@Override
	public void findElement() {
		System.out.println("firefox could u possibly find that element if u don't mind?");	
	}
}



public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver w=new ChromeDriver();
		w.openBrowser();
		w.closeBrowser();
		w.maximizeWindow();
		w.findElement();
		System.out.println("------------------------------------");
		WebDriver wb=new FirefoxDriver();
		wb.openBrowser();
		wb.closeBrowser();
		wb.maximizeWindow();
		wb.findElement();

		Download d=new ChromeDriver();
		d.download();
		System.out.println(WebDriver.fileExtension);
		d.slow();
		Download.upload();

	}

}
