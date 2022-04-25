package T8.A2;

public class App {
    public static void main(String[] args) {

        Cola c1 = new Cola();

        c1.encolar(1);
        c1.encolar(2);
        c1.encolar(3);

        System.out.println(c1.desencolar());
        System.out.println(c1.desencolar());
        System.out.println(c1.desencolar());
        System.out.println(c1.desencolar());
    }
}
