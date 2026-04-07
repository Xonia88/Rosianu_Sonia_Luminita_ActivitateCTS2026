package adapter.a5;

public class Main {
    public static void main(String[] args) {

        MedicamentSpital medicamentSpital = new MedicamentSpital();
        medicamentSpital.achizitioneazaMedicament();

        System.out.println("---------------");

        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie();
        MedicamentSpital adapter = new AdapterMedicament(medicamentFarmacie);

        adapter.achizitioneazaMedicament();
    }
}