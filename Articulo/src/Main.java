//AQUI USAMOS LA CLASE ARTICULO


public class Main {
    public static void main(String[] args) {
        //CREAMOS UN OBJETO O INSTANCIA DE CLASE ARTICULO
        Articulo articulo=new Articulo("Articulo1",10,1100.00);
        //UASAMOS EL METODO  .hayStock()
        if( articulo.hayStock()){
            System.out.println("Hay stock disponible "  );

        }else
            System.out.println("No hay stock disponible ");
        //UTILIZAMOS EL METODO .consultarPrecio
        System.out.println("El precio de venta es "+articulo.consultarPrecio());
    }
}