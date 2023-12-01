package U3Tarea1Funciones;

import java.math.BigInteger;
import java.util.Scanner;

public class Actividad11 {
	
	public static void verificaN(int n) {
		Scanner sc2=new Scanner(System.in);
		while(n<0) {
			System.out.println("Vuelve a intentarlo...");
			n=sc2.nextInt();
		}
	}
	
	public static void potencia1(int a, int n) {
		int resultado=1;
		for(int i=1;i<=n;i++) {
			resultado*=a;
		}
		System.out.println(resultado);
	}

	public static int potencia2(int a, int n) {
		int res;
		if(n==0) {
			res=1;
		}else {
			/* a*a^(n-1) */
			res=a*potencia2(a, n-1);
		}
		return res;
	}
	
	public static void main(String[] args) {
		/*
		Realizar una función que calcule a elevado a n, donde a es real, 
		y n entero no negativo. Realizar una versión iterativa y otra recursiva.
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Base:");
		int a=sc.nextInt();		
		
		System.out.println("Exponente:");
		int n=sc.nextInt();
		verificaN(n);
		/*iterativa*/
		potencia1(a,n);
		/**/
		System.out.println();
		/*recursiva*/
		int resultado=potencia2(a, n);
		System.out.println(resultado);
	}

}
