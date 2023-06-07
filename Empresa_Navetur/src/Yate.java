public class Yate extends Embarcacion implements Comparable {
    private Integer cantidadCamarotes;
    private String nombreYate;

    public Yate(Double precioBase, Double valorAdicional, Integer anoFabricacion, Integer longitudEslora,
                Capitan capitan, Integer cantidadCamarotes, String nombreYate) {
        super(precioBase, valorAdicional, anoFabricacion, longitudEslora, capitan);
        this.cantidadCamarotes = cantidadCamarotes;
        this.nombreYate = nombreYate;
    }

    @Override
    public int compareTo(Object obj) {
        Yate yate = (Yate) obj;
        if (this.cantidadCamarotes > yate.cantidadCamarotes) {
            return 1;
        } else if (this.cantidadCamarotes < yate.cantidadCamarotes) {
            return -1;

        }
        return 0;
    }

    @Override
    public Double calcularMontoAlquiler() {
        Double montoAlquiler = getPrecioBase();
        if (getAnoFabricacion() > 2020) {
            montoAlquiler += getValorAdicional();
        }
        return montoAlquiler;
    }

    public String getNombreYate() {
        return nombreYate;
    }
}
