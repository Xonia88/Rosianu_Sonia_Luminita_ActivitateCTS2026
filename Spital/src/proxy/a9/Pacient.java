package proxy.a9;

public class Pacient {

    private String nume;
    private boolean areAsigurare;

    public Pacient(String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }

    public boolean areAsigurare() {
        return areAsigurare;
    }

    public String getNume() {
        return nume;
    }
}