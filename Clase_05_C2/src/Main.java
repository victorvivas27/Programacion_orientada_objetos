public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(24, "Victor Javier");//AQUI ESCRIVIMOS LOS ARGUMENTOS ,PARAMETROS
        Cliente cliente1 = new Cliente(25, "Pedro Pablo");

        System.out.println("Nombre cliente:" + cliente.getNombre() + " " + "Numero de cliente:" + cliente.getNumeroCliente());
        cliente.setNombre("Juan Carlos");//AQUI MODIFICAMOS EL NOMBRE DEL CLIENTE LLAMANDO EL METODO setNombre
        System.out.println("Nuevo nombre cliente:" + cliente.getNombre());
        cliente.incrementarDeuda(1000.0);//METODO incrementarDeuda
        cliente.incrementarDeuda(2500.0);
        cliente.pagarDeuda();//METODO pagarDeuda
        cliente1.incrementarDeuda( 2000.0);
        cliente1.incrementarDeuda(2104.0);

        System.out.println(cliente1.getDeuda());

    }
}