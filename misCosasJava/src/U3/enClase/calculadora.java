package U3.enClase;

import java.util.Scanner;

public class calculadora {
	public static double suma(double a,double b) {
		double res = a + b;
		return res;
	}
	public static double resta(double a,double b) {
		double res = a - b;
		return res;
	}
	public static double multiplicacion(double a, double b) {
		double res = a * b;
		return res;
	}
	public static double division(double a, double b) {
		double res = a / b;
		return res;
	}
	
	public static void main(String[] args) {
		int op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el valor de a: ");
		double a = sc.nextInt();
		System.out.println("Ingresa el valor de b: ");
		double b = sc.nextInt();
		
		System.out.println("Ingresa alguna de las siguientes opciones:");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		op=sc.nextInt();
		
		while(op>=1 || op<=4) {
			switch (op) {
			case 1: {
				System.out.println("El resultado de la suma es:" + suma(a,b));break;
			}
			case 2:{
				System.out.println("El resultado de la resta es:" + resta(a,b));break;
			}
			case 3:{
				System.out.println("El resultado de la multiplicacion es:" + multiplicacion(a,b));break;
			}
			case 4:{
				if(b==0) {
					System.out.println("Error!!!");
					System.out.println("Debes cambiar el valor de 'b' que sea distinto de 0.");
					System.out.println("Ingresa otro valor de b: ");
					b = sc.nextInt();
					break;
				}
				System.out.println("El resultado de la division es:" + division(a,b));
				break;
			}
			default:
				System.out.println("Ingresa un valor correcto");break;
				
			}
			op=sc.nextInt();
		}
	}

}
