package Patron_State_Semaforo;

public class Amarillo implements  StateSemaforo{
    @Override
    public void mostrarAviso() {
        System.out.println("El semaforo esta en estado AMARILLO ");
    }

    @Override
    public StateSemaforo cambiarEstado() {
        return new Rojo();
    }
}
