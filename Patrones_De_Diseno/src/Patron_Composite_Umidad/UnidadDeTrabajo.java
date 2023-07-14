package Patron_Composite_Umidad;

public class UnidadDeTrabajo {



    public void mostrarComponentes() {
        System.out.println("Unidad combinada: " + nombre + "- Monto " + calcularMonto());
        for (Unidad unidad : unidadList) {
            unidad.mostrarComponentes();

        }
    }

    public void mostrarComponentes() {
        System.out.println("Unidad Simple: " + nombre + " - Monto " + calcularMonto());
    }
}
