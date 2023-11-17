package uientAdones;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
        int numeroSecreto = (int) (Math.random() * 25) + 1;/*calculamos n numero random entre 1 y 25*/
        
        int intentos = 0;
        int eleccion;
        int maxIntentos;
        int intento;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cuántos intentos deseas realizar? ");
        maxIntentos = scanner.nextInt();
    do {    
        System.out.println("¿Quieres recibir ayuda?");
        System.out.println("1 - Sí");
        System.out.println("2 - No");
        
        eleccion = scanner.nextInt();
        
        switch (eleccion) {
            case 1:		/*en el caso con ayuda le damos al usuario la informacion de que si su intento es menor o mayor que el numero aleatorio*/
                while (intentos < maxIntentos) {
                    System.out.print("Introduce un número entre 1 y 25: ");
                    intento = scanner.nextInt();
                    
                    intentos++;
                    
                    if (intento < numeroSecreto) {			/*La ayuda*/
                        System.out.println("El número secreto es mayor");
                    } else if (intento > numeroSecreto) {
                        System.out.println("El número secreto es menor");
                    }
                    
                    if (intento == numeroSecreto) {
                        System.out.println("Has adivinado el número secreto (" + numeroSecreto + ") en " + intentos + " intentos.");
                        break;
                    } else {
                        System.out.println("Intento incorrecto. Te quedan " + (maxIntentos - intentos) + " intentos");
                    }
                }
                break;
            case 2:
                while (intentos < maxIntentos) {
                    System.out.print("Introduce un número entre 1 y 25: ");
                    intento = scanner.nextInt();
                    
                    intentos++;
                    
                    if (intento == numeroSecreto) {
                        System.out.println("¡Felicitaciones! Has adivinado el número secreto (" + numeroSecreto + ") en " + intentos + " intentos.");
                        break;
                    } else {
                        System.out.println("Intento incorrecto. Te quedan " + (maxIntentos - intentos) + " intentos");
                    }
                }
                break;} }
        
        while(eleccion<1 || eleccion>2);
          
               
       
        
        if (intentos == maxIntentos) {
            System.out.println("Agotaste tus " + maxIntentos + " intentos, el número secreto era " + numeroSecreto);
        }
    }
}











        
	   
	   
	   
	   
	        