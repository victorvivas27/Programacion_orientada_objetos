package Tamagochi_Patron_State;

public class Triste implements  TamagochiState{
    //SI ESTA TRISTE SE LE DA DE COMER HACE 2 BEEP
    @Override
    public TamagochiState comer() {
        System.out.println("Beep beep");
        return this;
    }
//SI ESTA TRISTE SE LE DA DE BEBER HACE 3 BEEP
    @Override
    public TamagochiState beber() {
        System.out.println("Beep beep beep");
        return this;
    }
    //SI ESTA TRISTE Y SE LE DA MIMOS PASA A ESTAR FELIZ

    @Override
    public TamagochiState mimos() {
        return new Feliz();
    }
}
