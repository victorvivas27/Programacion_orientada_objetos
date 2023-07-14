package Patron_Factory_Method_Iphone;

public  abstract class Iphone {
    private String nombre;

    public String getNombre() {
        return nombre;
    }
    public void adquirir(){
        System.out.println( "Compre un nuevo " + getNombre() + " Para mi Mujer ");

    }
}
