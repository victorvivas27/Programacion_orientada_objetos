package clase_07_C2;



public class Paseador {
    private String nombre;

    public Paseador(String nombre){
        this.nombre=nombre;
    }
    public void paseaUnPerro(Perro perro){
        System.out.println("El paseador " +nombre+ " pasea a "+perro.getApodo());  //imprime el mensaje de lo que paso al paseador.
    }
}
