package adapter.a5;

public class AdapterMedicament extends MedicamentSpital {

    private MedicamentFarmacie medicamentFarmacie;

    public AdapterMedicament(MedicamentFarmacie medicamentFarmacie) {
        this.medicamentFarmacie = medicamentFarmacie;
    }

    @Override
    public void achizitioneazaMedicament() {
        System.out.println("Adaptare pentru farmacie...");
        medicamentFarmacie.cumparaMedicament();
    }
}