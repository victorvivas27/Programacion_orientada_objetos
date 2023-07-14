

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* Paciente paciente = new Paciente("Juan", "Perez", "12345", new Date(123, 3, 13));

        System.out.println(paciente.toString());
        paciente.darAlta(new Date(123, 1, 15));
        System.out.println(paciente);*/
        ///////////TRY CATCH ////////
        /*Scanner scaner = new Scanner(System.in);
        int numero1, numero2, division;
        try {
            System.out.println(" Primer numero ,debe ser un valor entero ");
            numero1 = scaner.nextInt();
            System.out.println("Divisor,un valor entero ");
            numero2 = scaner.nextInt();
            division= numero1/numero2;
            System.out.println(division);

        } catch (InputMismatchException exception) {
            System.out.println("Se ingreso un tipo de dato incorrecto ");
        } catch (ArithmeticException exception) {
            System.err.println("Se intento dividir por cero ");
        }
        finally {
            System.out.println("Ha finalizado el ejemplo ");
        }*/
        try {
            Fecha fecha = new Fecha(35, 11, 2023);
            System.out.println(fecha.toString());
        } catch (FechaException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
