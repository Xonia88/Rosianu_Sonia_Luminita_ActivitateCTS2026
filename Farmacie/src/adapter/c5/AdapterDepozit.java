package adapter.c5;

public class AdapterDepozit extends SistemVanzare {

    private SistemDepozit depozit;

    public AdapterDepozit(SistemDepozit depozit) {
        this.depozit = depozit;
    }

    @Override
    public boolean verificareDisponibilitate(int cantitate) {
        return depozit.verificaStocPentruMedicament(1, cantitate);
    }
}