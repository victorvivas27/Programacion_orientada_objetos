package Patron_Composite_Umidad;

public class UnidadFactory {
    private static UnidadFactory instance = new UnidadFactory();

    private UnidadFactory() {
    }

    public static UnidadFactory getInstance() {
        return instance;
    }

    public Unidad crearUnidad(String codigo) {
        switch (codigo) {
            case "MTA":
                return new UnidadSimple("Mantenimiento", "Trabajos generales", 12000.0, 4);
            case "LPZ":
                return new UnidadSimple("Lipieza", "Limpieza Mantenimiento", 10000.0, 24);
            case "UC":
                UnidadCombinada unidadCombinada = new UnidadCombinada("Servicios Generales", "Limpieza y Mantenimiento", 3.0);
                unidadCombinada.agregarUnidad();

        }

    }
}
