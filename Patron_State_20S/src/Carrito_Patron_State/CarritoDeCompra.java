package Carrito_Patron_State;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompra {
    private CarritoState estadoActual;
    private List<Producto>productoList;

    public CarritoDeCompra() {
        this.estadoActual = new EstadoVacio();
        this.productoList= new ArrayList<>();
    }
    public void agregarProducto(){
estadoActual=estadoActual.agregarProducto();

    }
     public  void cancelarProducto(){
        estadoActual=estadoActual.canselarProducto();

     }
     public void volverPuntoAnterior(){
        estadoActual=estadoActual.volverPuntoAnterior();


     }
     public  void pasarSiguienteEstado(){
        estadoActual=estadoActual.pasarSuienteEstado();


     }

    @Override
    public String toString() {

        return estadoActual.toString();
    }
}
