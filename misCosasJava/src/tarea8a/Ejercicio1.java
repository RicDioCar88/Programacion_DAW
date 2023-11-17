package tarea8a;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Diseñar un programa que muestre, para cada número introducido por teclado, si es par, 
		// si es positivo, y su cuadrado. El proceso terminará cuando el número introducido por teclado sea 0.
		int num;
		int res;
		
		
		
		System.out.println("Ingrese un numero(!=0): ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while(num!=0) {
			
			String par=(num%2==0)?"Es par":"No es par";
			
			String positividad=(num>0)?"Es positivo":"Es negativo";
			
			int cuadrado= num*num;
			
			System.out.println(par+'\n'+positividad+'\n'+"Su cuadrado es: "+ cuadrado);
			num = sc.nextInt();
		}
		if(num==0) {
			System.out.println("Error!!!!"+'\n'+"Fin del programa");
		}
		
		/*
		do {
			System.out.println("Ingrese un numero(!=0): ");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();
			
			if(num!=0) {
				if(num%2==0) {
					System.out.println("Es par");
				}else {
					System.out.println("No es par.");
				}
				if(num>0) {
					System.out.println("Es positivo");
				}else {
					System.out.println("Es negativo");
				}
			res = (num)*(num);
				System.out.println("El cuadrado de " + num + " es: "+res);
			}else {
				System.out.println("Error!!!");
			}
			i++;
		}while(i>0 && num!=0);
		
		*/
		
		
		

	}

}
