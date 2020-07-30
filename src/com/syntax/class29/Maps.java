package com.syntax.class29;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<String, String> hm=new LinkedHashMap<>();
		hm.put("Name", "Necati");
		hm.put("LastName", "Kilkuyruk");
		hm.put("Address", "Zafer mah.Savas sok.Rizeliler firini ustkat");
		
		System.out.println(hm);
		System.out.println(hm.size());
		hm.put("Name", "Abuzer");
		System.out.println(hm.get("Name"));
		
		hm.replace("LastName", "kulyutmaz");
		System.out.println(hm);
	}

}
