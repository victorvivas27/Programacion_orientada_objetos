package empresa;

public class Empleado {
    private String nombre;
    private String apellido;
    private String dni;

    public Empleado(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;

    }

    public void trabajar() {
        System.out.println("Empleado " + nombre + " trabajando ");

    }

    public void descansar() {
        System.out.println("Empleado " + nombre + " descansando ");

    }

    @Override
    public String toString() {
        return apellido + "," + nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

}

