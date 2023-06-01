public class Nave  extends Objeto{
    private double velocidad;
    private int vida;

    public Nave(int x, int y, char direccion, double velocidad ) {
        super(x, y, direccion);
        this.velocidad = velocidad;
        this.vida=100;

    }
    public void irA(int x, int y, char direccion) {
        if (this.getDireccion()!= direccion) {
            girar(direccion);
        }
        this.irA(x, y, direccion);
    }
    public void restaVida(int valor) {
        vida -= valor;
    }

}
