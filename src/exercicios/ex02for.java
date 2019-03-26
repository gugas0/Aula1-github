package exercicios;

import java.util.Scanner;

public class ex02for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int n = sc.nextInt();
		
		int x = n;
		for (int i = 1; i <= x; i++) {
			if(i >= 10 && i <=20) {
				System.out.println("in");
			} else {
				System.out.println("out");
			}
		}
		
		
		sc.close();

	}

}
