package U3.enClase;



public class aray8b_copy {
	public static void main(String[] args) {
		String[][] coches={{"kia","sportage"},{"renault","clio"},{"seat","toledo"},{"audi","A3"}};
		
		for(int i=0;i<coches.length;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("("+i+","+j+")  ");
				System.out.println(coches[i][j]);
				//System.out.println("Modelo: "+coches[i][j]);
			}
			System.out.println();
		}
	}
}
