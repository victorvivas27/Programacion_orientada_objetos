
public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("Federico", "Achaval", "f35678");
        Embarcacion yate1 = new Yate(2000.0, 50.00, 2020, 17, capitan1, 7, " Salvador");
        Embarcacion yate2 = new Yate(700.00, 45.0, 2021, 28, capitan1, 6, " Naufrago");
        Embarcacion velero1 = new Velero(400.0, 60.0, 2023, 28, capitan1, 4);

        System.out.println(yate1.calcularMontoAlquiler());
        System.out.println(((Velero)velero1).esGrande());

        if (((Yate) yate1).compareTo(yate2) > 0) {
            System.out.println(((Yate) yate1).getNombreYate() + " Es un yate de lujo ");

        } else if (((Yate) yate1).compareTo(yate2) < 0) {
            System.out.println(((Yate) yate2).getNombreYate() + " No es un yate  de lujo ");

        } else {
            System.out.println(" Los yates son iguales ");
        }

    }
}