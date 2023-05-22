public class Impresora {
    private String modelo;
    private String tipoconexion;
    private  Integer FechaFabricacion;
    private Integer cantidadHoja;

    public Impresora(String modelo, String tipoconexion, Integer fechaFabricacion) {
        this.modelo = modelo;
        this.tipoconexion = tipoconexion;
        this.FechaFabricacion = fechaFabricacion;
        this.cantidadHoja=2;
    }

    public Impresora(String modelo, String tipoconexion, Integer fechaFabricacion, Integer cantidadHoja) {
        this.modelo = modelo;
        this.tipoconexion = tipoconexion;
        this.FechaFabricacion = fechaFabricacion;
        this.cantidadHoja = cantidadHoja;
    }
    public void imprimir(String textoImprimir){
        if (hayHojas()){
            System.out.println(textoImprimir);
            cantidadHoja--;
        }else {
            System.out.println("Hey !!! carga hojas");
        }
    }

        // A propósito creamos un método privado ya que solo la clase lo va a necesitar.
        // Esto es muy util hacerlo cuando hay una lógica que se repite y no queremos repetir código
        // Directamente llamamos al método que realiza esa lógica.
        private Boolean hayHojas(){
            return cantidadHoja>0;
        }
}
