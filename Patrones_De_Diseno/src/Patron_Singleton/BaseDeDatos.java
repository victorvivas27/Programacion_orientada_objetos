package Patron_Singleton;

public class BaseDeDatos {
    private static BaseDeDatos instance = new BaseDeDatos();
    private  BaseDeDatos(){

    }

    public static BaseDeDatos getInstance() {

        return instance;
    }
}
