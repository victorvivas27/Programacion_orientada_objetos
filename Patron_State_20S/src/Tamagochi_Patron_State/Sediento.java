package Tamagochi_Patron_State;

public class Sediento implements  TamagochiState{
    //SI ESTA SEDIENTO SE LE DA DE COMER PASA A ESTAR TRISTE
    @Override
    public TamagochiState comer() {
        return new Triste();
    }
//SI ESTA SEDIENTO SE LE DA DE BEBER PASA A ESTAR FELIZ
    @Override
    public TamagochiState beber() {
        return new Feliz();
    }
//SI ESTA SEDIENTO Y SE LE HACE MIMOS  SIN CAMBIO ALGUNO 
    @Override
    public TamagochiState mimos() {
        return this;
    }
}
