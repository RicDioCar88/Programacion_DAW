package tarea8b;


import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        Scanner sc = new Scanner(System.in);

        // Pedir el primer día de la semana
        System.out.println("Escribe un día de la semana:");
        String primerDia = sc.next();

        // Verificar que el primer día ingresado es válido
        boolean successPrimerDia = false;
        for (int i = 0; i < dias.length; i++) {
            if (dias[i].equalsIgnoreCase(primerDia)) {
                successPrimerDia = true;
                break;
            }
        }

        if (!successPrimerDia) {
            System.out.println("ERROR: Día no válido");
            return;
        }

        // Pedir la hora de partida
        System.out.println("Escribe la hora de partida (sin minutos ni segundos):");
        int horaPartida = sc.nextInt();

        // Calcular el segundo día (contiguo al primero)
        int indicePrimerDia = 0;
        for (int i = 0; i < dias.length; i++) {
            if (dias[i].equalsIgnoreCase(primerDia)) {
                indicePrimerDia = i;
                break;
            }
        }

        int indiceSegundoDia = indicePrimerDia + 1;
        String segundoDia = dias[indiceSegundoDia];

        // Calcular y mostrar las horas transcurridas
        System.out.println("Escribe la hora de llegada (sin minutos ni segundos):");
        int horaLlegada = sc.nextInt();

        if (indicePrimerDia < indiceSegundoDia) {
            int horasTranscurridas = (indiceSegundoDia - indicePrimerDia) * 24 + (horaLlegada - horaPartida);
            System.out.println("Horas transcurridas: " + horasTranscurridas);
        } else {
            System.out.println("ERROR: El segundo día debe ser posterior al primer día.");
        }
    }

}
