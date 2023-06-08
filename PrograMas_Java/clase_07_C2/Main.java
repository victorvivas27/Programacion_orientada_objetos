package clase_07_C2;

public class Main {
    public static void main(String[] args) {
        Perro perro =new Perro("Tornado");
        Persona persona=new Persona("Victor", perro);
        Paseador paseador=new Paseador("Juan");
        persona.pasearConSuPerro();
        paseador.paseaUnPerro(perro);
        perro.ladrar();
    
}
    
}
