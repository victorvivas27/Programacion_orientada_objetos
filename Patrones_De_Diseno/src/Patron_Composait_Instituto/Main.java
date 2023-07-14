package Patron_Composait_Instituto;

public class Main {
    public static void main(String[] args) {
        //AQUI INICIALIZAMOS LOS CURSOS
        Curso curso1 = new Curso("Front End","De todo un poco",16,1000.0,2);
        Curso curso2 = new Curso("Back End","Tambien de todo un poco",20,900.0,2);
        //AQUI INICIALIZAMOS LAS OFERTA ACADEMICA  DONDE AGREGAMOS LOS CURSOS Y LOS COMBOS
        OfertaAcademica combo1 = new OfertaAcademica();
        //AQUI ARAMAMOS LOS COMBOS SOBLE LOS CURSOS
        ProgramaIntencivo programa1 = new ProgramaIntencivo("FullStack","Mas de todo",0.20);
        programa1.agregarCursable(curso1);
        programa1.agregarCursable(curso2);
        //AQUI AGREGAMSO EL CURSO O LA OFERTA ACADEMICA  QUE QUEREMOS REALIZAR
        combo1.agregarCursable(programa1);
        //AQUI VEMOS EL TOTAL DE NUESTRO CURSO A REALIZAR
        System.out.println("El valor del programa de estudio FullStack es de : " + combo1.calcularOfertaAcademica());

    }
}
