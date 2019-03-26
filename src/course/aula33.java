package course;

import java.util.Scanner;

public class aula33 {

	public static void main(String[] args) {
		
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter three numbers: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			/*if (a > b && a > c) {
				System.out.println("Higher = " +a);
			} 
			else if (b > c) {
				System.out.println("Higher = " + b);
			}
			else {
				System.out.println("Higher = " +c );
			}*/
			
			int heigher = max(a, b, c);
			
			showResult(heigher);
			
			
			
			sc.close();

		}
		
		public static int max(int x, int y,int z) {
			int aux;
			if (x > y && x > z) {
				aux = x;
			}
			else if (y > z) {
				aux = y;
			}
			else {
				aux = z;
			}
			
			return aux;
		}
		
		public static void showResult(int value) {
			System.out.println("Heigher: " + value);
		}

	}


