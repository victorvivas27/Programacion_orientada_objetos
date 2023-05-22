package clase1;

public class funcionesEjercicio1 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int a = 10;
        int b = 3;
        System.out.println("Suma: " + calculadora.sumar(a, b)); // Debería imprimir "Suma: 12"
        System.out.println("Resta: " + calculadora.restar(a, b)); // Debería imprimir "Resta: 8"
        System.out.println("División: " + calculadora.dividir(a, b)); // Debería imprimir "División: 5"
        System.out.println("Multiplicación: " + calculadora.multiplicar(a, b)); // Debería imprimir "Multiplicación: 20"


    }



}


class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }
    // Restar
    public int restar(int a, int b) {
        return a - b;
    }
    // Dividir
    public int dividir(int a, int b) {
        return a / b;
    }
    // Multiplicar
    public int multiplicar(int a, int b) {
        return a * b;
    }


     }

