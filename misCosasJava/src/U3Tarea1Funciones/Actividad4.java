package U3Tarea1Funciones;

import java.util.Scanner;

public class Actividad4 {

	public static void comparation(int n1, int n2) {
		if(n1>n2) {
			System.out.println(n1 + " es el mayor");
		}else {
			System.out.println(n2 + " es el mayor");
		}
	}
	
	public static void main(String[] args) {
		// Diseñar una función que reciba como parámetros dos números 
		// enteros y que devuelva el mayor de los dos.
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa el primer numero: ");
		int num1=sc.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		int num2=sc.nextInt();
		
		comparation(num1,num2);
		
	}

}
