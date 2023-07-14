import java.util.ArrayList;
public class Pizarra implements Observable{

    private ArrayList<Observador> observadores = new ArrayList<>();
    private Double precioActual;

    public void cambiarPrecio(Double precio){
        this.precioActual = precio;
        notificar(" precio actualizado a " + obtenerPrecio());
    }

    public Double obtenerPrecio(){

        return precioActual;
    }

    @Override
    public void agregar(Observador obj) {

        this.observadores.add(obj);
    }

    @Override
    public void quitar(Observador obj) {
        this.observadores.remove(obj);
    }

    @Override
    public void notificar(String cambio) {
        for(Observador obj : observadores)
        System.out.println(obj.actualizar() + cambio);
    }
}
