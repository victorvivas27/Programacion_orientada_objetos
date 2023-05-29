package empresa;

public class EmpleadoProduccion extends Empleado {
    private int tiempoExperincia;

    public EmpleadoProduccion(String nombre, String apellido, String dni, int tiempoExperincia) {
        super(nombre, apellido, dni);
        this.tiempoExperincia = tiempoExperincia;
    }

    @Override
    public void trabajar() {
        System.out.println(" Empleado de produccion " + getNombre() + " trabajando ");
    }
}
