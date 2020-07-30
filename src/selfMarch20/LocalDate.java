package selfMarch20;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime dt=LocalDateTime.of(2014,7,31, 1,1);
		System.out.println(dt);  // 2014-07-31T01:01 veriyor zaten
	
		
		//System.out.println(dt format(DateTimeFormatter.ISO_DATE)); //The method dt(DateTimeFormatter) is undefined for the type LocalDate
	}

}
