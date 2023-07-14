package Patron_State_Semaforo;

public class Rojo implements StateSemaforo{
    @Override
    public void mostrarAviso() {
        System.out.println("El semaforo esta en estado ROJO");
    }

    @Override
    public StateSemaforo cambiarEstado() {
        return new Verde();
    }
}
