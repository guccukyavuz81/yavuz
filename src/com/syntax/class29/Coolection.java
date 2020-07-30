package com.syntax.class29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Coolection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> city=new ArrayList<>();
		city.add("Paris");
		city.add("Ankara");
		city.add("London");
		city.add("Amsterdam");
		city.add("Dhaka");
		
		Collections.sort(city);
		System.out.println(city);
		
		
	}

}
