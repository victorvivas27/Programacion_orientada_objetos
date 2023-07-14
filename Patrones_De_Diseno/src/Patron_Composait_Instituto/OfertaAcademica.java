package Patron_Composait_Instituto;

import java.util.ArrayList;
import java.util.List;

public class OfertaAcademica {
    private List<Cursable>cursableList;
    public OfertaAcademica(){
        cursableList = new ArrayList<>();
    }
    public  void agregarCursable(Cursable cursable){
        cursableList.add(cursable);
    }
    public Double calcularOfertaAcademica(){
        Double precioTotal = 0.0;
        for (Cursable cursable : cursableList) {
            precioTotal+= cursable.calcularPrecio();

        }
        return precioTotal;
    }
}
