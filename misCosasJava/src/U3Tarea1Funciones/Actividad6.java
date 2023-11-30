package U3Tarea1Funciones;

public class Actividad6 {
	
	public static boolean vocal(String c) {
		boolean VoC = false;
		
		
		
		switch (c) {
		case "a","e","i","o","u": {
			VoC=true;
			break;
		}
		default:
			VoC=false;
			break;
		}
		if(VoC) {
			System.out.println("Vocal");;
		}else {
			System.out.println("Consonante");
		}
		
		return VoC;
	}
	
	public static void main(String[] args) {
		//Crear una función que, mediante un booleano, indique si el carácter 
		//que se pasa como parámetro de entrada corresponde con una vocal.
		
		vocal("b");
	}
}
