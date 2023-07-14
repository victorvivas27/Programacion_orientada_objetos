public class Fecha {
    private  int dia;
    private  int mes;
    private int ano;

    public Fecha(int dia, int mes, int ano) throws FechaException {
        if (dia<1 || dia>31)
            throw new FechaException(" Error en el dia");
        this.dia = dia;
         if(mes<1||mes>12)
        throw new FechaException(" Error en el mes  ");
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }
}
