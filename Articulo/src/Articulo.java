
public class Articulo {
    //LOS ATRIBUTOS DE LA CLASE ARTICULOS SIEMPRE VAN EN PRIVATE
    private String descripcion;
    private double precioVenta;
    private int stock;
    //*****************************************************

    //AQUI DESPUES DE LOS ATRIBUTOS COMIENZA EL CONTRUCTOR
    public Articulo(String descripcion, int cantidad, double precio) {
        this.descripcion = descripcion; //EN EL CASO QUE EL PARAMETRO TENGA EL MISMO NOMBRE QUE EL ATRIBUTO SE USA THIS
        this.precioVenta = precio;
        this.stock = cantidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean hayStock() {

        return stock > 0;
    }

    public double consultarPrecio() {

        return precioVenta;
    }
}

