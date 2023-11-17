package U3.enClase;



public class aray8b {
	public static void main(String[] args) {
		String[][] coches={{"kia","sportage"},{"renault","clio"},{"seat","toledo"},{"audi",""}};
		
		for(int i=0;i<coches.length;i++) {
			System.out.println("Marca: "+coches[i][0]);
			System.out.println("Modelo: "+coches[i][1]);
			System.out.println();
		}
	}
}
