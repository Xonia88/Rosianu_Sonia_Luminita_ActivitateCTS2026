package factory.a4;

public class RetetaConcreta implements Reteta {

    private String nume;
    private int cantitate;

    public RetetaConcreta(String nume, int cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    @Override
    public Reteta copiaza() {
        return new RetetaConcreta(this.nume, this.cantitate);
    }

    @Override
    public String toString() {
        return "Reteta: " + nume + " | Cantitate: " + cantitate;
    }
}