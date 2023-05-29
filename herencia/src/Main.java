import empresa.EmpleadoMarketing;
import empresa.EmpleadoProduccion;

public class Main {
    public static void main(String[] args) {
        EmpleadoMarketing empleado1 = new EmpleadoMarketing("Victor","Vivas","37823948","Redes Sociales");
        EmpleadoProduccion empleado2 = new EmpleadoProduccion("Juan","Coang","6734893",25);

empleado1.trabajar();
empleado1.trabajar(4);
empleado2.trabajar();

    }
}