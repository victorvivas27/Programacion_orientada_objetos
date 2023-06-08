
public class Main {
    public static void main(String[] args) {


        Alumno alumno1 = new Alumno("Juan", "Vivas", 237839);
        Examen parcial1 = new Parcial(alumno1,"Matematica","Matematica 1",4.0,4,4);
        Examen final1 = new Final(alumno1, "Matematica", "Matematica 1", 7.0, 8.0, "Tema Variables");
        System.out.println(final1.aprobado());
        System.out.println(((Parcial) parcial1).esRecuperable());


    }
}