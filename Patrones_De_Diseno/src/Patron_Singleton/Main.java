package Patron_Singleton;

import Patron_Singleton.Dios;
import Patron_Singleton.SegImpementacionDios;

public class Main {
    public static void main(String[] args) {
SegImpementacionDios instancia = SegImpementacionDios.getIntancia();
String pedido = "Pizza";
String repuesta = instancia.pedire(pedido);
        System.out.println(repuesta);

        Dios instance= Dios.getInstance();
        String repuesta2 = instance.pedir(null);
        System.out.println( repuesta2);

    }

    }
