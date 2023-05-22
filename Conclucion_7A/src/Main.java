
public class Main {
    public static void main(String[] args) {
        Chofer chofer,chofer1;
        Auto autoUber=new Auto("NGH675","Geely","Azcarra");
        chofer=new Chofer("Juan","Vivas",new Auto("XYZ345","Ford","EcoSport"));
        chofer1=new Chofer("Yani","Juarez",autoUber);
        System.out.println(chofer.verPatente());
        System.out.println(chofer.verModelo());
        System.out.println(chofer.verMarca());
        System.out.println(chofer1.verMarca());
    }
}