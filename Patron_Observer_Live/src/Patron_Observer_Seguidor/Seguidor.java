package Patron_Observer_Seguidor;



public class Seguidor implements Observer {
    private String nombre;
    private String apellido;
    private Integer cantidadDeNotificaiones;


    public Seguidor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        cantidadDeNotificaiones = 0;
    }

    @Override
    public void actualizar(Usuario usuario) {
        cantidadDeNotificaiones++;
        System.out.println(nombre+" fue notificado de la foto que subio "+usuario.getNombreUsuario()+" N°de notificacion "+cantidadDeNotificaiones);
    }
}
