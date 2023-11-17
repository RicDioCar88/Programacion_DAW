package tarea8a;

public class ejercicio11 {

	public static void main(String[] args) {
		// Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.
		int res = 0;
		String space="  ";
		int i;
		for(i=1;i<=10;i++) {
			for(int j=0;j<=12;j++) {
				res=i*j;
				//System.out.print(i+"x"+j+" = "+res+space);
				System.out.printf("%2dx%2d = %2d  ",i,j,res);

				
			}
			
			System.out.println();
		}
		
	}

}
