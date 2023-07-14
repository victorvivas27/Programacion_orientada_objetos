package Patron_Composait_Instituto;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntencivo implements  Cursable{
    private List<Cursable>cursableList;
    private String nombre;
    private String descripcion;
    private  Double descuento;

    public ProgramaIntencivo(String nombre, String descripcion, Double descuento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.descuento = descuento;
        cursableList = new ArrayList<>();
    }
    public void agregarCursable(Cursable cursable){
        cursableList.add(cursable);
    }

    @Override
    public Double calcularPrecio() {
        Double sumarPrograma = 0.0;
        for (Cursable cursable : cursableList) {
            sumarPrograma+= cursable.calcularPrecio();

        }
        return sumarPrograma - sumarPrograma * descuento;
    }
}
