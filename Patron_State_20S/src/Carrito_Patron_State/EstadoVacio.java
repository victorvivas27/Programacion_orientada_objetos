package Carrito_Patron_State;

public class EstadoVacio implements CarritoState {


    @Override
    public CarritoState agregarProducto() {
        return new EstadoCargando();
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
        return new EstadoCargando();
    }
}

