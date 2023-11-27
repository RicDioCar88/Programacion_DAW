package tarea8b;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// Lo mismo que el 5 pero la pirámide hueca
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
				if (k == 1 || k == 2 * i - 1 || i == num) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
			}
			System.out.println();
		}
	}

}
