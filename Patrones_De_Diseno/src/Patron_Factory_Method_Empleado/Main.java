package Patron_Factory_Method_Empleado;

public class Main {
    public static void main(String[] args) {
        EmpleadoFactory empleado = EmpleadoFactory.getInstance();
        Empresa empresa = new Empresa("Globahnt");
empresa.agregarEmpleado(empleado.crearEmpleado(EmpleadoFactory.CLAVE_EMP_PH));
empresa.agregarEmpleado(empleado.crearEmpleado(EmpleadoFactory.CLAVE_EMP_RD));
        System.out.println(empresa.calcularSueldoTotal(30));
        System.out.println(empresa.calcularSueldoTotal(10));


    }
}
