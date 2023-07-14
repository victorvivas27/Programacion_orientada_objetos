package Patron_Composite;

public class DepartamentoVentas implements Departamento{
    private Integer id;
    private String nombre;

    @Override
    public void getNombre() {
        System.out.println(getClass().getSimpleName());
    }
}
