import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1, "Benavidez", 11111111, "xx-xxxxxxxx-xx");
        CajaAhorro cajaAhorro1 = new CajaAhorro(001, cliente1, 10.0);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(002, cliente1, 50000.00);
        Cuenta comitente = new CuentaComitente(89,cliente1,"v.v.v");
        cuentaCorriente1.depositar(80000.0);
        cajaAhorro1.cobrarIntereses();
        comitente.informarSaldo();
        comitente.depositar(9000.0);
        comitente.informarSaldo();
        comitente.extraer(3000.0);
        ((CuentaComitente)comitente).extraer(6000.0,"VHFD");



















    }
}
