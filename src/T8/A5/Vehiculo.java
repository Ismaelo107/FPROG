package T8.A5;

import java.util.Objects;

public abstract class Vehiculo implements IVehiculos{
    private String matricula;
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String imprimirVehiculo(){
        return "Matricula: "+matricula+"\n"+"Marca: "+marca+"\n"+"Modelo: "+modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(matricula, vehiculo.matricula) && Objects.equals(marca, vehiculo.marca) && Objects.equals(modelo, vehiculo.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, marca, modelo);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public String arrancar() {
       return "Arrancar";
    }

    @Override
    public String parar() {
        return "Parar";
    }

    @Override
    public String frenar() {
        return "Frenar";
    }

    @Override
    public String acelerar() {
        return "Acelerar";
    }
}
