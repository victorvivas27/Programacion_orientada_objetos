package Patron_State_Semaforo;

public class Main {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        semaforo.mostrarAviso();
        semaforo.cambiarEstado();
        semaforo.mostrarAviso();
        semaforo.cambiarEstado();
        semaforo.mostrarAviso();
        semaforo.cambiarEstado();
        semaforo.mostrarAviso();
    }
}
