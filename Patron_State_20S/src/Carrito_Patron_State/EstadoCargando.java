package Carrito_Patron_State;

public class EstadoCargando implements CarritoState {


    @Override
    public CarritoState agregarProducto() {
        return this;
    }

    @Override
    public CarritoState canselarProducto() {
        return new EstadoVacio();
    }

    @Override
    public CarritoState volverPuntoAnterior() {
        return new EstadoVacio();
    }

    @Override
    public CarritoState pasarSuienteEstado() {
        return new EstadoPagando();
    }
}
