package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class fixacaoAula17pt2 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you full name: ");
		String name = sc.nextLine();
		
		System.out.println("How many bedrooms are there in tour house?");
		int n1 = sc.nextInt();
		
		
		System.out.println("Enter product price: ");
		double n2 = sc.nextDouble();

		System.out.println("Enter you last name, age and height(same line)");
		String lastName = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		
		System.out.println("Full name: " +name);
		System.out.println("Bedrooms: " +n1);
		System.out.println("Product price: "+n2);
		System.out.println("Last name: " + lastName +
							"\nAge: "+ age +
							"\nHeight: " + height);
		
		sc.close();
	}

}
