package flyweight.a10;

public class Main {
    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        Pacient p1 = factory.getPacient("Ion", 30);
        Pacient p2 = factory.getPacient("Ion", 30);

        Consultatie c1 = new Consultatie("10.01.2025");
        Consultatie c2 = new Consultatie("15.01.2025");

        c1.afisare(p1);
        System.out.println("---------------");
        c2.afisare(p2);
    }
}