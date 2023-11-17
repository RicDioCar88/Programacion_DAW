package duranteClase;

import java.util.Scanner;

public class piramide {

	public static void main(String[] args) {
		// una  piramide con asteriscos
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		n=sc.nextInt();
		System.out.println("Introduce un caracter: ");
		String c=sc.next();
		

		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print(c);
			}
			for(int j=1;j<=i;j++) {
			System.out.print(c);
			}
			System.out.println();
		}

	}

}
