package Patron_Factory_Method;

public class GaseosaFactory {
    public static  Gaseosa construir (String tipo){
        switch (tipo){
            case "Coca":
                return  new GaseosaCola();
            case  "Fanta":
                return  new GaseosaNaranja();

            default:
                System.out.println("Ups, no encontramos este objeto para construir ");
                return null;
        }
    }
}
