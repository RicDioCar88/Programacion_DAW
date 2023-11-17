package tarea8b;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		/*Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. 
		El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje 
		“Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. 
		Tendremos cuatro oportunidades para abrir la caja fuerte.*/
		int codigo;
		int intentos=3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa el codigo de seguridad");
		codigo=sc.nextInt();
		
		while(intentos>0 && intentos<=4) {
			if(codigo!=1234) {
				System.out.println("Lo siento esa no es la conbinación");
			}else {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente.");break;
			}
			System.out.println("Te quedan " + intentos+ " intentos.");
			codigo=sc.nextInt();
			intentos--;
		}
		if(intentos==0) {
			System.out.println("Has gastado todos tus intentos,cagaste.");
		}else {
			System.out.println("Fin del programa");
		}
	}
}
