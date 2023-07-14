package Patron_Factory_Method_Empleado;

public class EmpleadoRelacionDependencia extends  Empleado{
    private  Double sueldoMensual;

    public EmpleadoRelacionDependencia(String nombre, String apellido, Integer legajo, Double sueldoMensual) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public Double calcularSueldo(Integer diasTrabajdos) {
        return (sueldoMensual / 30)* diasTrabajdos;
    }
}
