public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Victor", "Vivas", "27076514",10000.0 );
        System.out.println(cliente.toString());
        try {

            cliente.comprar(10000.0);
            cliente.saldarDeuda(200.0);
            System.out.println(cliente.toString());
            cliente.saldarDeuda(10000.0);
            System.out.println(cliente.toString());
            cliente.saldarDeuda(2899.0);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Mi codigo ");
    }
}
