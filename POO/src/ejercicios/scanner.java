package ejercicios;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        int edad;
        String nombre1;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
         nombre1 = scanner1.nextLine();
        System.out.println("Ingrese tu edad: ");
        edad = scanner1.nextInt();
        System.out.println("Hola, " + nombre1 + " "+ "Tu edad es:"+ edad + "años !!");

        //Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en
        //una tercera tus iniciales.
        String nombre;
        String apellido;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido: ");
        apellido = scanner.nextLine();

        // Obtener las iniciales del nombre y el apellido
        char inicialNombre = nombre.charAt(0);
        char inicialApellido = apellido.charAt(0);

        // Imprimir las iniciales
        System.out.println("Sus iniciales son: " + inicialNombre + "." + inicialApellido + ".");

    }
}
