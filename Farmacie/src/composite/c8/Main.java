package composite.c8;

public class Main {
    public static void main(String[] args) {

        Medicament m1 = new Medicament("Paracetamol");
        Medicament m2 = new Medicament("Nurofen");
        Medicament m3 = new Medicament("Vitamina C");

        Sectiune raceala = new Sectiune("Raceala");
        raceala.adauga(m1);

        Sectiune durere = new Sectiune("Durere");
        durere.adauga(m2);

        Sectiune vitamine = new Sectiune("Vitamine");
        vitamine.adauga(m3);

        Sectiune farmacie = new Sectiune("Farmacie");
        farmacie.adauga(raceala);
        farmacie.adauga(durere);
        farmacie.adauga(vitamine);

        farmacie.descriere();
    }
}