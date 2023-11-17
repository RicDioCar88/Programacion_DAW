package duranteClase;


import java.util.Scanner;

public class ele {

	public static void main(String[] args) {
		// 
		int n;
		String as="*";
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa un numero:");
		n=sc.nextInt();
		for(int i=1;i<=n-1;i++){
			System.out.println("*");
		}
		for(int j=1;j<=(int)(n/2);j++) {
			System.out.print(as+" ");
			
		}

	}

}
