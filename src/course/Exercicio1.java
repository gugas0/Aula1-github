package course;

import java.util.Locale;

public class Exercicio1 {

	public static void main(String[] args) {
		
		String product1 =	"Computer";
		String product2 =	"Office desk";

		int age =		30;
		int code =		5290;
		char gender =	'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f", product1, price1);
		System.out.printf("%n%s, which price is $ %.2f", product2, price2);
		System.out.println("\n");
		System.out.printf("Record: %d years old, code %d and gender: %c", age, code, gender);
		System.out.println("\n");
		System.out.printf("Measue with decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decial places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal pont: %.3f%n", measure);
		
		
	}

}
