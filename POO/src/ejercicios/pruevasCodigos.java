package ejercicios;
import java.util.Date;
import java.util.Scanner;
public class pruevasCodigos {
    public static void main(String[] args) {
        Date fecha =  new Date ();
        System.out.println(fecha.toString());
        String nombre="Juan";
        String nombre2="Juan";
        System.out.println(nombre.equals(nombre2));
        Integer a= 2;
        Integer b=20;
        int comparar;
        if (a.equals(b))
            System.out.println("Los valores son iguales");
        else
        {
            comparar=a.compareTo(b);
            if (comparar>0)
            System.out.println("a es mayor que b");
            else
                System.out.println( "b es mayor que a");

            }

        System.out.println(a.compareTo(b));

        System.out.println(esDivisible(15, 14));
        Scanner sacaner=new Scanner(System.in);
        String nombr;
        int edad ;
        float altura;
        System.out.println("Ingrese su nombre");
        nombr= sacaner.nextLine();
        System.out.println(" Ingrese su edad");
        edad =sacaner.nextInt();
        System.out.println("Ingrese su altura");
        altura=sacaner.nextFloat();
        System.out.println( "Hola"+nombr+" Tu edad es de "+edad+" y mides "+altura);
        }


    public static Boolean esDivisible(int a, int b) {
        if (a % b == 0) {
            return true;
        } else {
            return false;
        }
    }
}
