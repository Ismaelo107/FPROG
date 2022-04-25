package T8.A3;

public class App {
    public static void main(String[] args) {

        Pila c1 = new Pila();

        c1.push(1);
        c1.push(2);
        c1.push(3);

        System.out.println(c1.pop());
        System.out.println(c1.pop());
        System.out.println(c1.pop());
        System.out.println(c1.pop());
    }
}
