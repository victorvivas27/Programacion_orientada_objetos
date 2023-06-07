public abstract class Animal {
    private  String nombre;
    private  Double energia;

    public Animal(String nombre, Double energia) {
        this.nombre = nombre;
        this.energia = energia;
    }
    public abstract void hacerRuido();
    public void comer(Double unidadComida){
        energia += unidadComida;

    }

    @Override
    public String toString() {
        return "El animal se llama "+ nombre + " Y tiene de " + energia + " de energia " ;
    }
}
