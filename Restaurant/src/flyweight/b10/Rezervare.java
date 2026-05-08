package flyweight.b10;

public class Rezervare {

    private int nrMasa;
    private int nrPersoane;

    public Rezervare(int nrMasa, int nrPersoane) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
    }

    public void afisare(Client client) {
        client.afisare();
        System.out.println("Masa: " + nrMasa + " | Persoane: " + nrPersoane);
    }
}