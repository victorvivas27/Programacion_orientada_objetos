package Patron_Composite_Umidad;

public class UnidadSimple  extends  Unidad  {

      private Double montoPersona;
      private Integer cantidadPersonas;

    public UnidadSimple(String nombre, String descripcion, Double montoPersona, Integer cantidadPersonas) {
        super(nombre, descripcion);
        this.montoPersona = montoPersona;
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public Double calcularMonto() {
        Double monto = montoPersona* cantidadPersonas;
        if (cantidadPersonas>10){
            monto*=1.2;
        }
        return monto;
    }


}
