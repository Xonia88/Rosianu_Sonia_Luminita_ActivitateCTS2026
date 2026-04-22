package factory.c2;

public class FactoryDurere implements FactoryMedicament {

    @Override
    public Medicament creareMedicament() {
        return new MedicamentDurere();
    }
}