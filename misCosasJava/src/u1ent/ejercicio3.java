package u1ent;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		/*
		 * La hamburguesería Burbur quiere se informatice su empresa. Realiza un
		 * programa que calcule el precio de un pedido en función del número de
		 * hamburguesas y del día en el que se haga. El precio de la hamburguesa básica
		 * con los ingredientes mínimos (pan, carne, queso) es de 3 euros. La
		 * hamburguesa gourmet cuesta 5 euros, porque tiene carne de Waygu, pan artesano
		 * y queso de oveja. Los martes locos de Burbur, un pedido de dos gourmet cuesta
		 * 9 euros, y los miércoles de desmadre, la hamburguesa básica cuesta 2 euros.
		 * Perteneciendo al club Fanegas de Burbur, se obtiene un 12% de descuento sobre
		 * el precio final del pedido.
		 */
		double bBasica = 3.0;
		double bGourmet = 5.0;
		int numBurg = 0;
		int op;
		double precioFinal=0;
		boolean clubSocio=false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantas hamburguesas desea?");
		numBurg=sc.nextInt();
		
		
		System.out.println("Ingresa el dia...");
		System.out.println("1. Lunes" + '\n' + "2. Martes!" + '\n' + "3. Miercoles!" + '\n' + "4. Jueves" + '\n'
				+ "5. Viernes" + '\n' + "6. Sabado" + '\n' + "7. Domingo");
		op = sc.nextInt();
		switch (op) {
			case 1, 4, 5, 6, 7: {
				System.out.println("Dia normal...");
				System.out.println("Hamburguesa Normal = 3€");
				System.out.println("Hamburguesa Gourmet = 5€");
				System.out.println("Elige el tipo de hamburguesa");
				System.out.println("1. Hamburguesa normal");
				System.out.println("2. HAmburguesa Gourmet");
				int optipo;
				optipo=sc.nextInt();
				switch(optipo) {
					case 1:{
						precioFinal = bBasica * numBurg;
						System.out.println("Basica sin descuento: " + precioFinal);
						break;
					}
					case 2:{
						precioFinal = bGourmet * numBurg;
						System.out.println("Gourmet sin descuento: " + precioFinal);
						break;
					}
				}
				
				
				break;
			}
			case 2: {
	
				System.out.println("Locos de Burgur!!");
				bGourmet = 4.5;
				System.out.println("Hamburguesa gourmet = 4.5€");
				int optipo;
				optipo=sc.nextInt();
				switch(optipo) {
					case 1:{
						precioFinal = bBasica * numBurg;
						System.out.println("Basica sin descuento: " + precioFinal);
						break;
					}
					case 2:{
						precioFinal = bGourmet * numBurg;
						System.out.println("Gourmet sin descuento: " + precioFinal);
						break;
					}
				}
				break;
			}
			case 3: {
				System.out.println("Miércoles de desmadre!!");
				bBasica = 2;
				System.out.println("Hamburguesa normal = 3€");
				break;
			}
			default: {
				while(op<1 || op>7) {
					System.out.println("Ingrese una opcion correcta");
					op = sc.nextInt();
				}
				break;
			}
		}
		
		
		
		
		
		System.out.println("Pertenece al club Fanegas de burgur?");
		System.out.println("1. Si "+'\n'+"2. No");
		int opClub;
		opClub=sc.nextInt();
		switch(opClub){
			case 1:{
				clubSocio=true;break;
			}
			case 2:{
				clubSocio=false;break;
			}
		}
		if(clubSocio) {
			precioFinal = precioFinal-(precioFinal*0.12);
			System.out.println("Precio con descuento: " + precioFinal+"€ ");
		}
		

	}

}
