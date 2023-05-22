package clase1;

public class definiendoMascotas {
    public static void main(String[] args) {
        String animal1="Perro";
        String animal2="Pez";
        String animal3="Gato";
        String animal4="Tortuga";
        String animal5="Ave";

        String nombre="Manchitas";
        String nombre2="Nemo";
        String nombre3="Silvestre";
        String nombre4="Manuelita";
        String nombre5="Gardel";

        String comoHaceElLadrido="Guau-Guau";
        String queSonidoHacenLasBurbujas="Glup-Glup";
        String comoSuenaElMaullido="Miau-Miau";
        String segunLaCancion="Pehuajó";
        String onomatopeyaDeSuCanto="Fiu-Fiuuu";

        int edadNemoYGardel=1;
        int edadSilvestre=3;
        int edadManuelita=12;
        int edadManchitas=2;

        int cuantoComeNemo=140;
        int cuantoComeSilvestre=500;
        int cuantoComeManuelita=300;
        int cuantoComeGardel=350;
        double cuantoComeManchitas=1.5;

        System.out.println(nombre + " tiene " + edadManchitas + " años y come " +cuantoComeManchitas + " Kilos");
        System.out.println(nombre + ", como es un " + animal1 + ", hace " + comoHaceElLadrido);
        System.out.println("***************************************************************************");
        System.out.println(nombre2 + " tiene " + edadNemoYGardel + " año y come "+cuantoComeNemo + " Gramos");
        System.out.println(nombre2 + ", como es un " + animal2 + ", hace " + queSonidoHacenLasBurbujas);
        System.out.println("***************************************************************************");
        System.out.println(nombre5 + " tiene " + edadNemoYGardel + " años y come " +cuantoComeGardel + " Gramos");
        System.out.println(nombre5 + ", como es un " + animal5 + ", hace " + onomatopeyaDeSuCanto);
        System.out.println("***************************************************************************");
        System.out.println(nombre3 + " tiene " + edadSilvestre + " años y come " + cuantoComeSilvestre + " Gramos");
        System.out.println(nombre3 + ", como es un " + animal3 + ", hace " + comoSuenaElMaullido);
        System.out.println("***************************************************************************");
        System.out.println(nombre4 + " tiene " + edadManuelita + " años y come " + cuantoComeManuelita + " Gramos");
        System.out.println(nombre4 + ", como es una " + animal4 + ", vive en " + segunLaCancion);

    }
}
