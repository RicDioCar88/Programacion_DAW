package duranteClase;

import java.util.Scanner;

public class piramideHueca {

	public static void main(String[] args) {
		// Piramide Hueca

		
		String s="*";
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero: ");
		int n = sc.nextInt();
		
		/*
		for (int i = 1; i <= n; i++) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print("·");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(s);
			}
			for(int r=2; r<=i;r++) {
				System.out.print(s);
			}
			System.out.println();
			while(i>2 && i<n) {
				
			}
		}	
		*/
			
		for(int i = 1 ; i<=n ; i++) {
			for(int j =1 ; j<=n-i ; j++) {
				System.out.print(".");
			}
			for(int k=1 ; k<=(i*2)-1 ; k++) {
				if((k==1) || (k==(i*2)-1) || (i==n)) {
					System.out.print("x");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
