//Ejercicio 3
//        Escribir una función:
//        boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
//        que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o
//        false, en caso de que coincidan.

package clase2;
import java.util.Scanner;

public class programaCadenasDistintas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer texto: ");
        String texto1 = sc.nextLine();
        System.out.print("Ingrese el segundo texto: ");
        String texto2 = sc.nextLine();
        boolean sonDistintos = cadenasDeTextoDistintas(texto1, texto2);
        System.out.println("Los textos " + (sonDistintos ? "son distintos" : "coinciden"));
    }
    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB) {
        return !unTextoA.equals(unTextoB);
    }
}


