public class ProductoFactory {
    private static ProductoFactory instance = new ProductoFactory();

    private ProductoFactory() {

    }

    public static ProductoFactory getInstance() {

        return instance;
    }
    public  Producto crearProducto ( String codigo){
        switch ( codigo){
            case "CAJA10X10":
                return new Caja(5.0,10.0,10.0,10.0);
            case "PELOTAFUTBOL":
                return new Pelota(1.0,11.0);
            case "PELOTATENIS":
                return new Pelota(0.5,0.32);
        }
        return null;
    }
}
