package adapter.c5;

public class SistemVanzare {

    private int idMedicament;

    public void setareMedicament(int id) {
        this.idMedicament = id;
    }

    public boolean verificareDisponibilitate(int cantitate) {
        System.out.println("Verificare veche pentru medicament " + idMedicament);
        return true;
    }
}