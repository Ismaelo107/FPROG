package T4.A6.E1;

import java.time.LocalDate;
import java.util.Objects;

public class Socio implements Comparable<Socio> {
    private String dni;
    private String nombre;
    private LocalDate fechaAlta;

    public Socio() {
    }

    public Socio(String dni, String nombre, LocalDate fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return Objects.equals(dni, socio.dni) && Objects.equals(nombre, socio.nombre) && Objects.equals(fechaAlta, socio.fechaAlta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, fechaAlta);
    }

    @Override
    public String toString() {
        return "Socio{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaAlta=" + fechaAlta +
                '}';
    }

    @Override
    public int compareTo(Socio o) {
        return o.getDni().compareTo(this.dni);
    }
}
