package T8.A5;

import java.util.Objects;

public class Coche extends Vehiculo {
    private int plazas;
    private int puertas;

    public Coche() {
    }

    public Coche(int plazas, int puertas) {
        this.plazas = plazas;
        this.puertas = puertas;
    }

    public Coche(String matricula, String marca, String modelo, int plazas, int puertas) {
        super(matricula, marca, modelo);
        this.plazas = plazas;
        this.puertas = puertas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coche coche = (Coche) o;
        return plazas == coche.plazas && puertas == coche.puertas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plazas, puertas);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "plazas=" + plazas +
                ", puertas=" + puertas +
                "} " + super.toString();
    }

    public String imprimirVehiculo(){
        return "Matricula: "+getMatricula()+"\n"+"Marca: "+getMarca()+"\n"+"Modelo: "+getModelo();
    }
}
