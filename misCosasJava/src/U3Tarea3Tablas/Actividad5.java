package U3Tarea3Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5 {

	public static void Burbuja(int[] table) {
		for (int i = 0; i < table.length - 1; i++) {
			for (int j = 0; j < table.length - i - 1; j++) {
				if (table[j] > table[j + 1]) {
					int temp = table[j];
					table[j] = table[j + 1];
					table[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		final int n = 6;

		// Leer una serie de 6 enteros que se almacenarán en una tabla que hay que
		// ordenar y mostrar.
		// Hacer lo mismo con otra serie de 6 enteros. A continuación, fusionar las dos
		// tablas en una
		// tercera, de forma que los 12 números sigan ordenados. Fusionar significa
		// copiar en el
		// orden correcto para que los datos resultantes continúen ordenados sin
		// necesidad de
		// volver a realizar una ordenación.
		Scanner sc = new Scanner(System.in);

		int[] tabla1 = new int[n];
		System.out.println("Ingresa 6 numeros");
		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = sc.nextInt();
		}
		Burbuja(tabla1);
		System.out.println("Array ordenado: " + Arrays.toString(tabla1));

		int[] tabla2 = new int[n];
		System.out.println("Ingresa otros 6 numeros");
		for (int j = 0; j < tabla2.length; j++) {
			tabla2[j] = sc.nextInt();
		}
		Burbuja(tabla2);
		System.out.println("Array ordenado: " + Arrays.toString(tabla2));

		int[] tabla3 = new int[tabla1.length + tabla2.length];
		int x = 0;

		for (int i = 0; i < tabla1.length; i++) {
			tabla3[x] = tabla1[i];
			x++;
		}
		for (int j = 0; j < tabla2.length; j++) {
			tabla3[x] = tabla2[j];
			x++;
		}

		for(int y=0;y<tabla3.length;y++) {
			System.out.print(tabla3[y] + ",");
		}
		System.out.println();
		Burbuja(tabla3);
		System.out.println(Arrays.toString(tabla3));
	}

}
