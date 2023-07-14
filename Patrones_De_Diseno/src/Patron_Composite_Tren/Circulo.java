package Patron_Composite_Tren;

public class Circulo implements  Figura{
    private Double radio;
    private static final Double PI = 3.14159265359;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return PI * radio * radio;
    }
}
