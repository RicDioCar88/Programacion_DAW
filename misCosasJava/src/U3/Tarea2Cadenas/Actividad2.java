package U3.Tarea2Cadenas;

import java.util.Scanner;

public class Actividad2 {
	public static void main(String[] args) {
		/*
		Introducir por teclado una frase palabra a palabra, y mostrar la frase completa 
		separando las palabras introducidas con espacios en blanco. Terminar de leer la 
		frase cuando la palabra introducida sea "fin" escrita con cualquier combinación de 
		mayúsculas/minúsculas. La cadena "fin" no aparecerá en la frase final. 
		*/
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Cuantas palabras vas a escribir: ");
		String palabra;
		String frase="";
		
		do {
			System.out.println("Escribe la palabra");
			palabra =sc.nextLine();
			frase+=palabra;
			frase+=" ";
		}while(!palabra.equalsIgnoreCase("fin"));
		String fraseFinal=frase.substring(0,frase.length()-4);
		System.out.println("La frase introducida es: "+fraseFinal);
	}
}
