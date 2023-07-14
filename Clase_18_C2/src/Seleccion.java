import java.util.ArrayList;
import java.util.List;

public class Seleccion {
    private String nombre;
    private List<Jugador> plantel;

    public Seleccion(String nombre) {
        this.nombre = nombre;
        plantel = new ArrayList<Jugador>();
    }

    public void convocar(Jugador unJugador) {
        plantel.add(unJugador);
    }

    public List<Jugador> optenerReservas() {
        List<Jugador> reservas = new ArrayList<>();
        for (int indiceJugador = 18; indiceJugador < plantel.size(); indiceJugador++) {
            reservas.add(plantel.get(indiceJugador));


        }

        return reservas;
    }

    public Integer cantidadJugadores(String posicion)  throws  SeleccionException{
        Integer cantidadJugadoresPosicion = 0;
        for (Jugador jugador : plantel) {
            if (jugador.getPosicion().equals(posicion)) {
                cantidadJugadoresPosicion++;
            }
        }
        if (cantidadJugadoresPosicion == 0){
            throw new SeleccionException("Esta posicion no existe");

        }
         return cantidadJugadoresPosicion;

    }

}

