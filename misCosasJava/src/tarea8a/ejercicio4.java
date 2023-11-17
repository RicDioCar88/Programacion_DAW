package tarea8a;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// Escribir una aplicación que pida un número n, y escriba los números desde 1
		// hasta n.

		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa el numero deseado: ");
		
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print(i+"/");
		}

	}

}
