package Patron_Composait_Instituto;

public class Curso implements  Cursable {
    private String nombre;
    private String descripcion;
    private Integer cantidadHorasMensual;
    private  Double valorHora;
    public  Integer cantidadMeses;

    public Curso(String nombre, String descripcion, Integer cantidadHorasMensual, Double valorHora, Integer cantidadMeses) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadHorasMensual = cantidadHorasMensual;
        this.valorHora = valorHora;
        this.cantidadMeses = cantidadMeses;
    }

    @Override
    public Double calcularPrecio() {
        return cantidadHorasMensual*cantidadMeses*valorHora;
    }
}
