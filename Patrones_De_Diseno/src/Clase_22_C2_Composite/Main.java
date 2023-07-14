package Clase_22_C2_Composite;

public class Main {
    public static void main(String[] args) {
        //INTANCIAMOS LOS PRODUCTOS
        Producto hamburgeza = new Producto("Hamburgeza",10.0);
        Producto papasFritas = new Producto("Papas Fitas",4.0);
        Producto gaseosa = new Producto("Gaseosa",2.0);
        Producto helado = new Producto("Helado",2.0);
        //INSTANCIAMOS CARRITO PARA AGREGAR PRODUCTOS Y COMBOS
        Carrito carrito = new Carrito();
        //INSTANCIAMOS LOS COMBOS
        Combo combo1 = new Combo(0.10);
        combo1.agregarComprable(hamburgeza);
        combo1.agregarComprable(papasFritas);
        combo1.agregarComprable(gaseosa);
        Combo comboPareja = new Combo(0.20);
        comboPareja.agregarComprable(combo1);
        comboPareja.agregarComprable(gaseosa);
        //AGREGAMOS COMBOS Y PRODUCTOS AL CARRITO
        carrito.agregarComprable(combo1);
        carrito.agregarComprable(comboPareja);
        carrito.agregarComprable(hamburgeza);

//AQUI CALCULAMOS EL PRECIO TOTAL DEL CARRITO
        System.out.println(carrito.calcularCarrito());
    }
}
