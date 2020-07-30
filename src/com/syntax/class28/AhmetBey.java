package com.syntax.class28;
import java.util.*;
public class AhmetBey {

	
		public static void main(String[] args) {
			List<String>Ilist= new ArrayList();
			Ilist.add("Farid");
			Ilist.add("Saif");
			Ilist.add("Aaron");
			Ilist.add("Ismail");
			Ilist.add("Brian");
			Ilist.add("Turker");
			Ilist.add("Al");
			//remove names shorter than 5 char
			
			System.out.println(Ilist.contains("Farid"));
			
			Ilist.removeIf(str ->str.length()<=4);  //using lambda expression
			
//			Iterator<String> it=Ilist.iterator();
//			while(it.hasNext()) {		
//				if(it.next().length()<=4) {
//					it.remove();
//				}
//			}
		System.out.println(Ilist);
		}
	}
				



