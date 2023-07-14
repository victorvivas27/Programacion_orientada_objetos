
import java.util.ArrayList;
import java.util.List;

public class Trayecto {
    private Estacion inicial;
    private Estacion estacionFinal;

    public Trayecto(Estacion inicial, Estacion estacionFinal) {
        this.inicial = inicial;
        this.estacionFinal = estacionFinal;
    }

    public Estacion getInicial() {
        return inicial;
    }

    public Estacion getEstacionFinal() {
        return estacionFinal;
    }

    @Override
    public String toString() {
        return "Trayecto{" + "Esatciones=" + '}';
    }
}

