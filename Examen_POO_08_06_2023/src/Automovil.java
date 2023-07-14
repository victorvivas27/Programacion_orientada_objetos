public class Automovil extends Vehiculo{
    private Boolean aGas;
    private  Integer cilindradas;

    public Automovil(String patente, String marca, String fechaAdquicision,
                     Double cotizacionUSD, Boolean industriaNacional, Dueno dueno, Boolean aGas, Integer cilindradas) {
        super(patente, marca, fechaAdquicision, cotizacionUSD, industriaNacional, dueno);
        this.aGas = aGas;
        this.cilindradas = cilindradas;
    }

    @Override
    public Boolean esIndustriaNacional() {
if (getIndustriaNacional()){
        return true;
    }else {
    return false;
}
    }

    public Boolean esEconomico() {
        if (aGas || cilindradas < 1200) {
            return true;
        } else {
            return false;
        }

}



    public Integer getCilindradas() {
        return cilindradas;
    }
}
