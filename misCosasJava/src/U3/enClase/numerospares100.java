package U3.enClase;

public class numerospares100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num= new int[50];
		int par=0;
		
		for(int i=0;i<50;i++) {
			if(par%2==0) {
				par+=2;
				num[i]=par;
				System.out.println(i+","+num[i]);
			}
			//2 de los ejercicios del entregable sin ayuda
		}
	}

}
