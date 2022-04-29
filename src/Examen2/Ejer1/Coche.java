package Examen2.Ejer1;

import java.util.Objects;

public class Coche {
    private String matricula;
    private String modelo;
    private Float pvp;
    private String fechaVenta;


    public Coche() {
    }

    public Coche(String matricula, String modelo, Float pvp, String fechaVenta) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.pvp = pvp;
        this.fechaVenta = fechaVenta;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getPvp() {
        return pvp;
    }

    public void setPvp(Float pvp) {
        this.pvp = pvp;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(matricula, coche.matricula) && Objects.equals(modelo, coche.modelo) && Objects.equals(pvp, coche.pvp) && Objects.equals(fechaVenta, coche.fechaVenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, modelo, pvp, fechaVenta);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", pvp=" + pvp +
                ", fechaVenta='" + fechaVenta + '\'' +
                '}';
    }
}
