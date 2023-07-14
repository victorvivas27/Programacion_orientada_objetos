package Patron_Composite_Tren;

public class Main {
    public static void main(String[] args) {
        ElementoComposite vagon1 = new ElementoComposite();
        vagon1.agregarFigura( new Rectangulo(5.0,4.0));
        vagon1.agregarFigura( new Circulo(1.0));
        vagon1.agregarFigura( new Circulo(1.0));
        vagon1.agregarFigura(new Circulo(1.0));
        System.out.println(vagon1.calcularArea());
        ElementoComposite locomotora =new ElementoComposite();
        locomotora.agregarFigura(new Rectangulo(6.0,4.0));
        locomotora.agregarFigura(new Rectangulo(4.0,3.0));
        locomotora.agregarFigura(new Rectangulo(3.0,2.0));
        locomotora.agregarFigura( new Circulo(1.0));
        locomotora.agregarFigura( new Circulo(1.0));
        locomotora.agregarFigura( new Triangulo(2.0,2.0));
        System.out.println(locomotora.calcularArea());

    }
}
