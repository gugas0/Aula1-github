package course;

import java.util.Scanner;

public class sec2aula24 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer number: ");
		int n1 = sc.nextInt();
		
		if (n1 % 2 == 0) {
			System.out.println("Even!");
		}else {
			System.out.println("Odd!");
		}
		
		System.out.println("-------------Hours------------------");
		
		System.out.println("What time is it?");
		int time = sc.nextInt();
		
		if (time < 12) {
			System.out.println("Good morning!");
		} 
		else if (time < 18) {
			System.out.println("Good afternoon!");
		} else {
			System.out.println("Good evening!");
		}
		
		sc.close();
	}

}
