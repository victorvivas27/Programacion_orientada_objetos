package Patron_Observer_Seguidor;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Observable {
    private String nombreUsuario;
    private String apellidoUsuario;
    private List<Observer> observerList;

    public Usuario(String nombreUsuario, String apellidoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        observerList = new ArrayList<>();
    }

    @Override
    public void agregar(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void eliminar(Observer observer) {
        observerList.remove(observer);

    }

    @Override
    public void notificar() {
        for (Observer observer : observerList) {
            observer.actualizar(this);

        }


    }
    public void subirFoto(){
        System.out.println("Soy "+nombreUsuario+" y estoy subiendo un Foto ");
        notificar();
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
}
