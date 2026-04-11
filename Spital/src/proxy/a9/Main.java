package proxy.a9;

public class Main {
    public static void main(String[] args) {

        Pacient p1 = new Pacient("Ion", true);
        Pacient p2 = new Pacient("Maria", false);

        Internare proxy = new ProxyInternare(new Spital());

        proxy.interneaza(p1);
        proxy.interneaza(p2);
    }
}