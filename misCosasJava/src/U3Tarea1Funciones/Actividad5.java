package U3Tarea1Funciones;

import java.util.Scanner;

public class Actividad5 {

	public static void comparation(int n1,int n2, int n3) {
		if(n1 > n2) {
			if(n1>n3) {
				System.out.println(n1 +" Es el mayor");
			}else {
				System.out.println(n3 + " Es el mayor");
			}
		}else if(n2>n3) {
			System.out.println(n2 + " Es mayor");
		}else {
			System.out.println(n3+" Es el mayor");
		}
	}
	
	public static void main(String[] args) {
		// Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números. 
		// Piensa un poco, no hagas el algoritmo de comparación de los 3 números desde cero.
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingresa es primer numero:");
		int num1=sc.nextInt();
		System.out.println("Ingresa es segundo numero:");
		int num2=sc.nextInt();
		System.out.println("Ingresa es tercer numero:");
		int num3=sc.nextInt();
		
		comparation(num1, num2, num3);
	}

}
