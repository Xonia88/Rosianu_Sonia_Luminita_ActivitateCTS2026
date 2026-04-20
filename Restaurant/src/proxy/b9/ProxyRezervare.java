package proxy.b9;

public class ProxyRezervare implements Rezervare {

    private RezervareRestaurant rezervare;

    public ProxyRezervare(RezervareRestaurant rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(int nrPersoane) {

        if (nrPersoane >= 4) {
            rezervare.rezerva(nrPersoane);
        } else {
            System.out.println("Rezervarea nu este permisa pentru mai putin de 4 persoane.");
        }
    }
}