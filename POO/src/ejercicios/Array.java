package ejercicios;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] nombres = new String[7];
        nombres = new String[] { "Victor","yanina","carlos","pedro","juan","Dario","Claudio","Oscar", };

        System.out.println("Recorriendo el array con for");
        //BUCLE FOR
        for (int i = 0; i < nombres.length; i++)
            System.out.println(nombres[i]);
        System.out.println("Recorriendo el array con while");
        //BUCLE WHILE
        int i =0;
                while(i < nombres.length){
                    System.out.println(nombres[i]);
                    i++;
                }
        System.out.println("Recorriendo el array con for each");
                //BUCLE FOR EACH
        for (String nombre:nombres)
            System.out.println(nombre);
            

    }
}
