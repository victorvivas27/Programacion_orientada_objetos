package Patron_Composite_Umidad;

public class Main {
    public static void main(String[] args) {
        UnidadSimple mantenimiento = new UnidadSimple("Mantenimiento","Aread mantenimiento depocito 1",12000.0,4);
        UnidadSimple limpieza = new UnidadSimple( "Limpieza","Sector limpieza depocito 2",10000.0,24);
        UnidadCombinada general = new UnidadCombinada("Servicios Generales ","Servicio 3",3.0,23.0);
        general.agregarUnidad(mantenimiento);
        general.agregarUnidad(limpieza);
        general.mostrarComponentes();
    }
}
