package builder.b2;

public class RezervareBuilder {

    private String numeClient;
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaPersonalizata;

    public RezervareBuilder(String numeClient) {
        this.numeClient = numeClient;
        this.asezareGeam = false;
        this.scauneErgonomice = false;
        this.decorareMasa = false;
        this.muzicaPersonalizata = false;
    }

    public void setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    public void setMuzicaPersonalizata(boolean muzicaPersonalizata) {
        this.muzicaPersonalizata = muzicaPersonalizata;
    }

    public Rezervare build() {
        return new Rezervare(numeClient, asezareGeam,
                scauneErgonomice, decorareMasa,
                muzicaPersonalizata);
    }
}