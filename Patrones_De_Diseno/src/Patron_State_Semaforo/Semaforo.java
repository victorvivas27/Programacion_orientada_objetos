package Patron_State_Semaforo;

public class Semaforo {
    private StateSemaforo estadoSemaforo;
    public  Semaforo (){
        this.estadoSemaforo = new Verde();
    }
public  void mostrarAviso (){
        estadoSemaforo.mostrarAviso();
}
public  void cambiarEstado (){
        estadoSemaforo = estadoSemaforo.cambiarEstado();
}
}
