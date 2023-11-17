package tarea8a;

public class ejercicio7 {

	public static final String BLUE = "\u001B[34m";
	public static final String GREEN = "\u001B[32m";
	
	public static void main(String[] args) {
		//Diseñar un programa que muestre el producto de los 10 primeros números impares.
		int num=1;
		int j=0;;
		
		for(int i=1;j<10;i++) {
			if(i%2!=0) {
				num=num*i;
				j++;
				
				System.out.println(GREEN+num+GREEN);
			}
			
		}

	}

}
