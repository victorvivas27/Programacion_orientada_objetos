package clase3;
import java.util.Scanner;

public class piedraPapelTijera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenidos a Piedra, papel o tijera!");

        System.out.print("Jugador 1, ¿cómo te llamás?: ");
        String jugador1 = scanner.nextLine();

        System.out.print("Jugador 2, ¿cómo te llamás?: ");
        String jugador2 = scanner.nextLine();

        int puntos1 = 0;
        int puntos2 = 0;

        while (puntos1 < 3 && puntos2 < 3) {
            System.out.print(jugador1 + ", ¿qué jugás? (Piedra [P], Papel [L], Tijera [T] o Finalizar [*]): ");
            String jugada1 = scanner.nextLine().toUpperCase();

            if (jugada1.equals("*")) {
                System.out.println("Fin del juego. Puntos finales:");
                System.out.println(jugador1 + ": " + puntos1 + " puntos");
                System.out.println(jugador2 + ": " + puntos2 + " puntos");
                if (puntos1 > puntos2) {
                    System.out.println(jugador1 + " es el ganador!");
                } else if (puntos2 > puntos1) {
                    System.out.println(jugador2 + " es el ganador!");
                } else {
                    System.out.println("Empate!");
                }
                break;
            }

            System.out.print(jugador2 + ", ¿qué jugás? (Piedra [P], Papel [L] o Tijera [T]): ");
            String jugada2 = scanner.nextLine().toUpperCase();

            int resultado = cualGana(jugada1, jugada2);

            if (resultado == 0) {
                System.out.println("Empate!");
            } else if (resultado == 1) {
                System.out.println(jugador1 + " gana!");
                puntos1++;
            } else {
                System.out.println(jugador2 + " gana!");
                puntos2++;
            }
        }
    }

    public static int cualGana(String jugada1, String jugada2) {
        if (jugada1.equals(jugada2)) {
            return 0; // Empate
        }

        if (jugada1.equals("P") && jugada2.equals("T") || jugada1.equals("L") && jugada2.equals("P")
                || jugada1.equals("T") && jugada2.equals("L")) {
            return 1; // Jugador 1 gana
        } else {
            return 2; // Jugador 2 gana
        }
    }
}
