package Patron_Observer_Fan;

import java.util.ArrayList;

public class Idolo implements Observable {
    private Boolean enVivo;
    private ArrayList<Observador> observadores = new ArrayList<>();

    @Override
    public void agregar(Observador obj) {
observadores.add(obj);
    }

    @Override
    public void quitar(Observador obj) {
observadores.remove(obj);
    }

    @Override
    public void notificar(String mensaje) {
        for (Observador obj : observadores) {
            obj.actualizar(mensaje);

        }
    }
    public  void transmitir(){
        enVivo=true;
        notificar("Transmitiendo en vivo en www.link.com");
    }
    public  void finalizarTransmicion(){
        enVivo= false;
        notificar("enVivo finalizo,gracias a quienes pudieron participar.감사합니다 ");
    }
}
