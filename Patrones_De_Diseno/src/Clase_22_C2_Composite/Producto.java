package Clase_22_C2_Composite;

public class Producto implements Comprable {
    public  String nombre;
    public  Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Double calcularPrecio() {
        return precio;
    }
}
