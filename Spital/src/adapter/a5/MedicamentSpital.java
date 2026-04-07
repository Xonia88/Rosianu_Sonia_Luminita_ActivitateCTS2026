package adapter.a5;

public class MedicamentSpital {

    public void prezintaReteta() {
        System.out.println("Se prezinta reteta");
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicament achizitionat din spital");
    }
}