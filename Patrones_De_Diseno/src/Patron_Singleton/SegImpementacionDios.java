package Patron_Singleton;

public class SegImpementacionDios {
    private  static  SegImpementacionDios intancia =new SegImpementacionDios();
    private SegImpementacionDios(){

    }

    public static SegImpementacionDios getIntancia() {
        return intancia;
    }
    public String pedire (String pedido){
        return " Tu pedido fue escuchado :" + pedido;
    }
}
