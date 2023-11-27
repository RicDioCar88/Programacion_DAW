package U3Tarea3Tablas;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		// Queremos desarrollar una aplicación que nos ayude a gestionar las 
		// notas de un centro educativo. Cada clase está compuesta por 5 alumnos. 
		// Se pide leer las notas (números enteros) de cada uno de los alumnos en 
		// el primer trimestre, luego, las del segundo, y luego, las del tercero. 
		// Debemos mostrar, al final, la nota media del grupo en cada trimestre, y 
		// la media del alumno que se encuentra en la posición pos (que se lee por teclado). 
		// (Podéis hacerlo usando 3 vectores -uno por trimestre-, o usando una matriz 
		// bidimensional en la que las filas sean los trimestres y las columnas los alumnos).
		
		

		int [][]notas=new int[3][5];
		/*primer trimestre*/
		notas[0][0]=2; notas[0][1]=6; notas[0][2]=9; notas[0][3]=6; notas[0][4]=10;/*alumno1;alumno2;alumno3;alumno4;alumno5*/ //med36
		/*segundo trimestre*/
		notas[1][0]=3; notas[1][1]=5; notas[1][2]=8; notas[1][3]=6; notas[1][4]=10;/*alumno1;alumno2;alumno3;alumno4;alumno5*/ //med32
		/*tercer trimestre*/
		notas[2][0]=4; notas[2][1]=9; notas[2][2]=7; notas[2][3]=6; notas[2][4]=10;/*alumno1;alumno2;alumno3;alumno4;alumno5*/ //med36
		
		int sumaInt=0;
		for(int i = 0; i<3;i++) {	//trimestres
			String abr ="";
			switch(i) {
				case 0,2: {
					
					abr="er";break;
				}
				case 1:{ abr="do";break;
				}
			}
			int Suma=0;
			System.out.println(i+1+""+abr+" Trimestre");
			for(int j=0;j<5;j++) {	//alumnos
				System.out.print("Alumno:"+(j+1)+"->("+notas[i][j]+")  ");
				//System.out.println();
				Suma=notas[i][j]+Suma;
				//System.out.println("Media Grupal:" + Suma);
			}
			sumaInt=Suma;
			System.out.println();
			System.out.println("Media Grupo: "+Suma/5);
		}
		//media del alumno en la posicion POS
		int POS;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa la posicion del alumno");
		POS=sc.nextInt();
		
		for(int i=0;i<3;i++) {
			for (int j=0;j<5;j++) {
				
			}
		}
		
	}

}
