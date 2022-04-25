package T8.A4;

import java.util.Objects;

public class Camion extends Vehiculo{
    private double tonelaje;
    private double longitud;

    public Camion() {
    }

    public Camion(double tonelaje, double longitud) {
        this.tonelaje = tonelaje;
        this.longitud = longitud;
    }

    public Camion(String matricula, String marca, String modelo, double tonelaje, double longitud) {
        super(matricula, marca, modelo);
        this.tonelaje = tonelaje;
        this.longitud = longitud;
    }

    public double getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(double tonelaje) {
        this.tonelaje = tonelaje;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Camion camion = (Camion) o;
        return Double.compare(camion.tonelaje, tonelaje) == 0 && Double.compare(camion.longitud, longitud) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tonelaje, longitud);
    }

    @Override
    public String toString() {
        return "Camion{" +
                "tonelaje=" + tonelaje +
                ", longitud=" + longitud +
                "} " + super.toString();
    }

    public String imprimirVehiculo(){
        return "Matricula: "+getMatricula()+"\n"+"Marca: "+getMarca()+"\n"+"Modelo: "+getModelo();
    }
}
