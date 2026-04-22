package factory.c2;

public class FactoryRaceala implements FactoryMedicament {

    @Override
    public Medicament creareMedicament() {
        return new MedicamentRaceala();
    }
}