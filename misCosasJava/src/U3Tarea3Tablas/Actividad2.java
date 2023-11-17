package U3Tarea3Tablas;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		/*
		Escribir una aplicación que solicite al usuario cuántos 
		números desea introducir. A continuación, se introducirá 
		por teclado esa cantidad de números enteros, y por último, 
		los mostrará en el orden inverso al introducido.*/
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Cuantos numeros desea introducir?");
		num=sc.nextInt();
		System.out.println("Escribe esos "+ num + " numeros.");
		int []misNumeros= new int [num];
		for(int i=0;i<misNumeros.length;i++) {
			misNumeros[i]=sc.nextInt();
		}
		System.out.println();
		for(int j=0;j<misNumeros.length;j++) {
			System.out.print(misNumeros[j]+" ");
		}
	}

}
