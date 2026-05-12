package observer.b12;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Observer c1 = new Client("Ana");
        Observer c2 = new Client("Eva");

        restaurant.adaugaClient(c1);
        restaurant.adaugaClient(c2);

        restaurant.notificaClient("Avem oferta 1+1 gratis");
    }
}
