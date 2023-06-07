public class Vaca extends Animal {
    private Double peso;

    public Vaca(String nombre, Double energia, Double peso) {
        super(nombre, energia);
        this.peso = peso;
    }

    @Override
    public void hacerRuido() {
        System.out.println(" Muuuuuuuuuu");
    }

    @Override
    public void comer(Double unidadComida) {
        super.comer(unidadComida);
        peso += unidadComida / 2;


    }
    public void comer(Double unidadComida,Double comidaExtra) {
        super.comer(unidadComida + comidaExtra);
        peso += unidadComida / 2;


    }


    @Override
    public String toString() {
        return super.toString() + " El peso de este animal es : " + peso;
    }

}
