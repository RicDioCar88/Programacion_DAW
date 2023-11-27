package U3.enClase;

import java.util.Scanner;



public class ahorcado {

	public static void random(int[] r,int c) {
		r[c]=(int)((Math.random()*10)+1);
	}
	
	public static void transformaCadena(String p,StringBuilder p2) {
		for(int i=0;i<p.length();i++) {
			char var=p.charAt(i);
			int [] rand=new int[p.length()];
			//random(rand, i);//System.out.print(var+"-"+rand[i]+",  ");/*if(rand[i]!=3 && rand[i]!=6 && rand[i]!=9) {p2.setCharAt(i, '_');}*/
			p2.setCharAt(i, '_');
		}
		System.out.println(p2);
	}
	
	public static void main(String[] args) {
		String palabra="simon";
		StringBuilder palabra2=new StringBuilder(palabra);
		String letraErronea="";
		StringBuilder letraErronea2= new StringBuilder(letraErronea);
		/*
		System.out.println("El juego del Ahorcado!");
		System.out.println("Te dare una palabra con espacios en blanco y tu debes adivinar las letras que le faltan");
		System.out.println("Comenzemos!!!");*/
		/*quita letras del string*/
		transformaCadena(palabra, palabra2);
		
		/*comienza el juego*/
		/*di una letra*/
		String opoLetra;
		int intentosFallidos=0;
		int intentosNormales=0;
		//int c=0;
		do {
			Scanner sc=new Scanner(System.in);
			opoLetra=sc.nextLine();
			/*di una letra*/
			boolean aciertos=false;
			for(int i=0;i<palabra.length();i++) {
				if(opoLetra.equals(String.valueOf(palabra.charAt(i)))) {
					palabra2.setCharAt(i, opoLetra.charAt(0));
					aciertos=true;
				}
			}
			if(aciertos){
				System.out.println("Acertaste la:"+opoLetra+"!!");
			}else {
				System.out.println("Fallaste la:"+opoLetra+"!!");
				intentosFallidos++;
				//System.out.println(intentosFallidos);
				for(int i=0;i<10;i++) {
					letraErronea2.append(opoLetra+"/");
					System.out.println("Letra errónea:"+letraErronea2);
					break;
				}
			}
			System.out.println(palabra2);
			if(intentosFallidos==10) {
				break;
			}
			intentosNormales++;
			System.out.println("Número de intentos: "+intentosNormales);
			//c++;
		} while (!palabra2.toString().equals(palabra));//mientras que la palabra2 no esté completamente adivinada
		if(intentosFallidos==10) {
			System.out.println("Intentos fallidos:"+ intentosFallidos+"...PERDISTE :(...");
		}else {
			System.out.println("GANASTE!!!");
			System.out.println("Número de intentos: "+intentosNormales);
		}
	}

}
