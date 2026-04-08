package decorator.a7;

public class Main {
    public static void main(String[] args) {

        Rezultat rezultat = new RezultatConcret();

        System.out.println("Fara decorator:");
        rezultat.afiseazaRezultat();

        System.out.println("---------------");

        Rezultat rezultatDecorat = new DecoratorOnline(rezultat);

        System.out.println("Cu decorator:");
        rezultatDecorat.afiseazaRezultat();
    }
}