package prototype.c4;

public class RetetaConcreta implements Reteta {

    private String denumire;
    private float cantitate;

    public RetetaConcreta(String denumire, float cantitate) {
        this.denumire = denumire;
        this.cantitate = cantitate;
    }

    @Override
    public Reteta copiaza() {
        return new RetetaConcreta(this.denumire, this.cantitate);
    }

    @Override
    public String toString() {
        return "Reteta: " + denumire + " | Cantitate: " + cantitate;
    }
}