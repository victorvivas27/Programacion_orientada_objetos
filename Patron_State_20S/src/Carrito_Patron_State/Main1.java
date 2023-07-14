package Carrito_Patron_State;

public class Main1 {
    public static void main(String[] args) {
        CarritoDeCompra carro = new CarritoDeCompra();
        System.out.println(carro);
        carro.agregarProducto();
        System.out.println(carro);
        carro.pasarSiguienteEstado();
        System.out.println(carro);
        carro.pasarSiguienteEstado();
        System.out.println(carro);
        carro.volverPuntoAnterior();
        System.out.println(carro);
    }
}
