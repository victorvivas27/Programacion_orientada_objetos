public class Main {
    public static void main(String[] args) {
        Perro perro =new Perro("Chow Chow",2013,5.1,"Tornado",false,true,false);
        Perro perro1=new Perro("Pequines",2014,10.0,"Travieso",true,false,
                true,true,"Pequeño");
        System.out.println(perro.aptoAdopcionExtranjero());
        System.out.println(perro.calcularEdad(perro.getAnoNacimiento()));
        System.out.println(perro1.aptoAdopcionExtranjero());
        System.out.println(perro1.calcularEdad(perro1.getAnoNacimiento()));
    }

}