package factory.c2;

public class FactoryBody implements FactoryMedicament {

    @Override
    public Medicament creareMedicament() {
        return new MedicamentBody();
    }
}