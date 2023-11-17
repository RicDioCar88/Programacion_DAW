package tarea8b;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
		// los 5
		// primeros números enteros a partir de uno que se introduce por teclado.

		int num;
		int cuad;
		int cubo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero:");
		num=sc.nextInt();
		
		for(int i=num;i<=num+4;i++) {
			
			cuad= i*i;
			cubo=i*i*i;
			
			//System.out.print(i+"^"+2+"="+cuad+"     ");
			System.out.printf("%3d ^ %1d = %-2d      ",i,2,cuad);
			System.out.printf("%3d ^ %1d = %3d",i,3,cubo);
			System.out.println();
			//System.out.println(i+"^"+3+"="+cubo);
			
		}
	}

}
