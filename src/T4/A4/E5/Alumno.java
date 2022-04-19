package T4.A4.E5;

public class Alumno {
    private String dni;
    private String nombre;
    private String apellidos;
    private String dir;

    public Alumno() {
    }

    public Alumno(String dni, String nombre, String apellidos, String dir) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
                ", apellidos='" + apellidos + '\'' +
                ", dir='" + dir + '\'' +
                '}';
    }
}
