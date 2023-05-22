public class Main {
    public static void main(String[] args) {
        UsuarioJuego jugador1 = new UsuarioJuego("jUAN","JUAN1223");
        // Comprobar que los valores iniciales son cero
        System.out.println("Puntaje inicial: " + jugador1.getPuntaje()); // Salida: 0.0
        System.out.println("Nivel inicial: " + jugador1.getNivel()); // Salida: 0

        // Llamar a los métodos para aumentar el puntaje y subir de nivel
        jugador1.aumentarPuntaje();
        jugador1.aumentarPuntaje();
        jugador1.aumentarPuntaje();
        jugador1.subirNivel();
        jugador1.subirNivel();

        // Comprobar que los valores se han incrementado correctamente
        System.out.println("Nuevo puntaje: " + jugador1.getPuntaje());
        System.out.println("Nuevo nivel: " + jugador1.getNivel());

        // Llamar al método para recibir un bonus
        jugador1.bonus(5);

        // Comprobar que el bonus se ha sumado correctamente al puntaje
        System.out.println("Puntaje con bonus: " + jugador1.getPuntaje());
    }


    }
