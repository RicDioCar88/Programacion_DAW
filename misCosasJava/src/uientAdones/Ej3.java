package uientAdones;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		double descuento = 0;
		int numHamburguesasBasicas;
		int numHamburguesasGourmet;
		double precioBasica = 3.0;
        double precioGourmet = 5.0;
		
		
		
		
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pedidos Burbur\n");

        System.out.print("Número de hamburguesas básicas: ");
        numHamburguesasBasicas = scanner.nextInt();
        System.out.print("Número de hamburguesas gourmet: ");
        numHamburguesasGourmet = scanner.nextInt();

        System.out.print("Día de la semana ( lunes,martes,miercoles, ...): ");
        String diaSemana = scanner.next();

        System.out.print("¿Pertenece al club Fanegas? (s/n): ");
        String clubFanegas = scanner.next();


        switch (diaSemana) {
            case "martes":
                if (numHamburguesasGourmet >= 2) {
                    precioGourmet = 4.5; // Descuento para dos gourmet
                }
                break;
            case "miercoles":
                precioBasica = 2.0; // Precio especial para hamburguesas básicas los miércoles
                break;
        }

        // Calcular el precio total
        double total = (numHamburguesasBasicas * precioBasica) + (numHamburguesasGourmet * precioGourmet);
        double pago = 0;
        // Aplicar descuento del club Fanegas si corresponde
        switch (clubFanegas) {
            case "s":
                descuento = total * 0.12;
                pago=total-descuento;
                System.out.println("\nDescuento del club Fanegas aplicado.");
                break;
            case "n":
                System.out.println("\nDescuento del club Fanegas no aplicado.");
                break;
            default:
                System.out.println("\nOpción no válida para el descuento del club Fanegas.");
                break;
        }

        System.out.println("\nAquí tiene su pedido. Gracias por su compra");
        System.out.println("Hamburguesas básicas: " + numHamburguesasBasicas);
        System.out.println("Hamburguesas gourmet: " + numHamburguesasGourmet);
        System.out.println("Total: " + total + " €");
        System.out.println("Descuento: " + descuento + " €");
        System.out.println("A pagar: " + pago + " €");
        

    }
}
	