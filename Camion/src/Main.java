public class Main {
    public static void main(String[] args) {
        Camion miCamion = new Camion("Ford","AB XXX CD");
        Camion.cambiarPrecioCombustible(98.50);
        System.out.println("Gasto "+ miCamion.gastoCombustible(40));
    }
}