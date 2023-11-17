package u1ent;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// Escribe un programa que calcule al azar un número entre el 1 y el 25. 
		// Posteriormente debe pedir al usuario cuántos intentos quiere realizar para 
		// acertarlo y si quiere recibir o no ayuda. En caso de que requiera ayuda, 
		// el programa debe indicarle en cada iteración, si el número secreto es mayor o menor 
		// que el introducido. En cada intento debe indicarse al usuario si ha acertado o no y 
		// el número de intentos restantes. Una vez finalizado, debe informar el número total de 
		// intentos realizados. Para controlar el acierto o no del número deberás emplear una variable booleana.
		
		int numR=(int)(Math.random()*26)+1;
		int miNum;
		int nhelp;
		boolean help=false;
		int intentos;
		int i=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Cuántos intentos quiere realizar?");
		intentos=sc.nextInt();
		
		System.out.println("Entedido, realizará " + intentos + ", buena suerte.");
		
		System.out.println("Desea que se le ayude en el intento?");
		System.out.println("1. Si"+'\n'+"2. No");
		nhelp=sc.nextInt();
		switch(nhelp) {
			case 1:{
				help=true;
				System.out.println("OK, se le proporcionara apoyo.");
				break;
			}
			case 2:{
				help=false;
				System.out.println("Entendido, no se le proporcionará ayuda.");
				break;
			}
			default:{
				while(nhelp!=1 && nhelp!=2) {
					System.out.println("Porfavor elija una de las 2 opciones.");
					nhelp=sc.nextInt();
				}
				break;
			}
		}
		
		System.out.println("Comienze con el reto!!!");
		System.out.println("Debe adivinar el numero aleatorio que se ha generado(1-25)");
		//System.out.println("El numero secreto es "+numR);                 //borrar
		
		System.out.println("Elija un numero");
		i=intentos-1;
		int iMemo=1;
		while(i>=0) {
			miNum=sc.nextInt();
			if(miNum>numR) {
				if(help) {
					System.out.println("Tu numero es mayor, intentalo de nuevo...");
				}
				System.out.println("Te quedan " +i+" intentos.");
				
				if(i==0) {
					System.out.println("Perdiste el juego.");
				}
			}else if(miNum<numR){
				if(help) {
					System.out.println("Tu numero es menor, intentalo de nuevo...");
				}
				System.out.println("Te quedan " +i+" intentos.");
				if(i==0) {
					System.out.println("Perdiste el juego.");
				}
			}else {
				System.out.println("Tu numero es igual,ganaste!");break;
			}
			iMemo++;
			i--;
		}
		System.out.println("has realizado " + iMemo + " intentos");
		
		
	}
	

}
