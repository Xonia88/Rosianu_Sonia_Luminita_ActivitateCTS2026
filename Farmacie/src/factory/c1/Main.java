package factory.c1;

public class Main {
    public static void main(String[] args) {

        FactoryMedicament factory = new FactoryMedicament();

        Medicament m1 = factory.creareMedicament(TipMedicament.RACEALA);
        Medicament m2 = factory.creareMedicament(TipMedicament.DURERE);
        Medicament m3 = factory.creareMedicament(TipMedicament.BODY);

        m1.descriere();
        m2.descriere();
        m3.descriere();
    }
}