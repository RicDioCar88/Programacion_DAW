package U3Tarea1Funciones;

import java.util.Scanner;

public class Actividad3 {
	
	public static void cilindro(int eleccion, double r, double h) {
		
		switch (eleccion) {
			case 1: {
				double AT = 2 * Math.PI * r * (h + r);
				System.out.println("El Área del cilindro es: " + Math.round(AT * 100.00) / 100.000 +" cm2");
				break;
			}
			case 2: {
				double V = Math.PI * r * r * h;
				System.out.println("El Volumen del cilindro es: " + Math.round(V * 100.00) / 100.000+" cm3");
				break;
			}
		}
	}

	public static void main(String[] args) {
		//Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique. 
		//Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para volumen). Además, 
		//hemos de pasarle a la función el radio de la base y la altura.
		
		// double radio;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu eleccion: " + '\n' + "1. Area" + '\n' + "2. Volumen");
		int opc = sc.nextInt();
		while(opc!=1 && opc!=2) {
			System.out.println("Opcion errónea,elige la adecuada(1 o 2)");
			opc = sc.nextInt();
		}
		
		System.out.println("Escribe el radio(en cm):");
		double radio = sc.nextDouble();

		System.out.println("Ingresa la altura(en cm):");
		double altura = sc.nextDouble();

		//System.out.println(Math.PI);
		System.out.println();
		cilindro(opc, radio, altura);
	}
}
