package ejercicios;

public class Main {
    public static void main(String[] args){

//VARIABLES
        int num1 = 25;
        int num2 = 6;

        // Comprobar si el primer número es divisible por el segundo
        if (num1 % num2 == 0) {
            System.out.println(num1 + " es divisible por " + num2);
        } else {
            System.out.println(num1 + " no es divisible por " + num2);
        }
        String nombre= "Victor";
        int cantidad;
        char inicial;
        cantidad=nombre.length();
        nombre=nombre.toUpperCase();
        if (nombre.equals("VICTOR")) {
            System.out.println("Se paso a mayuscula" + " " + nombre);

        }
        inicial = nombre.charAt(1);
        Integer valor1=303;
        Integer valor2=303;
        int comparar;
        if ( valor1.equals(valor2))
            System.out.println("Son iguales");
        else {
            comparar=valor1.compareTo(valor2);
            if (comparar>0)
                System.out.println("valor1 es mayor que valor2");
            else
                System.out.println("valor2 es mayor que valor1");
        }


        for (int i = 1; i <= 5; i++) {
            System.out.println("Hola");
        }
    }
}