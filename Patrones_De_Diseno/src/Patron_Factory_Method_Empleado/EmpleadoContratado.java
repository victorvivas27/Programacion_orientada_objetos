package Patron_Factory_Method_Empleado;

public class EmpleadoContratado extends  Empleado{
    private Double importePorHora;
    private  Double retencionImpuesto;

    public EmpleadoContratado(String nombre, String apellido, Integer legajo, Double importePorHora, Double retencionImpuesto) {
        super(nombre, apellido, legajo);
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public Double calcularSueldo(Integer diasTrabajados) {
        return importePorHora*8*diasTrabajados*8*(100-retencionImpuesto)/100;
    }
}
