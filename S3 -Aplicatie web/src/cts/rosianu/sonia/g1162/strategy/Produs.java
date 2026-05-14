package cts.rosianu.sonia.g1162.strategy;

public class Produs implements IProdus {

    private String denumire;
    private double pret;
    private int numarRecenzii;

    public Produs(String denumire, int numarRecenzii, double pret) {
        this.denumire = denumire;
        this.numarRecenzii = numarRecenzii;
        this.pret = pret;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public int getNumarRecenzii() {
        return numarRecenzii;
    }

    @Override
    public String toString() {

        return denumire + " pret " + pret + " numarRecenzii " + numarRecenzii;
    }
}
