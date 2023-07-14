public class Parcial extends Examen {
    private Integer unidades;
    private Integer cantidadReintentos;

    public Parcial(Alumno alumno, String titulo, String enunciado, Double nota,
                   Integer unidades, Integer cantidadReintentos) {
        super(alumno, titulo, enunciado, nota);
        this.unidades = unidades;
        this.cantidadReintentos = cantidadReintentos;
    }

    @Override
    public Boolean aprobado() {

        return getNota() >= 4;
    }

    public boolean esRecuperable() {
        Boolean recuperable = false;
        if (aprobado()) {
            recuperable = false;
        } else if (unidades <= 3 && cantidadReintentos <= 3) {
            recuperable = true;
        } else if (unidades > 3 && cantidadReintentos > 2) {
            recuperable = true;
        }
            return recuperable;
        }
    }








