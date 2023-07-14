package Patron_Composite;

public class DepartamentoFinanciero implements Departamento{
    private  Integer id;
    private  String nombre;

    public void getNombre(){
        System.out.println(getClass().getSimpleName());
    }
}

