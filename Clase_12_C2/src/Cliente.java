public class Cliente {
    private Integer numero;
    private String apellido;
    private Integer dni;
    private String cuit;
    public Cliente(Integer numero, String apellido, Integer dni, String cuit) {
        this.numero = numero;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }
    public Integer getNumero() {
        return numero;
    }
    public String getApellido() {
        return apellido;
    }
    public Integer getDni() {
        return dni;
    }
    public String getCuit() {
        return cuit;
    }




}
