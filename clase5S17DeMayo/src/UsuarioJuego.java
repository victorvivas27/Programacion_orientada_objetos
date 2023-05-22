public class UsuarioJuego {
    //ATRIBUTOS USUARIO DE JUEGO
    private String nombre;
    private String clave;
    private double puntaje;
    private Integer nivel;
//CONTRUCTOR CLASE USUARIO JUEGO
    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0.0;
        this.nivel = 0;
    }

    // Método para aumentar el puntaje
    public void aumentarPuntaje() {
        this.puntaje++;
    }

    // Método para subir de nivel
    public void subirNivel() {
        this.nivel++;
    }

    // Método para recibir un bonus
    public void bonus(int valor) {

        this.puntaje += valor;
    }

    // Getters y setters
    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getClave() {

        return clave;
    }


    public double getPuntaje() {

        return puntaje;
    }

    public void setPuntaje(double puntaje) {

        this.puntaje = puntaje;
    }

    public int getNivel() {

        return nivel;
    }

    public void setNivel(int nivel) {

        this.nivel = nivel;
    }
}
