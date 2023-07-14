package Carrito_Patron_State;

public interface CarritoState {
   CarritoState agregarProducto();
   CarritoState canselarProducto();
   CarritoState volverPuntoAnterior();
   CarritoState pasarSuienteEstado ();
}
