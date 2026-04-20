package proxy.b9;

public class RezervareRestaurant implements Rezervare {

    @Override
    public void rezerva(int nrPersoane) {
        System.out.println("Rezervare realizata pentru " + nrPersoane + " persoane");
    }
}