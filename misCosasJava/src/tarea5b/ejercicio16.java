package tarea5b;

import java.util.Scanner;

public class ejercicio16 {
	public static void main(String[] args) {
		// Escriba un programa que diga cual es la ultima cifra
		// de un numero entero introducido por teclado

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		num = sc.nextInt();
		String numC = num + "";
		String ultimo = numC.substring(numC.length() - 1);
		//System.out.println(ultimo);
		
		for(int i=numC.length()-1;i>=0;i--) {
			System.out.print(numC.charAt(i));
		}
	}
}
//172.22.0.240
