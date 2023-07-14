public class Camion extends Vehiculo implements Comparable {

    private Integer cantidadEjes;
    private  Double capacidadCarga;

    public Camion(String patente, String marca, String fechaAdquicision, Double cotizacionUSD,
                  Boolean industriaNacional, Dueno dueno, Integer cantidadEjes, Double capacidadCarga) {
        super(patente, marca, fechaAdquicision, cotizacionUSD, industriaNacional, dueno);
        this.cantidadEjes = cantidadEjes;
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public Boolean esIndustriaNacional() {
        if (getIndustriaNacional()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int compareTo(Object obj) {
        Camion otroCamion  = (Camion) obj;
        if ( this.capacidadCarga > otroCamion.capacidadCarga){
            return  1;
        } else if (this.capacidadCarga < otroCamion.capacidadCarga) {
            return -1;

        }return 0;
    }

}
