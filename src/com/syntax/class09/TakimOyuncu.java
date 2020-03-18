package com.syntax.class09;

public class TakimOyuncu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] teams= {"cimbom--> ","fener--> ","trabzon--> "};
		String[] players= {"falcao","ozan","sorloth"};
		int x,y=0;
		for(x=0; x<teams.length; x++) {
			for(y=0; y<players.length; y++){
				if(x==y) {
					System.out.println(teams[x]+players[y]);
	}
			}
		}
}
}