package duranteClase;

import java.util.Scanner;

public class tarea1 {

	public static void main(String[] args) {
		// leer un caracter y decir si es vocal o consonante
		
		char L;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa una letra: ");
		L=sc.next().charAt(0);
		
		switch(L) {
			case 'a','e','i','o','u':
				System.out.println("Es una vocal");break;
			default:
				System.out.println("Consonante");break;
		}
		
		
		
	}
}
