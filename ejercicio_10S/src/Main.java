
public class Main {
    public static void main(String[] args) {
        Nave naveJugador = new Nave(10, 10, 'N', 1.5);
        Asteroide asteroide = new Asteroide(20, 20, 'O', 0);

        System.out.println("Posición inicial:");
        System.out.println("Nave jugador:( " + naveJugador.x + ", " + naveJugador.y + ")");
        System.out.println("Asteroide: (" + asteroide.x + ", " + asteroide.y + ")");

        naveJugador.irA(15, 12, 'E');
        asteroide.irA(25, 18, 'S');

        System.out.println("Posición después del movimiento:");
        System.out.println("Nave jugador: (" + naveJugador.x + ", " + naveJugador.y + ")");
        System.out.println("Asteroide: (" + asteroide.x + ", " + asteroide.y + ")");



    }
}