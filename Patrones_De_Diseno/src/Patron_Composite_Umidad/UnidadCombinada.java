package Patron_Composite_Umidad;

import java.util.ArrayList;
import java.util.List;

public class UnidadCombinada extends Unidad{

     private Double coeficienteGlobal;

     private List<Unidad>unidadList;

    public UnidadCombinada(String nombre, String descripcion, Double coeficienteGlobal) {
        super(nombre, descripcion);
        this.coeficienteGlobal = coeficienteGlobal;

        unidadList = new ArrayList<>();
    }

    public void agregarUnidad(Unidad unidad){
        unidadList.add(unidad);

    }
    public  void removerUnidad(Unidad unidad){
        unidadList.remove(unidad);
    }

    @Override
    public Double calcularMonto() {
        Double monto =0.0;
        for (Unidad unidad : unidadList) {
            monto+= unidad.calcularMonto();

        }
        return  monto * coeficienteGlobal;
    }


}
