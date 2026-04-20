package proxy.b9;

public class Main {
    public static void main(String[] args) {

        Rezervare proxy = new ProxyRezervare(new RezervareRestaurant());

        proxy.rezerva(5);
        proxy.rezerva(2);
    }
}