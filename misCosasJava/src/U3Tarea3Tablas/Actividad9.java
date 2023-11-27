package U3Tarea3Tablas;

public class Actividad9 {
	
	public static int aciertos(int[] mio, int[] winn) {
		int nAcert=0;
		
		for(int i=0;i<mio.length;i++) {
			for(int j=0;j<winn.length;j++) {
				if(mio[i]==winn[j]) {
					nAcert++;
					break;
				}
			}
		}
		
		return nAcert;
	}
	
	public static void main(String[] args) {
		/*
		Definir una función que tome como parámetros dos tablas, la primera con 6 
		números de una apuesta de la primitiva, y la segunda con los 6 números de 
		la combinación ganadora. La función devolverá el número de aciertos. 
		*/
		
		int []mi_Boleto= {1,9,2,4,0,6};
		int []winner= {6,9,2,5,0,4};
		
		int contAcert=aciertos(mi_Boleto,winner);
		
		System.out.println("Numero de aciertos: " + contAcert);
		
	}
}
