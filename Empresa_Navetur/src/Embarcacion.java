
/*Es una clase abstracta ya que no deseamos que nadie pueda instanciar algo tan abstracto*/
public abstract class Embarcacion {
    private Capitan capitan;//implementación de la relación de asociacion. "una embarcación tiene un capitan"
    private Double precioBase;
    private Double valorAdicional;
    private Integer anoFabricacion;
    private Integer longitudEslora;
    public static final int EMBARCACION_NUEVA = 2020;


    /*Implementación del método solicitdo para calcular el alquiler de una embarcación*/
    public Double calcularMontoAlquiler() {
        Double montoAlquiler = precioBase;
        if (anoFabricacion > EMBARCACION_NUEVA) {
            montoAlquiler += valorAdicional;
        }
        return montoAlquiler;
    }
    /*Getters */

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public Integer getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(Integer anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public Integer getLongitudEslora() {
        return longitudEslora;
    }

    public void setLongitudEslora(Integer longitudEslora) {
        this.longitudEslora = longitudEslora;
    }
}

