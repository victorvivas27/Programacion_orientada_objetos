package Patron_Composite_Comprable;

import java.util.ArrayList;
import java.util.List;

public class Combo implements  Comprable{
    private List<Comprable>comprableList;
    public Combo(){
        comprableList = new ArrayList<>();

    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (Comprable comprable : comprableList) {
            precioTotal += comprable.calcularPrecio();

        }
        return precioTotal;
    }
    public void agregarComprable(Comprable comprable) {
        comprableList.add(comprable);
    }


}
