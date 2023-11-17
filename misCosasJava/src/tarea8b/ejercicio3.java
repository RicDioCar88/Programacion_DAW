package tarea8b;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. ç
		// El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula 
		// sumando los dos anteriores, por lo que tendríamos que los términos 
		// son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado.
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe el valor de 'n'(n=numero de iteraciones): ");
		n=sc.nextInt();
		int num=0;
		int num2=1;
		
		System.out.print(num+", ");
		System.out.print(num2+", ");
		for (int i=1;i<=n-2;i++) {
			int term=num+num2;
			num=num2;
			num2=term;
			//System.out.print(term);
			if(i==n-2) {
				System.out.println(term+".");
			}else {
				System.out.print(term+", ");
			}
			
		}

	}

}
