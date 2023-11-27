package U3.Tarea2Cadenas;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		
		//Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa la primera cadena: ");
		String cad1=sc.next();
		System.out.println("Ingresa la segunda cadena: ");
		String cad2=sc.next();
			
		System.out.println();
			
		if(cad1.length()>cad2.length()) {
			System.out.println("Cad1 es mas largo");
		}else {
			System.out.println("Cad2 es mas largo");
		}
		
		
		
		
	}

}
