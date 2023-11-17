package tarea8a;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		// Realizar un aplicación que genere un número aleatorio entre 1 y 100.
		// El jugador debe ir probando números tratando de acertarlo.
		// El programa debe indicar "mayor" o "menor" según el número secreto sea
		// mayor o menor que el introducido por el usuario.
		// El proceso finaliza cuando el usuario acierta o cuando se rinde
		// (introduciendo un -1).
		int numR = (int) ((Math.random() * 100) + 1);
		int miNum;

		Scanner sc = new Scanner(System.in);
		System.out.println("He pensado en un numero del 1 al 100");
		System.out.println("¿Puedes decirme cual es?");

		miNum = sc.nextInt();

		while (miNum != -1 && miNum != numR) {

			String MoM = (miNum > numR) ? "Es mayor" : "Es menor";
			System.out.println(MoM);

			miNum = sc.nextInt();
		}
		if (miNum == -1) {
			System.out.println("Error!!!" + '\n' + "Fin del programa.");
		}
		if (miNum == numR) {
			System.out.println("Ganaste!!! " + numR + " Era mi numero.");
		}

	}
}
