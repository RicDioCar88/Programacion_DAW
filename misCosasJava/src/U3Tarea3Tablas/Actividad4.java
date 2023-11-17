package U3Tarea3Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		/*
		 * Juego: La cámara secreta. El jugador especifica el número de dígitos de la
		 * clave secreta. La aplicación genera de forma aleatoria, una combinación
		 * secreta de n dígitos del 1 al 5 (siendo n la longitud indicada anteriormente
		 * por el usuario). El jugador introduce ahora una combinación de prueba. En
		 * cada intento se mostrará como pista, para cada dígito, si es mayor menor o
		 * igual que el correspondiente de la combinación secreta. 
		 * Ejemplo: 
		 * -Introduzca longitud de la clave 
		 * -3 (se genera la clave secreta, por ejemplo 152)
		 * -Intente acertarla -351 -3 es mayor, 5 es igual, 1 es menor - Intente
		 * acertarla de nuevo ...
		 */
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("-Introduzca longitud de la clave: "); // Tamaño del array
		n = sc.nextInt();
		int[] clave = new int[n];
		int[] miCombinacion = new int[n];

		for (int i = 0; i < n; i++) {
			clave[i] = (int) (Math.random()*5)+1;
		}
		for (int j = 0; j < n; j++) {
			System.out.print(clave[j]);
		}
		System.out.println();
		System.out.println("Se ha generado la clave secreta...");
		System.out.println("Intente acertarla");
		System.out.println("Ingresa " + n + " dígitos:");
		
		for (int i=0;i<n;i++) {
			miCombinacion[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(miCombinacion[i]);
		}
		System.out.println();
		do {
			for(int z=0;z<n;z++) {
				if(miCombinacion[z]==clave[z]) {
					System.out.println("Acertaste en el valor ["+z+"]");
				}else if(miCombinacion[z]<clave[z]) {
					//System.out.println(miCombinacion[z]+" es Menor que "+clave[z]);
					System.out.println(miCombinacion[z]+" es Menor.");
				}else {
					//System.out.println(miCombinacion[z]+" es mayor que "+clave[z]);
					System.out.println(miCombinacion[z]+" es mayor.");
				}
			}
			System.out.println("Intentalo de nuevo...");
			for (int i=0;i<n;i++) {
				miCombinacion[i]=sc.nextInt();
			}
		}while(!(Arrays.equals(miCombinacion,clave)));
		
		System.out.println("Ganaste!!!");
		
	}

}
