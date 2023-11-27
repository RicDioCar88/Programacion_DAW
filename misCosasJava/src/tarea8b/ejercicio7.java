package tarea8b;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		//Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		num=sc.nextInt();
		String cadNum=String.valueOf(num);
		
		for(int i=cadNum.length()-1;i>=0;i--) {
			System.out.print(cadNum.charAt(i));
		}

	}

}
