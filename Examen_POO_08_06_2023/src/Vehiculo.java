public abstract class Vehiculo {
     private  String patente;
     private  String marca;
     private  String fechaAdquicision;
     private Double cotizacionUSD;
     private  Boolean industriaNacional;
     private  Dueno Dueno;

    public Vehiculo(String patente, String marca, String fechaAdquicision, Double cotizacionUSD, Boolean industriaNacional, Dueno dueno) {
        this.patente = patente;
        this.marca = marca;
        this.fechaAdquicision = fechaAdquicision;
        this.cotizacionUSD = cotizacionUSD;
        this.industriaNacional = industriaNacional;
        Dueno = dueno;
    }

    public abstract Boolean esIndustriaNacional();

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getFechaAdquicision() {
        return fechaAdquicision;
    }

    public Double getCotizacionUSD() {
        return cotizacionUSD;
    }

    public Boolean getIndustriaNacional() {
        return industriaNacional;
    }
}
