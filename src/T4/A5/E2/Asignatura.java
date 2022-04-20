package T4.A5.E2;

import java.util.*;

public class Asignatura implements Comparable<Asignatura> {

    private String codigo;
    private String nombre;
    private String hora;

    public Asignatura() {
    }

    public Asignatura(String codigo, String nombre, String hora) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.hora = hora;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", hora='" + hora + '\'' +
                '}';

    }

    @Override
    public int compareTo(Asignatura o){
        return o.getCodigo().compareTo(this.codigo);
    }
}
