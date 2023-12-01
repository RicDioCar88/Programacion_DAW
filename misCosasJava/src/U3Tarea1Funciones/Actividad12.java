package U3Tarea1Funciones;

import java.util.Scanner;

public class Actividad12 {

	public static int factorial(int num) {
		int res=0;
		if(num==0) {
			res=1;
		}else {
			res=num*factorial(num-1);
		}
		return res;
	}
	
	public static void main(String[] args) {
		//Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es 1.
		Scanner sc=new Scanner(System.in);
		System.out.println("Numero:");
		int n=sc.nextInt();
		
		int resultado=factorial(n);
		System.out.println(n+"! = "+resultado);
	}

}
