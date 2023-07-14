package Patron_Factory_Method;


public class Main {
    public static void main(String[] args) {


        try {
            Gaseosa gaseosa1 = GaseosaFactory.construir("Coca");
            gaseosa1.abrir();
            Gaseosa gaseosa2 = GaseosaFactory.construir("Fanta");
            gaseosa2.abrir();
            Gaseosa gaseosa3 = GaseosaFactory.construir("Uva");
            gaseosa3.abrir();
        }catch(Exception e){
            System.out.println( "!!!! Exepction encontrada !!!: " + e);

        }

    }
}
