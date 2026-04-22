package factory.c2;

public class Main {
    public static void main(String[] args) {

        FactoryMedicament factory1 = new FactoryRaceala();
        FactoryMedicament factory2 = new FactoryDurere();
        FactoryMedicament factory3 = new FactoryBody();

        Medicament m1 = factory1.creareMedicament();
        Medicament m2 = factory2.creareMedicament();
        Medicament m3 = factory3.creareMedicament();

        m1.descriere();
        m2.descriere();
        m3.descriere();
    }
}