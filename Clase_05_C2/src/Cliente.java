public class Cliente {
    //ATRIBUTOS DE LA CLASE Cliente
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    //CREAR EL CONSTRUCTOR
    public Cliente(Integer numeroCliente, String nombre) {//: Aquí se definen los parámetros que recibe el constructor.
//Esto significa que cuando crees una instancia de la clase Cliente,
// necesitarás proporcionar un valor entero para numeroCliente y una cadena de texto para nombre.
        this.numeroCliente = numeroCliente;//: Esta línea asigna el valor del parámetro numeroCliente a
        // la variable numeroCliente del objeto actual.
        // El uso de this es necesario para referirse al miembro de la clase en lugar del parámetro local.
        this.nombre = nombre;
        this.deuda = 0.0;
    }
public void incrementarDeuda(Double valor){
    System.out.println("Tu deuda anterior es : "+ deuda);
        this.deuda+=valor;
    System.out.println("Tu deuda actual es :"+ deuda);
}
public void pagarDeuda(){
    System.out.println("Tu deuda anterior es:"+deuda);
        this.deuda=0.0;
    System.out.println("Ya no debes nada "+deuda);
}
    //METODOS GETTER Y SETTER
    public String getNombre() {//ESTO ES UN METODO getNombre
        return nombre;
    }

    public Integer getNumeroCliente() {//METODO getNumeroCliente getter nos permite retornar
        return numeroCliente;
    }

    public void setNombre(String nombre) { //METODO setNombre ,setter nos permite modificar
        this.nombre = nombre;
    }

    public Double getDeuda() {
        return deuda;
    }
}
