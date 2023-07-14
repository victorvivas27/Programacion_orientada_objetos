public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    private Double deuda;
    private Double limite;

    public Cliente(String nombre, String apellido, String DNI, double limite) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.limite= limite;
        deuda=0.0;
    }
    public void comprar(double importe) throws ClienteException
    {
        if(deuda+importe>limite){
            throw new ClienteException("Limite superado para esta compra");
        }
        deuda+=importe;
    }
    public void saldarDeuda(double importe) throws ClienteException
    {
        if(deuda==0.0){
            throw new ClienteException("Hey estÃ¡s queriendo donar tu dinero?");
        }
        deuda-=importe;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                nombre + ' ' +
                apellido + ' ' +
                ", su deuda es=" + deuda + "$ }";
    }
}
