package U3.EjerciciosAdicionales;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	
	public static void burbuja(int[] num) {
		int aux;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length-i-1;j++) {
				if(num[j]>num[j+1]) {
					aux=num[j];
					num[j]=num[j+1];
					num[j+1]=aux;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}
	
	public static void fill(int[] num) {
		for(int i=0;i<num.length;i++) {
			num[i]=(int) (Math.random()*501);
		}
		System.out.println(Arrays.toString(num));
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Escribe un programa que rellene un array de 100 elementos con números en-teros 
		//aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuaciónel programa 
		//mostrará el array y preguntará si el usuario quiere destacar elmáximo o el mínimo. 
		//Seguidamente se volverá a mostrar el array escribiendoel número destacado entre dobles asteriscos.

		int[] numbers=new int [100];
		/*original*/
		fill(numbers);
		/*ordenado*/
		//burbuja(numbers);
		
		/**/
		System.out.println("Opciones");
		System.out.println("1. Destacar el maximo");
		System.out.println("2. Descatar el mínimo");
		int count=sc.nextInt();
		
		switch(count) {
		
			case 1:{
				int mayor=0;
				for(int i=0;i<numbers.length;i++) {
					if(numbers[i]>mayor) {
						mayor=numbers[i];
					}
				}
				System.out.println("Mayor es "+mayor);
				break;
			}
			case 2:{
				int menor=500;
				for(int i =0;i<numbers.length;i++) {
					if(numbers[i]<menor) {
						menor=numbers[i];
					}
				}
				System.out.println("Menor es "+menor);
				break;
			}
		}
		System.out.println();
		burbuja(numbers);
	}

}
