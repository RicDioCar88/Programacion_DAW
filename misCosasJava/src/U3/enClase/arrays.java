package U3.enClase;

import java.util.Scanner;

public class arrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int []numeros=new int [8];
		
		for(int i=0;i<8;i++) {
			System.out.println("Dame el un dato: ");
			numeros[i]=sc.nextInt();
		}
		for(int i=0;i<8;i++) {
			if(numeros[i]%2==0) {
				System.out.println(numeros[i]);
			}
		}
	}
}
