package clase1;

public class funciones {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        boolean resultado = esDivisible(num1, num2);
        System.out.println("¿Es " + num1 + " divisible por " + num2 + "? " + resultado);
    }
    public static boolean esDivisible(int n, int divisor) {
        if (n % divisor == 0) {
            return true;
        } else {
            return false;
        }
    }
}




















