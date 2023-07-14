package Patron_Sate;

public class Parado implements  StateAuto{
    private Auto v;


    // Constructor que inyecta la dependencia

    public Parado(Auto v)  {
        this.v = v;
    }
    @Override
    public void frenar()  {
        // No ocurre nada. Si ya se encuentra detenido, no habrá efecto alguno
        System.out.println("ERROR: El auto ya se encuentra detenido");

    }
    @Override
    public void contacto() {
        // El auto se apaga         estado = APAGADO;
        v.setEstado(new Apagado(v));
        System.out.println("El auto se encuentra ahora APAGADO");

    }
    @Override
    public void acelerar() {
        // Comprobamos que el auto disponga de combustible
        if (v.getCombustibleActual() > 0) {
            // El auto se pone en marcha. Aumenta la velocidad y cambiamos de estado => EN_MARCHA;
            v.setEstado(new EnMarcha(v));
            System.out.println("El auto se encuentra ahora EN MARCHA");
            v.modificarVelocidad(10);
            v.modificarCombustible(-10);

        } else {
            //estado = SIN COMBUSTIBLE
            v.setEstado(new SinNafta(v));
            System.out.println("El auto se encuentra ahora SIN COMBUSTIBLE");

        }


    }
}
