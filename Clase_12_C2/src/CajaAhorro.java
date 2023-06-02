public class CajaAhorro extends Cuenta {
    Double tasaInteres;

    public CajaAhorro(Integer numero, Cliente cliente, Double tasaInteres) {
        super(numero, cliente);
        this.tasaInteres = tasaInteres;
    }
    @Override
    public void extraer(Double monto) {
        if (monto <= saldo){
            System.out.println("saldo anterior: $" + saldo);
            System.out.println("monto retiro: $" + monto);
            saldo -= monto;
            System.out.println("nuevo saldo: $" + saldo);
        } else {
            System.out.println("Su saldo es insuficiente para ejecutar esta operacion");
        }
    }
    public void cobrarIntereses (){
        System.out.println("saldo anterior: $" + saldo);
        Double intereses = saldo * tasaInteres / 100;
        System.out.println("monto intereses: $" + intereses);
        saldo += intereses;
        System.out.println("nuevo saldo: $" + saldo);

    }

}
