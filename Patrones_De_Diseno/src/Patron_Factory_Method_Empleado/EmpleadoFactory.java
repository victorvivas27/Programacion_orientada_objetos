package Patron_Factory_Method_Empleado;

public class EmpleadoFactory {
    public static final String CLAVE_EMP_RD = "EMP-RD";
    public static final String CLAVE_EMP_PH = "EMP-PH";
    private static EmpleadoFactory instance=new EmpleadoFactory();

    private EmpleadoFactory() {

    }

     public static EmpleadoFactory getInstance() {
        return instance;
    }

    public Empleado crearEmpleado(String codigo) {
        switch (codigo) {
            case CLAVE_EMP_RD:
                return new EmpleadoRelacionDependencia("Victor", "Vivas", 5674, 13000.0);
            case CLAVE_EMP_PH:
                return new EmpleadoContratado("Yanina", "Juarez", 84593, 7.0, 14.0);
        }
        return null;
    }
}




