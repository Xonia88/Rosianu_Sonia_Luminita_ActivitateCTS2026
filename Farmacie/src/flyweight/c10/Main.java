package flyweight.c10;

public class Main {
    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        Client c1 = factory.getClient("Ion", "123");
        Client c2 = factory.getClient("Ion", "123"); // reutilizat

        Reteta r1 = new Reteta(1, 100);
        Reteta r2 = new Reteta(2, 200);

        r1.afisareReteta(c1);
        System.out.println("---------------");
        r2.afisareReteta(c2);
    }
}