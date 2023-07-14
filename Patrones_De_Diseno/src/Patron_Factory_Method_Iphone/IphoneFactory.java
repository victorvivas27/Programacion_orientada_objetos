package Patron_Factory_Method_Iphone;

public class IphoneFactory {
    public static Iphone contruir (String modelo){
        switch (modelo){
            case "IphoneX":
                return new IphonX();
            case "Iphone11":
                return new Iphone11();
            default:
                System.out.println(" No hay de  ese modelo ");
                return null;
        }
    }
}
