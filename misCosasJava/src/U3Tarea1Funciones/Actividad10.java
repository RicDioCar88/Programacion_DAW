package U3Tarea1Funciones;

import java.util.Scanner;

public class Actividad10 {

	public static int sumaDivisores(int num) {
		int suma=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				suma+=i;
			}
		}
		return suma;
	}
	
	public static boolean amix(int num1, int num2) {
		boolean amix=false;
		int sumaNum1=sumaDivisores(num1);
		int sumaNum2=sumaDivisores(num2);
		
		if(sumaNum1 == num2 && sumaNum2==num1) {
			amix=true;
		}
		return amix;
	}

	public static void main(String[] args) {
		// Escribir una función que decida si dos números enteros positivos son amigos. 
		// Dos números son amigos si la suma de los divisores propios (distinto de él mismo)
		// del primer número es igual al segundo número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)
		
		//System.out.println(sumaDivisores(10));;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("num1");
		int num1=scanner.nextInt();
		System.out.println("num2");
		int num2=scanner.nextInt();
		System.out.println(sumaDivisores(num1));
		System.out.println(sumaDivisores(num2));
		
		if(amix(num1,num2)) {
			System.out.println(num1+" y "+num2+" son amigos!");
		}else {
			System.out.println(num1+" y "+num2+" NO son amigos!");
		}
	}

}
