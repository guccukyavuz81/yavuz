package com.syntax.class07;

public class TaskOffDay {

	public static void main(String[] args) {

		boolean workDay=true;
		int day=1;
		
		while(workDay) {
			if(day<6) {
				System.out.println("day off please");	
				
			}else{
				System.out.println("no more");
				workDay=false;
		}
			day++;
		}
		
	}

}
