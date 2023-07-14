import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estacion buenosAires = new Estacion("Buenos Aires");
        Estacion lujan = new Estacion("LujÃ¡n");
        Estacion mercedes = new Estacion("Mercedes");
        Estacion suipacha = new Estacion("Suipacha");
        Estacion chivilcoy = new Estacion("Chivilcoy");
        Estacion alberti = new Estacion("Alberti");
        Estacion bragado = new Estacion("Bragado");
        System.out.println(alberti);
        Estacion santiago = new Estacion("Santiago");
        System.out.println(santiago);
        List<String> estaciones = new ArrayList();
        estaciones.add("Buenos Aires");

        estaciones.add("lujan");
        estaciones.add("mercedes");
        estaciones.add("suipacha");
        estaciones.add("chivilcoy");
        estaciones.add("alberti");
        estaciones.add("bragado");
        estaciones.add(3, "Santiago");
        System.out.println(estaciones);
        Trayecto trayecto = new Trayecto(buenosAires, bragado);
        System.out.println(trayecto);
    }
}