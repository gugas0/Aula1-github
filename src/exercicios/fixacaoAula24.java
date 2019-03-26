package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class fixacaoAula24 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter an number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b && a > c){
			System.out.println("Higher = "+ a);			
		} 
		else if (b > c){
			System.out.println("Higher = " + b);
		} else {
			System.out.println("Higher = " + c);
		}
		sc.close();
	}
	

}
