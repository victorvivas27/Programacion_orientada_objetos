public class CuentaCorriente extends Cuenta {
    private Double montoDescubierto;
    public CuentaCorriente(Integer numero, Cliente cliente, Double montoDescubierto) {
        super(numero, cliente);
        this.montoDescubierto = montoDescubierto;
    }
    @Override
    public void extraer(Double monto) {
        if (monto <= (saldo+montoDescubierto)){
            System.out.println("saldo anterior: $" + saldo);
            System.out.println("monto retiro: $" + monto);
            saldo -= monto;
            System.out.println("nuevo saldo: $" + saldo);
        } else {
            System.out.println("Su saldo es insuficiente para ejecutar esta operacion");
        }
    }
    public void depositarCheque(){

        System.out.println("su cheque ha sido depositado");
    }

}