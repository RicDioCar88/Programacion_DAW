package tarea8b;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.
		int num = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese 10 numeros");
		int i=0;
		while(i<10) {
			num=sc.nextInt();
			String plusmminus= (num>0)?"Es positivo":"Es negativo";
			System.out.println(num+"==>"+plusmminus);
			i++;
		}
	}

}
