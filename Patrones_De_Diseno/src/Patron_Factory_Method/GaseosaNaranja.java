package Patron_Factory_Method;

public class GaseosaNaranja  extends  Gaseosa{
    String nombre = "Naranja Fanta";

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void abrir() {
        super.abrir();
    }
}
