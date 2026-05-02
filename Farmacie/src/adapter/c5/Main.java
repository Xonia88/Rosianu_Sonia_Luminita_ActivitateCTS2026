package adapter.c5;

public class Main {
    public static void main(String[] args) {

        SistemVanzare sistemVechi = new SistemVanzare();
        sistemVechi.setareMedicament(1);
        sistemVechi.verificareDisponibilitate(5);

        System.out.println("---------------");

        SistemDepozit depozit = new SistemDepozit();
        SistemVanzare adapter = new AdapterDepozit(depozit);

        adapter.setareMedicament(1);
        adapter.verificareDisponibilitate(5);
    }
}