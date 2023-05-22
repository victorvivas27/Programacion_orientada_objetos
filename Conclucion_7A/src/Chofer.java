public class Chofer {
    //ATRIBUTOS CLASE CHOFER
    private  String nombre;
    private String apellido;
    private Auto auto;
//CONTRUCTOR CLASE CHOFER
    public Chofer(String nombre, String apellido, Auto auto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = auto;
    }
    //GETTER
    public String verPatente(){
        return auto.getPatente();
    }
    public String verModelo(){
        return auto.getModelo();
    }
    public String verMarca(){
        return auto.getMarca();
    }
}
