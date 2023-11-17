package U3.enClase;


public class arrayFunction {
	/*recibe el array de datos y devuelve el mayor*/
	public static int elMayor(int may[]) {
		int mayor=0;
		for(int i=0;i<may.length;i++) {
			if(may[i]>mayor) {
				mayor=may[i];
			} 
		}
		
		return mayor;
		
	}
	
	public static void dataWriter(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Pares[" + i + "]:" + numeros[i]);
		}
	}
	
	
	public static void main(String[] args) {
		final int TAM = 50;
		int[] pares = new int[TAM];
		int j = 0;
		int[] impares = new int[TAM];
		int k = 0;

		int v=0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				pares[j] = i;
				j++;
			} else {
				impares[k] = i;
				k++;
			}
		}

		/*for (int i = 0; i < pares.length; i++) {
			System.out.println("Pares[" + i + "]:" + pares[i]);
		}*/
		
		
		dataWriter(pares);
		System.out.println(elMayor(pares));
		//System.out.println("----------------------");

		/*for (int i = 0; i < impares.length; i++) {
			System.out.println("Impares[" + i + "]:" + impares[i]);
		}*/

	}

}
