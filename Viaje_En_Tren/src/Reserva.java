import java.util.List;

public class Reserva {
    private String codigo;
    private Trayecto trayectoReserva;
    private int cantidaPersonas;


    public Reserva(String codigo, Trayecto trayectoReserva, int cantidaPersonas) {
        this.codigo = codigo;
        this.trayectoReserva = trayectoReserva;
        this.cantidaPersonas = cantidaPersonas;
    }

    public Trayecto getTrayectoReserva() {
        return trayectoReserva;
    }

    public int getCantidaPersonas() {
        return cantidaPersonas;
    }

    //Metodo calcular precio reserva
    public Double precioReserva(List<Estacion> estacionList) {
        Double precioBoletoTotal = cantidaPersonas * 50.0;
        if (
                (trayectoReserva.getInicial().equals(estacionList.get(0)) && trayectoReserva.getEstacionFinal().equals(estacionList.get(estacionList.size() - 1)))
                        || (trayectoReserva.getInicial().equals(estacionList.size() - 1) && trayectoReserva.getEstacionFinal().equals(estacionList.get(0))
                )) {
            return precioBoletoTotal * 0.8;
        }
        return precioBoletoTotal;
    }
}




