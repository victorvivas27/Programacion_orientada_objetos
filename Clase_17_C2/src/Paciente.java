

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws PacienteException {
        Date hoy = new Date();
        this.nombre = nombre;
        this.apellido = apellido;
        fechaAlta = null;
        if (fechaInternacion.after(hoy)) {
            throw new PacienteException("La fecha de internación no puede ser posterior al día de hoy");
        }
            this.fechaInternacion = fechaInternacion;
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws PacienteException{
        if (fechaAlta.after(fechaInternacion)) {
            throw new PacienteException("La fecha de alta no puede ser anterior a la fecha de internación");
        }
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", historiaClinica='" + historiaClinica + '\'' +
                ", fechaInternacion=" + fechaInternacion +
                ", fechaAlta=" + fechaAlta +
                '}';
    }
}
