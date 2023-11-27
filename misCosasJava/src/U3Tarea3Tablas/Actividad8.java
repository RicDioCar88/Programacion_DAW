package U3Tarea3Tablas;

public class Actividad8 {

	public static void main(String[] args) {
		/*
		Crear una tabla bidimensional de tamaño 5x5 y rellenarla; de la siguiente forma: 
		la posición [n,m] debe contener n+m. Después, se debe mostrar su contenido. 
		*/
		
		int [][] tabla=new int[5][5];
		
		for(int n=0;n<5;n++) {
			for (int m=0;m<5;m++) {
				tabla[n][m]=n+m;
			}
		}
		
		for(int n2=0;n2<5;n2++) {
			for(int m2=0;m2<5;m2++) {
				System.out.print(tabla[n2][m2]);
			}
			System.out.println();
		}

	}

}
