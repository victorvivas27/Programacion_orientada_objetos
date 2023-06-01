public class Socio {
    // ATRIBUTOS DE Socio
    private String nombre;
    private Integer numeroSocio;
    private Double cuotaMensual;
    private String actividad;
//CONTRUCTOR DE Socio CON LOS ATRIBUTOS
    public Socio(String nombre, Integer numeroSocio, Double cuotaMensual, String actividad) {
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }
//METODO
    public Double calcularCostoMensual() {
        return cuotaMensual;
    }

}