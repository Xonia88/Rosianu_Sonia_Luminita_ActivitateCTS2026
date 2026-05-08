package flyweight.b10;

public class Main {
    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        Client c1 = factory.getClient("Maria", "0711111111");
        Client c2 = factory.getClient("Maria", "0711111111");

        Rezervare r1 = new Rezervare(1, 2);
        Rezervare r2 = new Rezervare(5, 4);

        r1.afisare(c1);
        System.out.println("---------------");
        r2.afisare(c2);
    }
}