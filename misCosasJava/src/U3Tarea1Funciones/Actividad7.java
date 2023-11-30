package U3Tarea1Funciones;

public class Actividad7 {

	public static void primo(int num) {
		boolean primo = true;
		
		for (int i = 2; i <num; i++) {
			if(num%i==0) {
				primo=false;
				
			}
			
		}
		if(primo) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
	}

	public static void main(String[] args) {
		// Diseñar una función que nos diga si un número es primo.
		primo(1);
		primo(2);
		primo(3);
		primo(4);
		primo(5);
		primo(6);
		primo(7);
		primo(8);
		primo(9);
		primo(10);

	}

}
