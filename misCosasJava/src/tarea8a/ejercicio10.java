package tarea8a;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// Implementar una aplicación que pida un número al usuario entre el 1 y el 10,
		// y calcule su tabla de multiplicar.
		// El código debe asegurarse de que el número introducido está entre 1 y 10, y
		// si no es así, volver a pedirlo hasta que lo cumpla.
		int f1;
		int f2 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el factor1");
		f1 = sc.nextInt();

		/*
		 * if(factor1<=0 || factor1>=11) { System.out.println("Factor incorrecto!"); }
		 */

		while(f1<=0 || f1>=11) {
			System.out.println("Ingresa un numero correcto");
			f1 = sc.nextInt();
		}
		while (f1 >= 1 && f1 <= 10 && f2 < 11) {
			System.out.println("La tabla de multiplicar del " + f1 + " es:");
			for (f2 = 1; f2 <= 12; f2++) {
				int resultado = f1 * f2;

				System.out.println(f1 + " * " + f2 + " = " + resultado);
			}
		}

	}

}
