package Patron_Composite;

public class Main {
    public static void main(String[] args) {
        DepartamentoFinanciero deptoFinanciero = new DepartamentoFinanciero();
        DepartamentoVentas deptoVentas = new DepartamentoVentas();
        DepartamentoComposite deptoComposite = new DepartamentoComposite(1,"Departamento MGI");
        deptoComposite.agregarDepartamento(deptoVentas);

        System.out.println("Nombre del departamento :" );


    }
}
