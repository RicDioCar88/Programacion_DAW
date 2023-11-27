package U3.Tarea2Cadenas;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		/*
		 Pedir el nombre completo (nombre y apellidos) al usuario. El programa debe eliminar cualquier vocal 
		 del nombre. Por ejemplo: "Álvaro Pérez" se mostrará como "lvr Prz". Sólo se eliminarán las vocales 
		 (mayúsculas, minúsculas y acentuadas). El resto de caracteres no se modifican. 
		*/
		
		Scanner sc = new Scanner(System.in);

        // Pedir el nombre completo al usuario
        System.out.print("Ingrese su nombre completo: ");
        String nombre = sc.nextLine();

        // Eliminar las vocales del nombre
        StringBuilder nombreSinVocales = new StringBuilder();

        for (int i = 0; i < nombre.length(); i++) {
            char caracter = nombre.charAt(i);

            // Verificar si el caracter no es una vocal (mayúscula o minúscula, acentuada o no)
            if ("aeiouAEIOUáéíóúÁÉÍÓÚ".indexOf(caracter) == -1) {
                nombreSinVocales.append(caracter);
            }
        }

        // Mostrar el resultado
        System.out.println("Nombre sin vocales: " + nombreSinVocales);
		
		
	}

}
