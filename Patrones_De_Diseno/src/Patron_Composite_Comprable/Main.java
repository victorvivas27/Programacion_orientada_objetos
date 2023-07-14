package Patron_Composite_Comprable;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Salchicha",38.0);
        Producto producto2 = new Producto("Pastel",34.9);
        Combo combo1 = new Combo();
        combo1.agregarComprable(producto1);
        combo1.agregarComprable(producto2);
        System.out.println(combo1.calcularPrecio());

    }
}
