package duranteClase;

import java.util.Scanner;

public class impuestos {

	public static void main(String[] args) {
		/*
		Escribe u programa que calcule el precio final de un producto segun su base imponible
		(precio antes de impuestos), el tipo de IVA aplicado(general, reducido o superreducido) y e codigo promocional.
		LOs tipos de IVA general, reducido y superreducido son del 21%, 10% y 4% respectivamente.
		Los codigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan respectivamente 
		que no se aplica promocion, el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 5%.
		El ejercicio se da por bueno si se muestran los valores correctos, aunque los numeros no estén tabulados.
		
		ejemplo:
		
		introduzca la base imponible:25
		introduzca el tipo de IVA(general, reducido o superreducido):reducido
		introduzca el codigo promocional(nopro, mitad, meno5 o 5porc):mitad
		base imponible
		IVA(10%)
		precio con IVA
		25.00
		2.50
		27.5.
		cod.promo(mitad):-13.75
		Total
		13.75
		*/
		double precioBase;
		int iva;
		double precioIVA;
		double base_IVA;
		double tot_B_IVA = 0;
		String codPro;
		double tot_pro_tot_iva = 0;
		
		boolean value=true;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca la base imponible: ");
		precioBase=sc.nextDouble();
		
		do {
			System.out.println("INtroduzca el tipo de IVA: ");
			System.out.println("1. General"+ '\n'+"2. Reducido"+'\n'+"3. Superreducido");
			iva=sc.nextInt();
			value=true;
			
			switch(iva) {
			case 1:
				System.out.println("Se aplicará el IVA 'general'");
				precioIVA=0.21;
				base_IVA=precioBase*precioIVA;
				System.out.println(base_IVA+"€");
				tot_B_IVA=base_IVA+precioBase;
				System.out.println(tot_B_IVA+"€");
				break;
			case 2:
				System.out.println("Se aplicará el IVA 'reducido'");
				precioIVA=0.1;
				base_IVA=precioBase*precioIVA;
				System.out.println(base_IVA+"€");
				tot_B_IVA=base_IVA+precioBase;
				System.out.println(tot_B_IVA+"€");
				break;
			case 3:
				System.out.println("Se aplicará el IVA 'superreducido'");
				precioIVA=0.04;
				base_IVA=precioBase*precioIVA;
				System.out.println(base_IVA+"€");
				tot_B_IVA=base_IVA+precioBase;
				System.out.println(tot_B_IVA+"€");
				break;
			default:
				System.out.println("Debe introducir una de las 3 opciones;");
				value=false;
			}
		}	while(value==false);
		
		do {
			System.out.println("Introduzca el codigo promocional: ");
			System.out.println("'mitad' -> El precio se reduce a la mitad."+'\n'+"'meno5' -> Se descuentan 5€."+'\n'+"'5porc' -> Se descuenta el 5%.");
			codPro=sc.next();
			value=true;
			
			switch(codPro) {
				case "mitad":
					System.out.println("El precio se reducirá a la mitad!");
					tot_pro_tot_iva=tot_B_IVA/2;
					System.out.println("-"+tot_pro_tot_iva+"€");
					break;
				case "meno5":
					System.out.println("Se descuentan 5€");
					tot_pro_tot_iva=tot_B_IVA-5;
					System.out.println(tot_pro_tot_iva+"€");
					break;
				case "5porc":
					System.out.println("Se descontará el 5%");
					tot_pro_tot_iva=tot_B_IVA-(tot_B_IVA*0.05);
					System.out.println(tot_pro_tot_iva+"€");
					break;
				default:
					System.out.println("No se aplica promocion!");
					System.out.println(tot_pro_tot_iva+"€");
					break;
			}
		}while(value ==false);
		
		System.out.println(tot_pro_tot_iva+"€");
		
	}

}
