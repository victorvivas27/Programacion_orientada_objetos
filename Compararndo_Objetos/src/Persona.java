public class Persona implements Comparable {
    private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }

    public void decirEdad() {
        System.out.println(this.edad);
    }

    @Override
    public int compareTo(Object o) {
        /*return this.edad - ((Persona) o).getEdad();*/
        Persona p = (Persona)o;
        if ( this.edad < p.getEdad()){
            return  1;
        } else if (this.edad>p.getEdad()) {
            return -1;

        }
        return 0;
    }

    public int getEdad() {
        return this.edad;
    }

}
