package U3.EjerciciosAdicionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Escribe un programa que pida 8 palabras y las almacene en un array. 
		//Acontinuación, las palabras correspondientes a colores se deben almacenar alcomienzo 
		//y las que no son colores a continuación. Puedes utilizar tantos arraysauxiliares como 
		//quieras. Los colores que conoce el programa deben estar enotro array y son los 
		//siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,blanco y morado.
		
		
		String []colores= {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
		
		Scanner sc=new Scanner(System.in);
		String p;
		
		
		String[] palabras=new String[8];
		for(int i=0;i<palabras.length;i++) {
			System.out.println("Escribe la palabra en la posicion ["+i+"].");
			palabras[i]=sc.next();
		}
		System.out.println(Arrays.toString(palabras));

	}

}
