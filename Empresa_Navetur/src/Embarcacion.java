public abstract class Embarcacion {
    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anoFabricacion;
    private Integer longitudEslora;

    public Embarcacion(Double precioBase, Double valorAdicional, Integer anoFabricacion, Integer longitudEslora, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacion = anoFabricacion;
        this.longitudEslora = longitudEslora;
        this.capitan = capitan;
    }

    public abstract Double calcularMontoAlquiler();

    public Capitan getCapitan() {
        return capitan;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public Integer getAnoFabricacion() {
        return anoFabricacion;
    }

    public Integer getLongitudEslora() {
        return longitudEslora;
    }
}

