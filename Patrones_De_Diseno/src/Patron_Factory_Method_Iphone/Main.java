package Patron_Factory_Method_Iphone;

public class Main {
    public static void main(String[] args) {
        try {


            Iphone iphone1 = IphoneFactory.contruir("IphoneX");
            iphone1.adquirir();
            Iphone iphone2 = IphoneFactory.contruir("Iphone11");
            iphone2.adquirir();
            Iphone iphone3 = IphoneFactory.contruir("Iphone12");
            iphone3.adquirir();
        }catch (Exception e){
            System.out.println("!!!!Exepcion encontrada " + e);
        }
    }
}
