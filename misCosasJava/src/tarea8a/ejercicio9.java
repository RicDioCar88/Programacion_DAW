package tarea8a;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// Un centro de investigación de la flora urbana necesita una aplicación que muestre cual es el árbol más alto. 
		// Para ello se introducirán por teclado las alturas en cms de cada árbol, terminando cuando se introduzca -1. 
		// Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0.
		
		int med;
		int mayor=0;
		int memo=0;
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese las medidas en cms: ");
		System.out.print("Arbol_"+i+"->");
		med=sc.nextInt();
		
		while(med!=-1) {
			if(med>mayor) {
				mayor=med;	
				//System.out.println("->Arbol "+i);
				memo=i;
			}
			i++;
			System.out.print("Arbol_"+i+"->");med=sc.nextInt();
		}
		System.out.println("El Arbol_"+memo+" es el mas alto con una altura de "+mayor+" cms.");
		
		sc.close();

	}

}
