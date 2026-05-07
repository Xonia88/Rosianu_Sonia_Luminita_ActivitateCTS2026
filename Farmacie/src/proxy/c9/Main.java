package proxy.c9;

public class Main {
    public static void main(String[] args) {

        Vanzare proxy = new ProxyVanzare(new Farmacie());

        proxy.vinde(true);
        proxy.vinde(false);
    }
}