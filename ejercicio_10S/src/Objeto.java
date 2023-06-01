public abstract class Objeto {
    private int posx;
    private  int posy;
    private char direccion;

    public Objeto(int x, int y, char direccion) {
        this.posx = x;
        this.posy = y;
        this.direccion = direccion;
    }
    public  void girar (char nuevaDireccion ){
        this.direccion= nuevaDireccion;
    }

    public char getDireccion() {
        return direccion;
    }
}
