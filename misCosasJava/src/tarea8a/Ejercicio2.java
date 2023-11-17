package tarea8a;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		// Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos 
		// estadísticos de los alumnos. Se introducirán las edades de los elumnos hasta que una 
		// de ellas sea negativa. La aplicación mostrará la suma de las edades, la media, 
		// de cuántos alumnos hemos introducido su edad, y cuántos alumnos son mayores de edad.
		
		int edad_n;
		int total_edad=0;
		int i=-1;
		int media;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduzca la edad del alumno: ");
			edad_n=sc.nextInt();
			
			if(edad_n>=0) {
				total_edad+=edad_n;
				System.out.println(i);
			}else {
				System.out.println("Fin del programa");
			}
			i++;
		}while(i>-1 && edad_n!=0);
		
		if(edad_n==0 || edad_n<=0) {
			media=total_edad/(i);
			System.out.println(total_edad +"/"+ i +"="+media);
			System.out.println("La suma es: " + total_edad);
			System.out.println("Ha ingresado " + i + " edades.");
			System.out.println("La media de todas las edad es es: ");
		}
		
	}
}
