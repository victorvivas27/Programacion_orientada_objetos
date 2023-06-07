
public class Main {
    public static void main(String[] args) {
        Animal animal = new Vaca("Lionel", 800.0, 567.0);
        animal = new Pato("Lucas", 900.0);

        animal.hacerRuido(); //Aquí se ve el Polimorfismo.

        ((Pato) animal).nadar();

        //Imprimo el objeto, previamente sobreescribo el toString para que me muestre las variables que yo les señale.
        System.out.println(animal);
        animal.comer(500.0);
        ((Vaca)animal).comer(89.9,89.0);

    }
}

    