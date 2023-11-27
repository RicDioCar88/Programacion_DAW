package U3.enClase;

public class Proyecto1 {

	public static void dameTodo(String[][] datos) {

		for (int i = 0; i < datos.length; i++) { /* 5=i 3=j */
			System.out.println("Contacto: Nº"+(i+1));
			System.out.println("Nombre:(" + datos[i][0] + ") ");
			System.out.println("Apellido:(" + datos[i][1] + ") ");
			System.out.println("Telefono:(" + datos[i][2] + ") ");
			//System.out.println("Nombre: "+datos[i][0]+" / Apellido: "+datos[i][1]+" / Telefono: "+datos[i][2]);
			
			System.out.println("----------------------");
			
		}
	}

	public static void main(String[] args) {
		String lista[][] = new String[5][3];
		int i=0;
		
		
		
		lista[0][0]="Ricardo"; lista[0][1]="Dionisio";lista[0][2]="123456789";

		dameTodo(lista);

	}

}
