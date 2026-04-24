package builder.c3;

public class FacturaBuilder {

    private String numeClient;
    private int numarPungi;
    private boolean plataCuCard;
    private boolean cardFidelitate;
    private float cotaTVA;

    public FacturaBuilder(String numeClient) {
        this.numeClient = numeClient;
        this.numarPungi = 0;
        this.plataCuCard = false;
        this.cardFidelitate = false;
        this.cotaTVA = 0;
    }

    public void setNumarPungi(int numarPungi) {
        this.numarPungi = numarPungi;
    }

    public void setPlataCuCard(boolean plataCuCard) {
        this.plataCuCard = plataCuCard;
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public void setCotaTVA(float cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    public Factura build() {
        return new Factura(numeClient, numarPungi,
                plataCuCard, cardFidelitate, cotaTVA);
    }
}