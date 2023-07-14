package Patron_Observer_Seguidor;

public class Test_Seguidor {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Victor","Vivas");
        usuario.agregar(new Seguidor("Hernesto","Pepino"));
        usuario.agregar(new Seguidor("Fernandes","Pele"));
        usuario.agregar(new Seguidor("Agustin","Lean"));
        usuario.agregar(new Seguidor("Theo","Juarez"));
        usuario.subirFoto();
        usuario.subirFoto();
        usuario.subirFoto();
        usuario.subirFoto();


    }
}
