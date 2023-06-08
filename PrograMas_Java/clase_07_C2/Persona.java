package clase_07_C2;

public class Persona {
    private String nombre;
    private Perro perro;
    public Persona(String nombre,Perro perro){
        this.nombre=nombre;
        this.perro=perro;
    }
    
    public void pasearConSuPerro(){
        System.out.println(nombre + " Esta paseando con su perrito  " + perro.getApodo());
    }
}
