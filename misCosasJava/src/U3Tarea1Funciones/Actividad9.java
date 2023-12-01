package U3Tarea1Funciones;



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
		
		for(int i=2;i<num;i++) {
			if(num%i==0 && esPrimo(i)) {
				size++;
			}
		}
		
		int[] div=new int[size];
		int j=0;
		for(int i=2;i<=num;i++) {
			if(num%i==0 && esPrimo(i)) {
				div[j]=i;
				j++;
			}
		}
		
		
		return div;
	}
	
	public static void main(String[] args) {
		// Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores primos 
		// del número que se le pasa como parámetro
		int[] divisoresFin=divisoresPrimos(10);
		for(int i=0;i<divisoresFin.length;i++) {
			System.out.print(divisoresFin[i]+",");
		}

	}

}
