package duranteClase;

import java.util.Scanner;

public class factorialRecursivo {

	public static long factorial(long numero) {
		if (numero <= 1) {
			return 1;
		}
		return numero * factorial(numero - 1);
	}

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el numero para el que quiere calcular el factorial: ");

		numero = sc.nextInt();

		System.out.println("El factorial de " + numero + " es " + factorial(numero));
		System.out.println("Fin");
	}
}
