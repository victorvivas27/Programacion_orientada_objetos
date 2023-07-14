package Tamagochi_Patron_State;

public class Hambriento implements TamagochiState{
    //SI ESTA HAMBRIENTO SE LE DA DE COMER PASA A FELIZ
    @Override
    public TamagochiState comer() {
        return new Feliz();
    }
    //SI ESTA HAMBRIENTO SE LE DA DE BEBER PASA A ESTAR TRISTE

    @Override
    public TamagochiState beber() {
        return new Triste();
    }
//SI ESTA HAMBRIENTO Y SES LE HACEN MIMOS SIN CAMBIO ALGUNO
    @Override
    public TamagochiState mimos() {
        return this;
    }
}
