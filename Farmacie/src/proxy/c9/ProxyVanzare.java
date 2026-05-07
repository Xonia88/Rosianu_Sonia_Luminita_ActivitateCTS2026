package proxy.c9;

public class ProxyVanzare implements Vanzare {

    private Farmacie farmacie;

    public ProxyVanzare(Farmacie farmacie) {
        this.farmacie = farmacie;
    }

    @Override
    public void vinde(boolean areReteta) {

        if (areReteta) {
            farmacie.vinde(true);
        } else {
            System.out.println("Nu se pot vinde medicamente fara reteta.");
        }
    }
}