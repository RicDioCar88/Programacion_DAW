package tarea8a;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		// Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que sean primos. 
		// Un número primo es aquel que sólo es divisible por 1 y por él mismo. Ejemplo: Para n=8:
	    int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        n = sc.nextInt();
        int primosIndx= 0;

        for (int i = 2; i <= n; i++) {
            int divisorIndx = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    divisorIndx++;
                }
            }
            
            if (divisorIndx == 0) {
                System.out.println(i + "->primo");
                primosIndx++;
            }else {
            	System.out.println(i + "->no primo");
            }
        }

        //System.out.println("Hay " + countPrimos + " números primos entre 1 y " + n);
        System.out.println("Entre 1 y " + n + " hay " + primosIndx + " numeros primos.");
    }

	

}
