package Patron_Factory_Method;

public class GaseosaCola extends  Gaseosa {
    String nombre= "Coca Cola";

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void abrir() {
        super.abrir();
    }
}
