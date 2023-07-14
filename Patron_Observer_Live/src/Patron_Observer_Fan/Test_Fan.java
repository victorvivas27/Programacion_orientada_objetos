package Patron_Observer_Fan;

public class Test_Fan {
    public static void main(String[] args) {
        Idolo Korean = new Idolo();
        Fan fan1 = new Fan("Victor", "Vivas", 3);
        Fan fan2 = new Fan("Yanina", "Juarez", 2);
        Korean.agregar(fan1);
        Korean.agregar(fan2);
        Korean.transmitir();
        Korean.finalizarTransmicion();
    }
}