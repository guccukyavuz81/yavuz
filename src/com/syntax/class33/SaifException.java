package com.syntax.class33;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class SaifException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		listException();
		}
		public static void listException() {
			List<Exception> e = new ArrayList<>();
			NullPointerException npe=new NullPointerException();
			ArithmeticException ae=new ArithmeticException();
			FileNotFoundException fnf=new FileNotFoundException();
			IndexOutOfBoundsException iob=new IndexOutOfBoundsException();
			try {
				e.add(npe);
			} catch (Exception np) {
				System.out.println("Exception name is= " + np);
			}
			try {
				e.add(ae);
			} catch (Exception a) {
			}
			try {
				e.add(fnf);
			} catch (Exception e1) {
			}
			try {
				e.add(iob);
			} catch (Exception e1) {
			}
			for(Exception a:e) {
				if(a.equals(npe)) {
					System.out.println("Exception name = " + "NullPointerException");
				}else if(a.equals(ae)) {
					System.out.println("Exception name = " + "ArithmeticException");
				}else if(a.equals(fnf)) {
					System.out.println("Exception name = " + "FileNotFoundException");
				}else if(a.equals(iob)) {
					System.out.println("Exception name = " + "IndexOutOfBoundsException");
				}
			}

	}

}
