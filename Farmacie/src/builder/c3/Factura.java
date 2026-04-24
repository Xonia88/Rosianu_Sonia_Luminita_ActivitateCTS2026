package builder.c3;

public class Factura {

    private String numeClient;
    private int numarPungi;
    private boolean plataCuCard;
    private boolean cardFidelitate;
    private float cotaTVA;

    public Factura(String numeClient, int numarPungi,
                   boolean plataCuCard, boolean cardFidelitate,
                   float cotaTVA) {
        this.numeClient = numeClient;
        this.numarPungi = numarPungi;
        this.plataCuCard = plataCuCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        return "Factura: " + numeClient +
                " | Pungi: " + numarPungi +
                " | Plata card: " + plataCuCard +
                " | Card fidelitate: " + cardFidelitate +
                " | TVA: " + cotaTVA;
    }
}