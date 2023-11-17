package U3.enClase;

import java.util.Scanner;

public class circunferencia {
	public static double areaDeCircunferencia(int radio) {
		double areaCircunf = 3.1415926535 * radio * radio;
		double areaConDosDecimales = Math.round(areaCircunf * 100) / 100;
		return (areaConDosDecimales);
	}
	public static double longitudDeCircunferencia(int radio) {
        double longCircunf = 2 * 3.1415926535 * radio;
        double longConDosDecimales = Math.round(longCircunf * 100) / 100.0;
        //System.out.println( "La longitud de la circunferencia de radio " + radio + " es " + longConDosDecimales); 
        return (longConDosDecimales);
	}
	
	public static void main( String args[] ) {
		int r;
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingresa el radio:");
		r=sc.nextInt();
		
		double longitud= longitudDeCircunferencia(r);
		System.out.println("La Longitud de la circunferencia de radio " + r + " es " + longitud);
		double area= areaDeCircunferencia(r);
		System.out.println("El Área de la circunferencia de radio " + r + " es " + area);
		
		
		
		
		
		
        
    } 
}
