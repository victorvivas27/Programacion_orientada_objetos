public class Velero extends Embarcacion {
    private Integer cantidadMastiles;

    public Velero(Double precioBase, Double valorAdicional, Integer anoFabricacion, Integer longitudEslora,
                  Capitan capitan, Integer cantidadMastiles) {
        super(precioBase, valorAdicional, anoFabricacion, longitudEslora, capitan);
        this.cantidadMastiles = cantidadMastiles;
    }

    public Boolean esGrande() {
        return cantidadMastiles > 4;

    }

    @Override
    public Double calcularMontoAlquiler() {
        Double montoAlquiler = getPrecioBase();
        if (getAnoFabricacion() > 2020) {
            montoAlquiler += getValorAdicional();
        }
        return montoAlquiler;
    }

}

