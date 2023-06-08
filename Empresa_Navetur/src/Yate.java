public class Yate extends Embarcacion implements Comparable {
    private Integer cantidadCamarotes;


    public Yate(Integer cantidadCamarotes) {
        this.cantidadCamarotes = cantidadCamarotes;

    }

    /*Sobreescribimos el método compareTo que nos obliga la interface Comparable de Java*/
    @Override
    public int compareTo(Object obj) {
        Yate yate = (Yate) obj;
        if (this.cantidadCamarotes > yate.cantidadCamarotes) {
            return 1;
        } else if (this.cantidadCamarotes < yate.cantidadCamarotes) {
            return -1;

        }
        return 0;
    }

    @Override
    public Double calcularMontoAlquiler() {
        Double montoAlquiler = getPrecioBase();
        if (getAnoFabricacion() > 2020) {
            montoAlquiler += getValorAdicional();
        }
        return montoAlquiler;
    }


}
