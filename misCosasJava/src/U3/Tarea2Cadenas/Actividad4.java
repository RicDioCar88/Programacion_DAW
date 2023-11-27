package U3.Tarea2Cadenas;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		/*
		Diseñar una actividad que pida al usuario que introduzca una frase por teclado e indique cuántos espacios en blanco tiene. 
		*/
		Scanner sc=new Scanner(System.in);
		String frase;
		int espacios=0;
		System.out.println("Escribe una frase:");
		frase=sc.nextLine();
		
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==' ') {
				espacios++;
			}
		}
		System.out.println("Hay "+espacios+" espacios.");
	}

}
