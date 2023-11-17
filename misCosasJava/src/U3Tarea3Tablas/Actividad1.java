package U3Tarea3Tablas;

import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		/*
		Diseñar un programa que solicite al usuario 5 números decimales. 
		A continuación, debe mostrar los números en el mismo orden en que 
		se han introducido.*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa 5 numeros decimales: ");
		double [] numeros=new double [5];
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=sc.nextDouble();
		}
		for(int j=0;j<numeros.length;j++) {
			System.out.println(numeros[j]);
		}
		
	}
}
