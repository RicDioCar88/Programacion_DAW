package uientAdones;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la altura del número 7: ");
        int altura = scanner.nextInt();

        for (int i = 1; i <= altura; i++) {//recorre de arriba a abajo
            for (int j = 1; j <= altura; j++) {
                if (i == 1 || altura-(i-1) == j ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
	    
	







