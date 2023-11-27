package U3.Tarea2Cadenas;

public class Actividad8 {

	public static void main(String[] args) {
		/*
		Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan 
		sus frases con "Javalín, javalón", para después hacer una pausa más o menos larga (la pausa 
		se representa mediante espacios en blanco) y a continuación expresan el mensaje. Existe un 
		dialecto que no comienza sus frases con la muletilla anterior, pero siempre las terminan con 
		un silencio, más o menos prolongado y la coletilla "javalén, len, len". Se pide diseñar un 
		traductor que, en primer lugar, nos diga si la frase está escrita en el idioma de Javalandia 
		(en cualquiera de sus dialectos), y en caso afirmativo, nos muestre el mensaje sin muletillas. 
		*/

		String cadena="Cadena";
		System.out.println(cadena.length());
/**/
		String invertido="";
		for(int i=cadena.length()-1;i>=0;i--) {
			invertido+=cadena.charAt(i);
		}
		System.out.println(invertido);
/**/
		String minimay="";
		for(int i=0;i<cadena.length();i++) {
			char carl=cadena.charAt(i);
			if(Character.isUpperCase(carl)) {
				minimay+=Character.toLowerCase(carl);
			}else {
				minimay+=Character.toUpperCase(carl);
			}
		}
		System.out.println(minimay);
/**/
		int vocales=0;
		for(int i =0;i<cadena.length();i++){
			char carl=cadena.charAt(i);
			if(String.valueOf(carl).matches("[aeiouAEIOUÁÉÍÓÚáéíóú]")) {
				System.out.println("es vocal");
				vocales++;
			}
		}
		System.out.println("hay "+vocales+" vocales");
/**/
		String cadena2="La vida es una mierda";
		for(int i=0;i<cadena2.length();i++) {
			char var=cadena2.charAt(i);
			if(String.valueOf(var).matches(" ")) {
				cadena2=cadena2.replace(" ","");	
			}
		}
		System.out.println(cadena2);
/**/ 
		String pali="Anna";
		
		
		
	}

}
