package Patron_Composite_Tren;

import java.util.ArrayList;
import java.util.List;

public class ElementoComposite implements  Figura{
    private List<Figura>figuraList;
    ElementoComposite(){
        figuraList = new ArrayList<>();

    }
    public  void agregarFigura(Figura figura){
        figuraList.add(figura);
    }
    public  void removerFigura( Figura figura){
        figuraList.remove(figura);
    }

    @Override
    public Double calcularArea() {
        Double areaTotal = 0.0;
        for (Figura figura : figuraList) {
            areaTotal += figura.calcularArea();

        }
        return areaTotal;
    }
}
