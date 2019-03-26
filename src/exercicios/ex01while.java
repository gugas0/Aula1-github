package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex01while {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Password: ");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida!");
			System.out.print("Digite novamente: ");
			senha = sc.nextInt();
			
		}
		
		System.out.println("Senha correta!\nSeja bem vindo!");
		
		sc.close();
	}

}
