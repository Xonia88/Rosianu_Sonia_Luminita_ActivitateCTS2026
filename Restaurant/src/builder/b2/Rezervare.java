package builder.b2;

public class Rezervare {

    private String numeClient;
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaPersonalizata;

    public Rezervare(String numeClient, boolean asezareGeam,
                     boolean scauneErgonomice, boolean decorareMasa,
                     boolean muzicaPersonalizata) {
        this.numeClient = numeClient;
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorareMasa = decorareMasa;
        this.muzicaPersonalizata = muzicaPersonalizata;
    }

    @Override
    public String toString() {
        return "Rezervare: " + numeClient +
                " | Geam: " + asezareGeam +
                " | Scaune ergonomice: " + scauneErgonomice +
                " | Decor: " + decorareMasa +
                " | Muzica: " + muzicaPersonalizata;
    }
}