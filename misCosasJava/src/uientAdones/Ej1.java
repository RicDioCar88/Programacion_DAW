package uientAdones;

import java.util.Scanner;

public class Ej1{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int sumaTotal = 0;
        int cantidadNum = 0;
        double media = 0;
        int elMayor = 0;
        final int limite = 100;
        
        do {
            System.out.print("Introduce un número natural y par:");
            numero = scanner.nextInt();
            	
            if(numero>elMayor) { /*encontramos el mayor de los numero introducidos*/
            	elMayor=numero;
            }
            if (numero%2 == 0 && numero > 0) {	/*Verificamos que el numero introducido sea positivo y par*/
            		sumaTotal+=numero;
            			cantidadNum++;}
            
            else {
            	System.out.println(" ");
            	System.out.println("el numero debe ser par y Natural");
            }
            
        } while (sumaTotal<limite);
        
        media=sumaTotal/cantidadNum;	/*calculamos la media*/
        
        	System.out.println(" ");
        	System.out.println("La media de los numeros introducidos es "+media);
        	System.out.println("El mayor de los numeros introducidos es "+elMayor);
        	
}}
