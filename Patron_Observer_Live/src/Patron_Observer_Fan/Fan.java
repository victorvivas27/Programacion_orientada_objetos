package Patron_Observer_Fan;

public class Fan implements Observador {
    private  String nombre;
    private String apellido;
    private  Integer nivelFan;

    public Fan(String nombre, String apellido, Integer nivelFan) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nivelFan = nivelFan;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getNivelFan() {
        return nivelFan;
    }

    @Override
    public void actualizar(String notificacion) {
        System.out.println(getNombre()+" "+getApellido()+" Mensaje de tu Idol "+ notificacion);
    }
}
