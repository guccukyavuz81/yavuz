package yeniOgrendiklerimSelf;

public class PassingValueIntoString {

	public static void main(String[] args) {
		// how to pass values into string using %s(for string) %d(for integers) %f(for decimals)
		
		String sentence="%s is %d years old.";
		
		int age=35;
		String name="Ahmet";

		System.out.printf(sentence, name,age);
		
	}

}
