
public class Main {
    public static void main(String[] args) {
        Persona juan = new Persona(14);
        Persona  pedro  = new Persona(16);
        if (juan.compareTo(pedro) > 0) {
            System.out.println("Pedro es mayor a Juan ");

        } else if (juan.compareTo(pedro) < 0) {
            System.out.println(" Pedro es menor a Juan ");

        } else {
            System.out.println( " Pedro y Juan  Tienen la misma edad ");
        }


    }
}