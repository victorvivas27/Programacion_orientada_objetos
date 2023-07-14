

public interface Observable {

    public void agregar(Observador obj);

    public void quitar(Observador obj);

    public void notificar(String cambio);
}
