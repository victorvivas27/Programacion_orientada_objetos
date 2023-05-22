//Ejercicio 2
//        Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
//        Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
//        unNumeroC)
//        Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
//        el resultado.

package clase2;
import java.util.Scanner;

public class programaMaximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        Integer numero1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        Integer numero2 = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        Integer numero3 = sc.nextInt();
        Integer maximo = maximoEntreTresNumeros(numero1, numero2, numero3);

        System.out.println("El máximo entre " + numero1 + ", " + numero2 + " y " + numero3 + " es " + maximo);
    }

    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC) {
        Integer maximo = unNumeroA;
        if (unNumeroB > maximo) {
            maximo = unNumeroB;
        }
        else if (unNumeroC > maximo) {
            maximo = unNumeroC;
        }
        return maximo;
    }
}


