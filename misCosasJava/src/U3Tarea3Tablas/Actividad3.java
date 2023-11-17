package U3Tarea3Tablas;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		/*
		 * Introducir por teclado un número n; 
		 * a continuación solicitar al usuario que teclee n números. 
		 * Realizar la media de los números positivos, la media de los 
		 * negativos, y contar el número de ceros introducidos.*/
		
		int n;
		
		int cn=0;
		int cp=0;
		int zeroCount=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero:");
		n=sc.nextInt();
		
		int []numeros=new int [n];
		System.out.println("Escribe "+n+" numeros:");
		
		//introduce los valores en sus respectivas posiciones
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=sc.nextInt();
			//System.out.println(numeros[i]+" ");
		}
		int resPos=0,countPos=0;
		int resNeg=0,countNeg=0;
		double mediaPos=0,mediaNeg=0;
		for(int j=0;j<numeros.length;j++) {
			if(numeros[j]>0) {
				cp=numeros[j];
				resPos=cp+resPos;
				countPos++;
				
			}else if(numeros[j]<0){
				cn=numeros[j];
				resNeg=cn+resNeg;
				countNeg++;
				
			}else {
				zeroCount++;
			}
		}
		mediaPos= (double)resPos/countPos;
		mediaNeg= (double)resNeg/countNeg;
		
		System.out.println("Numero de 0s introducidos: "+zeroCount);
		System.out.println("Media|numeros positivos: "+mediaPos);
		System.out.println("Cantidad +: "+countPos);
		System.out.println("Media|numeros negativos: "+mediaNeg);
		System.out.println("Cantidad -: "+countNeg);
		
	}

}
