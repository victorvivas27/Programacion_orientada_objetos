package ejercicios;

import java.util.Scanner;

public class ejercicio2A {
    public static void main(String[] args) {
        //Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
        //mensaje.
        String cadena1 = "Hola";
        String cadena2 = "Hola vic";

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son distintas.");
        }
        //Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
        //Informar el resultado obtenido.
        Integer num1 = 10;
        Integer num2 = 52;

        int comparacion = num1.compareTo(num2);

        if (comparacion > 0) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (comparacion < 0) {
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println("Los números son iguales.");
        }
        Scanner lector;
        lector = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = lector.nextLine();
        System.out.println("Hola, " + nombre + "!");


            }
        }


