
public class Main {
    public static void main(String[] args) {
        Comparable yate1 = new Yate(4);
        Comparable yate2 = new Yate(4);


        if (yate1.compareTo(yate2) == 0) {
            System.out.println("  Yate 1 es igual a Yate 2  ");

        } else if (yate1.compareTo(yate2) > 0) {
            System.out.println(" Yate 1 es mayor a Yate 2 ");

        } else {
            System.out.println(" Yate 2 es mayor a Yate 1 ");
        }
        Velero velero = new Velero();
        Capitan capitan = new Capitan("Juan", "Rodrigez", "5tte64h");
        velero.setCapitan(capitan);
        velero.setAnoFabricacion(2021);
        velero.setValorAdicional(500.0);
        velero.setPrecioBase(10000.0);
        velero.setCantMastiles(10);

        if (velero.esGrande()) {
            System.out.println("Es un velero grande");
        }else {
            System.out.println("Es un velero chico");
        }


        System.out.println("Monto alquiler velero:"+velero.calcularMontoAlquiler());


}
}