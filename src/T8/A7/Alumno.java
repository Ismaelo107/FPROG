package T8.A7;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
    private String dni;
    private String nombre;
    private String dir;

    public Alumno() {
    }

    public Alumno(String dni, String nombre, String dir) {
        this.dni = dni;
        this.nombre = nombre;
        this.dir = dir;
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

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dir='" + dir + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(dni, alumno.dni) && Objects.equals(nombre, alumno.nombre) && Objects.equals(dir, alumno.dir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, dir);
    }

    @Override
    public int compareTo(Alumno a) {
        return this.nombre.compareTo(a.nombre);
    }

}
