package Patron_Factory_Method;

public abstract class Gaseosa {
    private  String nombre;
    public  String getNombre(){
        return nombre;
    }
    public  void  abrir(){
        System.out.println("Abrir un refrescantr gaseosa de " + getNombre());
    }
}
