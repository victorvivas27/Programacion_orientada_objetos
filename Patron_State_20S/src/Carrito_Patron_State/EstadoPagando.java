package Carrito_Patron_State;

public class EstadoPagando implements CarritoState {


    @Override
    public CarritoState agregarProducto() {
        return this;
    }

    @Override
    public CarritoState canselarProducto() {
        return this;
    }

    @Override
    public CarritoState volverPuntoAnterior() {
        return this;
    }

    @Override
    public CarritoState pasarSuienteEstado() {
        return new EstadoCerrado();
    }
}
