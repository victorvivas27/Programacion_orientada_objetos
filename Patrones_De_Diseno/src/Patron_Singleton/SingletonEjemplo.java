package Patron_Singleton;

public class SingletonEjemplo {
    //Atributo con mismo nombre de la clase
    private  static  SingletonEjemplo instance= new
            SingletonEjemplo();
    //Contructores privados
    private SingletonEjemplo(){

    }

    public static SingletonEjemplo getInstance() {
        return instance;
    }
}
