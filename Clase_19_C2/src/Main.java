public class Main {
    public static void main(String[] args) {
        ProductoFactory fabrica1 = ProductoFactory.getInstance();
        Almacen almacen = new Almacen();
        almacen.agregarProducto(fabrica1.crearProducto("CAJA10X10"));
        almacen.agregarProducto(fabrica1.crearProducto("PELOTAFUTBOL"));
        almacen.agregarProducto(fabrica1.crearProducto("PELOTATENIS"));
        System.out.println("El tamaño total requerido del alamacen sera: " + almacen.calculcarEspacioNecesario());


    }
}
