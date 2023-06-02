public class Pato extends Animal{

    public Pato(String nombre, Double energia) {
        super(nombre, energia);
    }

    @Override
    public void hacerRuido() {
        System.out.println( "Cuak cuak");
    }
    public  void nadar (){
        System.out.println(" Estoy nadando");
    }
}
