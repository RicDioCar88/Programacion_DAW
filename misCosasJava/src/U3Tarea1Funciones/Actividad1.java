package U3Tarea1Funciones;

public class Actividad1 {
	
	public static void eco(int n) {
		/*
		Diseñar una función eco() a la que se le pasa como parámetro un 
		número n, y muestra por pantalla n veces el mensaje "Eco..." 
		*/
		for(int i=0;i<n;i++) {
			System.out.println(i+1+": Eco...");
		}
	}
	
	public static void main(String[] args) {
		eco(10);
	}
}
