package tarea8a;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// Desarrollar un programa que solicite los valores mínimo y máximo de un rango. 
		// A continuación, solicitará por teclado un valor que debe estar dentro del rango. 
		// Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.
		
		int min;
		int max;
		int val;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el valor minimo de un rango: ");
		min=sc.nextInt();
		System.out.println("Ingresa el valor maximo de un rango: ");
		max=sc.nextInt();
		
		for(int i=min;i<=max;i++) {
			//System.out.println(i);
		}
		System.out.println("Se generó un rango de numeros...");
		System.out.println("Ingresa un numero(val ∈ rango)");
		val=sc.nextInt();
		
		while(val<min || val>max) {
			System.out.println("Ese numero no esta dentro del rango.");
			System.out.println("Ingresa otro numero(val ∈ rango)");
			val=sc.nextInt();
		}
		System.out.println("Genial ese valor se encuentra dentro del rango!");
		
		

	}

}
