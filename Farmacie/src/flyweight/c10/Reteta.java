package flyweight.c10;

public class Reteta {

    private int nrReteta;
    private float suma;

    public Reteta(int nrReteta, float suma) {
        this.nrReteta = nrReteta;
        this.suma = suma;
    }

    public void afisareReteta(Client client) {
        client.afisareClient();
        System.out.println("Reteta: " + nrReteta + " | Suma: " + suma);
    }
}