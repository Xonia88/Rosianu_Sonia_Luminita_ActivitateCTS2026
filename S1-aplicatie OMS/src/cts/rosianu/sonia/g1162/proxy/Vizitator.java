package cts.rosianu.sonia.g1162.proxy;

public class Vizitator {
    private String nume;
    private boolean areScrisoareAcceptare;

    public Vizitator(String nume, boolean areScrisoareAcceptare) {
        this.nume = nume;
        this.areScrisoareAcceptare = areScrisoareAcceptare;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreScrisoareAcceptare() {
        return areScrisoareAcceptare;
    }
}
