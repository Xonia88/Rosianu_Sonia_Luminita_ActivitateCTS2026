package factory.c1;

public class FactoryMedicament {

    public Medicament creareMedicament(TipMedicament tip) {

        switch (tip) {
            case RACEALA:
                return new MedicamentRaceala();
            case DURERE:
                return new MedicamentDurere();
            case BODY:
                return new MedicamentBody();
            default:
                return null;
        }
    }
}