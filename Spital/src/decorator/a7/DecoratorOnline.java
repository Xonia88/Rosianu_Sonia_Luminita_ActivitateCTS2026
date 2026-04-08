package decorator.a7;

public class DecoratorOnline extends DecoratorAbstract {

    public DecoratorOnline(Rezultat rezultat) {
        super(rezultat);
    }

    @Override
    public void afiseazaRezultat() {
        super.afiseazaRezultat();
        afisareOnline();
    }

    private void afisareOnline() {
        System.out.println("Rezultatul este disponibil online");
    }
}