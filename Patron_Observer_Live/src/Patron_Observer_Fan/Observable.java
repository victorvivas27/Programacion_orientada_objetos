package Patron_Observer_Fan;

public interface Observable {
    void  agregar (Observador obj);
    void  quitar (Observador obj);
    void notificar(String mensaje);
}
