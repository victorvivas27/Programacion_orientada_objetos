public class Parcial extends Examen {
    private Integer unidades;
    private Integer cantidadDeIntentos;

    public Parcial(Alumno alumno, String titulo, String enunciado, Double nota, Integer unidades, Integer cantidadDeintentos) {
        super(alumno, titulo, enunciado, nota);
        this.unidades = unidades;
        this.cantidadDeIntentos = cantidadDeIntentos;
    }

    @Override
    public Boolean aprobado() {
        return getNota() >= 4;
    }

    public boolean esRecuperable() {
        if (aprobado()) {
            return false;
        } else if (unidades <= 3 && cantidadDeIntentos < 3) {
            return true;
        } else if (unidades > 3 && cantidadDeIntentos > 2) {
            return true;
        } else {
            return false;
        }
    }
}






