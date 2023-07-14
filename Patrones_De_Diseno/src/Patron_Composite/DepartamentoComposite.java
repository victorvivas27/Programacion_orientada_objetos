package Patron_Composite;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoComposite  implements Departamento{
    private  Integer id;
    private  String nombre;
    private List<Departamento> departamentoList;

    public DepartamentoComposite(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        departamentoList = new ArrayList<>();
    }
    public void getNombre(){
        for (Departamento departamento : departamentoList) {
            
        }

    }
    public void agregarDepartamento(Departamento departamento){
        departamentoList.add(departamento);
    }
    public  void  removerDepartamento(Departamento departamento){
        departamentoList.remove(departamento);

    }
}
