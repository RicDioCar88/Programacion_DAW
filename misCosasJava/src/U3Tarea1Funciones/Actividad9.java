package U3Tarea1Funciones;

import java.util.Arrays;

public class Actividad9 {

	public static boolean esPrimo(int num) {
		boolean primo=true;
		
		if(num<2) {
			primo=false;
		}
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				primo=false;
				break;
			}
		}
		return primo;
	}
	
	
	public static int[] divisoresPrimos(int num) {
		int size=0;
		
		for(int i=0;i<num;i++) {
			if(num%i==0 && esPrimo(i)) {
				size++;
			}
		}
		
		int[] div=new int[size];
		int i=0;
		for(int j=1;j<=num;j++) {
			
		}
		
		
		return div;
	}
	
	public static void main(String[] args) {
		// Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores primos 
		// del número que se le pasa como parámetro
		int[] divisoresFin=divisoresPrimos(10);
		System.out.println(Arrays.toString(divisoresFin));

	}

}
