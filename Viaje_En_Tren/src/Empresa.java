import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Reserva> reservaList;


    public int cantidadVecesRecorrida(Estacion estacion) throws EmpresaExeception {
        int cantidadPersonas = 0;
        for (Reserva reserva : reservaList) {
            if (estacion.equals(reserva.getTrayectoReserva().getInicial()) || estacion.equals(reserva.getTrayectoReserva().getEstacionFinal())) {

            }
            if (cantidadPersonas == 0) {
                throw new EmpresaExeception(" Ninguna persona subio o bajo en esata estacion ");
            }

        }
        return cantidadPersonas;

    }

}
