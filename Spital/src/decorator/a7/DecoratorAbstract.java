package decorator.a7;

public abstract class DecoratorAbstract implements Rezultat {

    protected Rezultat rezultat;

    public DecoratorAbstract(Rezultat rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void afiseazaRezultat() {
        rezultat.afiseazaRezultat();
    }
}