package U3.enClase;

public class arrayBidimensional {

	public static void main(String[] args) {
		
		int [][] datos = new int[3][2];
		datos[0][0]=1; datos[0][1]=18;
		datos[1][0]=2; datos[1][1]=25;
		datos[2][0]=3; datos[2][1]=30;
		
		for(int i=0;i<3;i++) { /*3=i  2=j*/
			for(int j=0;j<2; j++) {
				//System.out.println("El dato "+i+","+j+" vale "+datos [i][j]);
				System.out.print("("+datos[i][j]+")");
			}
			System.out.println("Tamaño"+datos.length);
			
		}
		
	}

}
