public class SocioPileta extends Socio { // CON extens HEREDA LOS ATRIBUTOS DEL PADRE
    //ATRIBUTOS  DE SocioPileta
    private Double costPileta;
    private Boolean estaHabilitado;
    //CONSTRUCTOR HEREDA SUS ATRIBUTOS DE LA CLASE PADRE
    public SocioPileta(String nombre, Integer numeroSocio, Double cuotaMensual, String actividad, Double costPileta, Boolean estaHabilitado) {
        super(nombre, numeroSocio, cuotaMensual, actividad);//PALABRA RESERVADA super TRAE LOS ATRIBUTOS DEL PADRE
        this.costPileta = costPileta;
        this.estaHabilitado = estaHabilitado;
    }
    //SOBREESCRITURA DEL METODO PADRE, SIEMPRE SE COLOCA LA ANOTACION  @Override COMO BUENAS PRACTICAS
    @Override
    public Double calcularCostoMensual() {
        if (estaHabilitado) {
            return super.calcularCostoMensual() + costPileta;//CON LA PALABRA RESERVADA super USO EL METODO DEL PADRE
        } else {
            return super.calcularCostoMensual();
        }
    }
}
