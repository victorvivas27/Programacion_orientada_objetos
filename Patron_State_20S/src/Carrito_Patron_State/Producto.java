package Carrito_Patron_State;

public class Producto {
    private  Double precio;
    private  String descripcion;

    public Producto(Double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
