
public class Main {
    public static void main(String[] args) {
 Suma suma = new Suma(45);
        System.out.println(suma.getSuma());
        suma.setSuma(2);
        System.out.println(suma.getSuma());
        Multiplicar multiplicar = new Multiplicar (4);
        System.out.println(multiplicar.multiplicando());
        System.out.println(suma.losDos(23));
    }
}