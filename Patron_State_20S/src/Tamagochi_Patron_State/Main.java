package Tamagochi_Patron_State;

public class Main {
    public static void main(String[] args) {
        Tamagochi tamagochi = new Tamagochi();
        tamagochi.darBeber();
        System.out.println(tamagochi);
        tamagochi.darComer();
        System.out.println(tamagochi);
        tamagochi.darMimo();
        System.out.println(tamagochi);
        tamagochi.darBeber();
        System.out.println(tamagochi);

    }
}
