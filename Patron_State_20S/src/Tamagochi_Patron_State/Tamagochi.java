package Tamagochi_Patron_State;

public class Tamagochi {
    private TamagochiState estadoActual;

    public Tamagochi() {

        this.estadoActual = new Feliz();
    }
    public void darComer(){

        estadoActual = estadoActual.comer();
    }public void darBeber(){
estadoActual=estadoActual.beber();
    }
    public void darMimo(){
        estadoActual=estadoActual.mimos();

    }

    @Override
    public String toString() {

        return estadoActual.toString();
    }
}
