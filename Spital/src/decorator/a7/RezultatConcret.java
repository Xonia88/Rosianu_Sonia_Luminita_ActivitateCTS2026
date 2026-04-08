package decorator.a7;

public class RezultatConcret implements Rezultat {

    @Override
    public void afiseazaRezultat() {
        System.out.println("Rezultatul este afisat pe hartie");
    }
}