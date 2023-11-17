package u1ent;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// Escribe un programa que solicite por consola números naturales pares hasta que la 
		//suma total de todos ellos sea mayor que la constante 100. Si el número introducido 
		//no es natural o no es par, debe indicarlo al usuario y solicitarlo de nuevo hasta que 
		//este introduzca un número que sea válido. Al finalizar debe mostrar la media y el mayor 
		//de todos los números introducidos.
		final int constante=100;
		int num1;
		int num2=0;
		
		int suma=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero natural/par");
		num1=sc.nextInt();
		
		while(num1%2!=0 || !(num1>0)) {
			if(num1%2!=0) {
				System.out.println("No es par");
			}
			if(!(num1>0)) {
				System.out.println("No es natural");
			}
			System.out.println("Introduce otro numero, pero que sea par y natural");
			num1=sc.nextInt();
		}
		
		if(suma<100) {
			while(num1%2==0 && num1>0) {
				System.out.println(num1);
				num2=sc.nextInt();
				suma=num1+num2;
				num1=suma;
				System.out.println("la suma es:"+suma);
			}
		}else {
			System.out.println("Fin");
		}
		
		
		
		
		
		
		
	}

}
