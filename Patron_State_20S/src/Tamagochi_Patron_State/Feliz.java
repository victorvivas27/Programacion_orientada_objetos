package Tamagochi_Patron_State;

public class Feliz implements TamagochiState{
    //SI ESTA FELIZ Y SE LE DA DE COMER SE PONE SEDIENTO
    @Override
    public TamagochiState comer() {
        return new Sediento();
    }
    //SI ESTA FELIZ Y SE LE DA DE BEBER SE PONE HAMBRIENTO

    @Override
    public TamagochiState beber() {
        return new Hambriento() ;
    }
    //SI ESTA FELIZ Y SE LE HACE MIMOS SIN CAMBIOS

    @Override
    public TamagochiState mimos() {
        return this;
    }
}
