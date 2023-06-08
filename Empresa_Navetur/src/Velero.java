public class Velero extends Embarcacion {
    private Integer cantidadMastiles;
    public static final int CANT_MASTILES_VELERO_GRANDE = 4;

    public int getCantMastiles() {
        return cantidadMastiles;
    }

    public void setCantMastiles(Integer cantidadMastiles) {
        this.cantidadMastiles = cantidadMastiles;
    }


    public boolean esGrande()
    {
        return this.getCantMastiles() > CANT_MASTILES_VELERO_GRANDE;
    }


}

