package Patron_State_Semaforo;

public class Verde  implements  StateSemaforo{
    @Override
    public void mostrarAviso() {
        System.out.println("El semaforo esta en estado  VERDE ");
    }

    @Override
    public StateSemaforo cambiarEstado() {
        return new Amarillo();
    }
}
