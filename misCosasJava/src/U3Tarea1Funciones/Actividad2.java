package U3Tarea1Funciones;

public class Actividad2 {

	public static void function(int n1, int n2) {
		//Diseñar una  función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
		for(int i=n1+1;i<n2;i++) {
			System.out.print(i+",");
		}
	}
	
	public static void main(String[] args) {
		function(1, 10);

	}

}
