package T8.A4;

import java.util.Objects;

public class Furgoneta extends Vehiculo{
    private double longitudCaja;

    public Furgoneta() {
    }

    public Furgoneta(double longitudCaja) {
        this.longitudCaja = longitudCaja;
    }

    public Furgoneta(String matricula, String marca, String modelo, double longitudCaja) {
        super(matricula, marca, modelo);
        this.longitudCaja = longitudCaja;
    }

    public double getLongitudCaja() {
        return longitudCaja;
    }

    public void setLongitudCaja(double longitudCaja) {
        this.longitudCaja = longitudCaja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Furgoneta furgoneta = (Furgoneta) o;
        return Double.compare(furgoneta.longitudCaja, longitudCaja) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), longitudCaja);
    }

    @Override
    public String toString() {
        return "Furgoneta{" +
                "longitudCaja=" + longitudCaja +
                "} " + super.toString();
    }

    public String imprimirVehiculo(){
        return "Matricula: "+getMatricula()+"\n"+"Marca: "+getMarca()+"\n"+"Modelo: "+getModelo();
    }
}
