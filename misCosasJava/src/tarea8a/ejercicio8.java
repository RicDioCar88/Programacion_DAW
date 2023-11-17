package tarea8a;

import java.util.Scanner;

public class ejercicio8 {
	
	public static long factorial(long numero) {
		if(numero==0) {
			return 1;
		}
		long factorial=1;
		while(numero>1) {
			factorial=factorial*numero;
			numero--;
		}
		
		return factorial;
	}

	public static void main(String[] args) {
		int numero;
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduzca el numero para el que quiere calcular el factorial: ");
		
		numero =teclado.nextInt();
		
		System.out.println("El factorial de "+numero+" es "+factorial(numero));
		System.out.println("Fin");
		/*
		// Pedir un número y calcular su factorial.
		int num;
		int res=1;
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingresa un numero;");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {;
			res*=i;
		}
		System.out.println(num+"!"+" = "+res);
		
		/*
		 * 
		*/

	}

}
