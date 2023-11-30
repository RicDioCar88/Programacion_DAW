package U3Tarea1Funciones;

public class Actividad8 {

	public static int divisoresPrimos(int num) {
		int numDivisores=0;
		boolean divisor=true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				numDivisores++;
			}
		}
		return numDivisores;
	}
	
	public static void main(String[] args) {
		
		int num=100;
		// Escribir una función a la que se le pase un número entero y devuelva el número de divisores primos que tiene.
		System.out.println("El Número de divisores de "+num+" es: "+divisoresPrimos(80));
		
		
	}

}
