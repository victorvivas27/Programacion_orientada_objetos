package Patron_Factory_Method_Empleado;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    public List<Empleado> empleadoList;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        this.empleadoList = new ArrayList<>();
    }

    public Double calcularSueldoTotal(Integer diasTrabajados ){
        Double sueldoTotal= 0.0;
        for (Empleado empleado : empleadoList) {
            sueldoTotal+=empleado.calcularSueldo(diasTrabajados);

        }
        return sueldoTotal;
    }
    public void agregarEmpleado(Empleado empleado){
        empleadoList.add(empleado);
    }


}
