package U3.enClase;

import java.util.Scanner;

public class MainListing {
	public static void dameTodo(String[][] datos) {

		for (int i = 0; i < datos.length; i++) { 
			for (int j = 0; j <datos[0].length; j++) {
				//System.out.print("(" + datos[i][j] + ")");
				System.out.println("Nombre:");
			}
			System.out.println();
		}
	}
	public static String dameNombre(String datos [][], String telef){
		String telefono [][]=new String [1][3];
		String nombre = "";
		/*Volcamos el array en uno de la función*/
		for (int i = 0;i < 5;i++) {
			for (int j = 0;j<3;j++) {
		telefono [i][j]= datos [i][j];
			}
		/*Comparamos array con el numero de telefono*/
		}
		for (int i = 0;i<5;i++) {
			/*Si son iguales devolvemos nombre si no no pasara nada.*/
			if (telefono[i][2]==telef) {
				nombre=telefono[i][0];
			}
		}
		return nombre;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] lista = new String[1][3];
		String nombre;
		String apellido;
		String telefono;
		int opc = 0;
		char respuesta;
		int contactos=0;
		boolean terminar = false;
		
		
		do {
			System.out.println("Introduce el nombre:");
			nombre=sc.next();
			System.out.println("Introduce el apellido:");
			apellido=sc.next();
			System.out.println("Introduce el teléfono:");
			telefono=sc.next();
			contactos++;
			
			do {
				System.out.println("¿Desea añadir un nuevo contacto? (S/N)");
				respuesta=sc.next().charAt(0);
			} while (!(respuesta=='S' || respuesta=='N'));
		} while (respuesta=='S');
		
		do {
			System.out.println("1. Escribir todo el listing por consola:");
			System.out.println("2. Buscas el nombre a partir del número de teléfono:");
			System.out.println("3. Buscar el apellido a partir del número de teléfono:");
			System.out.println("4. Buscar el teléfono a partir del apellido:");
			System.out.println("5. Finalizar");
			opc=sc.nextInt();
		} while (opc<1 || opc>5);
		
		do {
			switch (opc) {
			case 1: 
				dameTodo(lista);
				break;
			case 2:
				System.out.println("Introduce el teléfono:");
				telefono=sc.next();
				System.out.println(dameNombre(lista, telefono));
				break;
			case 3:
				System.out.println("Introduce el teléfono:");
				telefono=sc.nextLine();
				//dameApellido(lista, telefono);
				break;
			case 4:
				System.out.println("Introduce el apellido:");
				apellido=sc.nextLine();
				//dameTelefono(lista, apellido);
				break;
			case 5:
				terminar=true;
				break;
			default:
				break;
			}
		} while (!terminar);
	}
}
