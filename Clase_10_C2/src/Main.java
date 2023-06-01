
public class Main {
    public static void main(String[] args) {
        SocioPileta socio1 = new SocioPileta ("Daniel",1245,30.0,"Programar",10.0,true);
        Socio socio2 = new SocioPileta("Victor",521,60.0,"Metalurjico",15.0,true);
        System.out.println(socio1.calcularCostoMensual());
        System.out.println(socio2.calcularCostoMensual());

    }
}