package U3.Tarea2Cadenas;

import java.util.Scanner;

public class Actividad3 {
	public static void main(String[] args) {
		//Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición central es o no un espacio.
		
		String frase;
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe una frase:");
		frase=sc.nextLine();
		
		for(int i=0;i<frase.length();i++) {
			System.out.print(" "+frase.charAt(i));
		}
		System.out.println();
		for(int i=0;i<frase.length()/2;i++) {
			System.out.print(" "+frase.charAt(i));
		}
		System.out.println();
		if(frase.charAt(frase.length()/2)==' ') {
			System.out.println("Es un espacio");
		}else {
			System.out.println("No es un espacio");
		}
	}
}
