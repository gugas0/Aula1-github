package exercicios;

import java.util.Scanner;

public class exercicio40 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();

		while (n < 0) {
			System.out.print("N must be positive!\nTry again: " + n);
			n = sc.nextInt();
		}
		
		int higher = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			System.out.print("Value #" + i +": ");
			
			int x = sc.nextInt();
			if (x > higher) {
				higher = x;
			}
		}

		System.out.print("Higher: " + higher);
		sc.close();

	}

}
