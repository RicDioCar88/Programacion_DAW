package tarea8b;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		//Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado. 
		//El carácter con el que se pinta la pirámide también se debe pedir por teclado.
		
		int num;
		String caracter;
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe el caracter con el que quieres que se cree la piramide");
		caracter=sc.next();
		System.out.println("Escribe un numero:");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
		
		
		
		/*for(int i=num;i>=1;i--) {
			for(int j=1;j<=num-i;j++) {
				System.out.print(".");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
	}
}
