package clase3;

import java.util.Scanner;

public class juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jugador 1, ingrese su nombre: ");
        String nombre1 = scanner.nextLine();
        int puntaje1 = 0;

        System.out.print("Jugador 2, ingrese su nombre: ");
        String nombre2 = scanner.nextLine();
        int puntaje2 = 0;

        while (true) {
            System.out.println(nombre1 + ", elija su jugada (piedra, papel, tijera, Spock, o * para terminar): ");
            String jugada1 = scanner.nextLine().toLowerCase();
            if (jugada1.equals("*")) {
                break;
            }

            System.out.println(nombre2 + ", elija su jugada (piedra, papel, tijera, Spock, o * para terminar): ");
            String jugada2 = scanner.nextLine().toLowerCase();
            if (jugada2.equals("*")) {
                break;
            }

            int resultado = cualGana(jugada1, jugada2);

            if (resultado == 1) {
                System.out.println(nombre1 + " gana la ronda!");
                puntaje1++;
            } else if (resultado == 2) {
                System.out.println(nombre2 + " gana la ronda!");
                puntaje2++;
            } else {
                System.out.println("Empate!");
            }
        }

        System.out.println("Juego terminado.");
        System.out.println(nombre1 + " hizo " + puntaje1 + " puntos.");
        System.out.println(nombre2 + " hizo " + puntaje2 + " puntos.");
        if (puntaje1 > puntaje2) {
            System.out.println(nombre1 + " gana el juego!");
        } else if (puntaje2 > puntaje1) {
            System.out.println(nombre2 + " gana el juego!");
        } else {
            System.out.println("El juego terminó en empate!");
        }
    }

    public static int cualGana(String jugada1, String jugada2) {
        if (jugada1.equals(jugada2)) {
            return 0; // empate
        } else if ((jugada1.equals("piedra") && (jugada2.equals("tijera") || jugada2.equals("Spock")))
                || (jugada1.equals("papel") && (jugada2.equals("piedra") || jugada2.equals("Spock")))
                || (jugada1.equals("tijera") && (jugada2.equals("papel") || jugada2.equals("Spock")))
                || (jugada1.equals("Spock") && (jugada2.equals("tijera") || jugada2.equals("piedra")))) {
            return 1; // gana el primero
        } else {
            return 2; // gana el segundo
        }
    }
}
