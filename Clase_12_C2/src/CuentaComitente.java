public class CuentaComitente  extends Cuenta {
    private String cnv;

    public CuentaComitente(Integer numero, Cliente cliente, String cnv) {
        super(numero, cliente);
        this.cnv = cnv;
    }

    @Override
    public void depositar(Double monto) {
        super.depositar(monto * 0.99);
    }

    @Override
    public void extraer(Double monto) {
        if (monto <= (saldo / 2)) {
            System.out.println("saldo anterior: $" + saldo);
            System.out.println("monto retiro: $" + monto);
            saldo -= monto;
            System.out.println("nuevo saldo: $" + saldo);
        } else {
            System.out.println("Su saldo es insuficiente para ejecutar esta operacion");
        }
    }
    public void extraer (Double monto, String cnv) {
        if (this.cnv.equals(cnv)) {
            if (monto <= saldo) {
                System.out.println("saldo anterior: $" + saldo);
                System.out.println("monto retiro: $" + monto);
                saldo -= monto;
                System.out.println("nuevo saldo: $" + saldo);
            } else {
                System.out.println("Su saldo es insuficiente para ejecutar esta operación");
            }
        } else {
            System.out.println("El código ingresado no es correcto");
        }
    }

}







