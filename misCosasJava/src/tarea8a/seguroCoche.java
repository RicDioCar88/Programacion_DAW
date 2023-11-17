package tarea8a;

import java.util.Scanner;

public class seguroCoche {

	public static void main(String[] args) {
		double precioBase = 500;

		int edad;
		String marca;
		double recargo;

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la marca de coche que tienes: ");
		marca = sc.nextLine();
		System.out.println("Ahora dime tu edad: ");
		edad = sc.nextInt();

		switch (marca) {
		case "Jaguar", "Aston", "Porsche", "Tesla":
			System.out.println("Tu coche se considera de gama ALTA");
			recargo = 0.5;
			break;
		case "BMW", "Mercedes", "Audi", "Volkswagen":
			System.out.println("Tu coche se considera de gama MEDIA");
			recargo = 0.25;
			break;
		default:
			System.out.println("Tu coche es de gama BAJA");
			recargo = 0.0;
			break;
		}

		if (edad < 25) {
			System.out.println("Hola niño...");

			recargo += 0.3;
			double resSeg = precioBase - (precioBase * recargo);
			System.out.println("El seguro de tu coche va a costar: " + resSeg);
		}
		if (edad > 60){
			System.out.println("Bienvenido caballero...");

			recargo += 0.2;
			double resSeg = (int) (precioBase + (precioBase * recargo));
			System.out.println("El seguro de tu coche va a costar: " + resSeg);
		}

	}
}
