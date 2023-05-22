public class Camion {
    //ATRIBUTOS DE LA CLASE CAMION
    private String marca;
    private String patente;
    static private double valorCombustible;

    //AQUI CONSTRUCTOR
    public Camion(String marca, String patente) {
        this.marca = marca;
        this.patente = patente;
        this.valorCombustible = 0.0;
    }

    public double gastoCombustible(int litros) {
        return litros * Camion.valorCombustible;
    }

    static public void cambiarPrecioCombustible(double precio) {

        Camion.valorCombustible = precio;
    }
}


