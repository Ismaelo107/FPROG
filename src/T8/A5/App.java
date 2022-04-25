package T8.A5;

public class App {
    public static void main(String[] args) {

        //Vehiculo vehiculo1=new Vehiculo("BNX2222","Citroen","C3");
        Coche coche1=new Coche("BNX2223","Citroen","C4",5,5);
        Coche coche2=new Coche("BNX2224","Volvo","S60",5,5);

        //vehiculo1.imprimirVehiculo();
        coche1.imprimirVehiculo();
        coche2.imprimirVehiculo();

        Camion camion=new Camion("BNN3222", "Volvo", "ZZ", 10000, 12);
        camion.setModelo("BB");

        camion.imprimirVehiculo();

        Furgoneta furgoneta = new Furgoneta("BNX9999","Citroen","Berlingo",2);

        furgoneta.imprimirVehiculo();

        //vehiculo1.arrancar();

    }
}
