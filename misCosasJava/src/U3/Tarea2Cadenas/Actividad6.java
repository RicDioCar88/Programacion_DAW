package U3.Tarea2Cadenas;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		/*
		Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el segundo, 
		debe insertar otra intentando acertarla con las pistas que le dará el programa: número de caracteres, 
		primera y última letra. El programa debe escribir "Acertaste" o "Fallaste". 
		*/
		
		System.out.println("BIENVENIDO A ADIVINA LA CONTRASEÑA!!!!"+'\n');
		System.out.println("");
		String contraseña="Pand3monio";
		String intContra;
		Scanner sc=new Scanner(System.in);
		System.out.println("Adivina la contraseña que estoy pensando");
		intContra=sc.nextLine();
		
		System.out.println("La contraseña tiene: " + contraseña.length()+" letras.");
		
		for(int i=0;i<contraseña.length();i++) {
			System.out.print(contraseña.charAt(i)+"-");
				if(intContra.charAt(i)==contraseña.charAt(i)) {
					System.out.println("Acertaste");
				}else {
					System.out.println("Fallaste");
				}
			}
			//System.out.println();
		}

	

}
