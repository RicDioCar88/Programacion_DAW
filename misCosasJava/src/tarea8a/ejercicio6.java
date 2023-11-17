package tarea8a;

public class ejercicio6 {

	public static void main(String[] args) {
		// Escribir todos los múltiplos de 7 menores que 100.
		int res;
		int i = 0;

		do {
			res = 7 * i;
			if(res<100) {
			System.out.println("7 x " + i + " = " + res);
			}
			i++;
		}while (res <= 100);
	}

}
