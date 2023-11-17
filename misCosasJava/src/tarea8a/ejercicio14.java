package tarea8a;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		// Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello asteriscos (*). Por ejemplo, para n=4:
		int n;
		int count;
		String as="*";
		String as2="o";
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa un numero (n)");
		n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
