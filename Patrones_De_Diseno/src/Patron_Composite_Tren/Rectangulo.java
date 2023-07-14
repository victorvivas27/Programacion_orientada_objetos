package Patron_Composite_Tren;

public class Rectangulo implements  Figura{
     private Double alto;
     private  Double largo;

    public Rectangulo(Double alto, Double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public Double calcularArea() {
        return alto * largo;
    }
}
