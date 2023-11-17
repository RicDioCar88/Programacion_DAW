package U3.enClase;

import java.util.Scanner;

public class dobleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub, que solicite si es descendente o ascendente
		final int TAM = 50;
		int[] pares = new int[TAM];
		int j = 0;
		int[] impares = new int[TAM];
		int k = 0;
		String ori; // variable para recibir la orientacion por consola(asc o desc)

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cómo deseas que se imprima el resultado?");
		System.out.println("1. De manera ascendente(''asc'')");
		System.out.println("2. De manera descendente(''desc'')");
		ori = sc.next();

		while (!(ori.equals("asc") || ori.equals("desc"))) {
			System.out.println("Opcion incorrecta");
			System.out.println("Siga intentando...");
			ori = sc.next();
		}

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				pares[j] = i;
				j++;
			} else {
				impares[k] = i;
				k++;
			}
		}

		if (ori.contentEquals("asc")) {
			for (int i = 0; i < TAM; i++) {
				System.out.println("Pares[" + i + "]:" + pares[i]);
			}

			System.out.println("----------------------");

			for (int i = 0; i < TAM; i++) {
				System.out.println("Impares[" + i + "]:" + impares[i]);
			}

		} else if (ori.contentEquals("desc")) {
			for (int i = TAM - 1; i >= 0; i--) {
				System.out.println("Pares[" + i + "]:" + pares[i]);
			}

			System.out.println("----------------------");

			for (int i = TAM - 1; i >= 0; i--) {
				System.out.println("Impares[" + i + "]:" + impares[i]);
			}
		}

	}

}
