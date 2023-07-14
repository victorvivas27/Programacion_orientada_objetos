public class Main {
    public static void main(String[] args) {
        Dueno dueno1 = new Dueno("Juan","Derqui","23-27.908233-98");
        Automovil auto1 = new Automovil("FFDS-456","Geeli","28/09/2023",
                5697.0,false,dueno1,false,1200);
        Camion camion1 = new Camion("DDDD-564","Scania","25/09/2020",
                5000.0,true,dueno1,8,3000.0);
        Camion camion2 = new Camion("YTR-788","Honda","09/08/2019",
                56494.0,true,dueno1,9,20199.0);
        System.out.println(camion1.compareTo(camion2));
        System.out.println(auto1.esEconomico());
        System.out.println(camion1.esIndustriaNacional());
        System.out.println(auto1.esIndustriaNacional());
    }
}
