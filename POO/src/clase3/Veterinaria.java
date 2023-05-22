package clase3;

import java.util.Scanner;//METODO SCANNER SE IMPORTA PARA PODER UASARLA

public class Veterinaria { //DEFINICION DE CLASE :MODELO O PLANILLA PARA CREAR OBJETOS
    public static void main(String[] args) {//FUNCION PRINCIPAL
        // SATATIC INDICA QUE LA FUNCION PERTENECE A LA CLASE QUE ESE ENCUENTRA

        Scanner scanner = new Scanner(System.in);
        //AQUI INGRESA EL NOMBRE DEL PERRO
        System.out.println("Ingrese el nombre del perro:");
        String nombre = scanner.nextLine();
        //AQUI INGRESAMOS LA CANTIDAD TOTAL QUE COME POR DIA LA MASCOTA
        System.out.println("Ingrese la cantidad Maxima de comida que come la mascota:");
        double comidadCome = scanner.nextDouble();
//AQUI USO LA FUNCION GENERADA MAS ABAJO
        Integer totalPaquetes = cuantosPaquetes(comidadCome);
        System.out.println(nombre + " necesito " + totalPaquetes + " paquetes.");
    }

    //FUNCION GENERADA PARA CONTAR LOS PAQUETES SE ENTREGADOS PARA LLEGAR ALA CANTIDAD DE COMIDA TOTAL
    public static Integer cuantosPaquetes(double cantidadComidaMaxima) {
        Scanner scanner = new Scanner(System.in);
        Integer paquetesTotales = 0;
        double comidaEntregada = 0.0;
        while (cantidadComidaMaxima > comidaEntregada) {
            System.out.println("Ingrese el peso del paquete:");
            double pesoPaquete = scanner.nextDouble();
            comidaEntregada += pesoPaquete;
            paquetesTotales++;
        }

        return paquetesTotales;
    }
}