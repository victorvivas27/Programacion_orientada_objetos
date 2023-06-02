public abstract class Cuenta {
    private Integer numero;
    private Cliente cliente;
    protected Double saldo;

    public Cuenta(Integer numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        saldo = 0.0;
    }

    public void informarSaldo() {
        System.out.println("su saldo es de: $" + saldo);
    }

    public void depositar(Double monto) {
        saldo += monto;
        System.out.println("monto deposito: $" + monto);
        System.out.println("Saldo anterior: $" + saldo);
        System.out.println("Nuevo saldo: $" + saldo);
    }

    public Double getSaldo() {

        return saldo;
    }

    public abstract void extraer(Double monto);

}
