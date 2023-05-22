import java.time.LocalDate;

public class Perro {
    //ATRIBUTOS DE LA CLASE PERRO*******************************
    private Boolean estaEnAdopcion;
    private String raza;
    private Integer anoNacimiento;
    private Double peso;
    private Boolean tieneChip;
    private Boolean estaLastimado;
    private String nombreAsignado;
    private Boolean estaVacunado;
    private String nombreReal;

    //CONSTRUCTOR DE LA CLASE PERRO **************************************************************
    public Perro(String raza, Integer anoNacimiento, Double peso,
                 String nombreAsignado, Boolean estaEnAdopcion, Boolean estaLastimado, Boolean tieneChip) {
        this.raza = raza;
        this.anoNacimiento = anoNacimiento;
        this.peso = peso;
        this.nombreAsignado = nombreAsignado;
        this.estaEnAdopcion = estaEnAdopcion;
        this.estaLastimado = estaLastimado;
        this.tieneChip = tieneChip;

    }
//CONTRUCTOR NUMERO 2 DE LA CLASE PERRO ***********************************************


    public Perro(String raza,Integer anoNacimiento,Double peso,String nombreAsignado,Boolean estaEnAdopcion,Boolean estaLastimado, Boolean tieneChip,
                  Boolean estaVacunado, String nombreReal) {
        this.estaEnAdopcion = estaEnAdopcion;
        this.raza = raza;
        this.anoNacimiento = anoNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombreAsignado = nombreAsignado;
        this.estaVacunado = estaVacunado;
        this.nombreReal = nombreReal;
    }

    //LOS GETTER DE LA CLASE PERRO ************************************************************
    public Boolean getEstaEnAdopcion() {
        return estaEnAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public Integer getAnoNacimiento() {
        return anoNacimiento;
    }

    public Double getPeso() {
        return peso;
    }

    public Boolean getTieneChip() {
        return tieneChip;
    }

    public Boolean getEstaLastimado() {
        return estaLastimado;
    }

    public String getNombreAsignado() {
        return nombreAsignado;
    }

    public Boolean getEstaVacunado() {
        return estaVacunado;
    }

    public String getNombreReal() {
        return nombreReal;
    }
    // METODO PARA VERIFICAR SI SE PUEDE ADOPTAR
    public Boolean aptoParaAdopcion (){
        if ( !estaLastimado && peso>=5.0 &&estaEnAdopcion==true){
            return true;
        }else return false;
    }
    //METODO PARA CALCULAR LA EDAD
    public int calcularEdad(int anoNacimiento) {
        int añoActual = LocalDate.now().getYear();
       return añoActual - anoNacimiento;
    }
    //METODO PARA SABER SI ES PROBABLE QUE SIE PIERDA SI TIENE O NO CHIP
    public  Boolean sePuedePerder() {
        if (tieneChip == true) {
            return false;
        } else  return true;
    }
    //METODO PARA SABER SI ESTA APTO PARA ADOPTAR EN  EL EXTRANJERO
    public Boolean aptoAdopcionExtranjero(){
        if (!estaLastimado && peso>=7.0&& estaEnAdopcion== true && estaVacunado){
            return true;
        } else return false;
    }
}
