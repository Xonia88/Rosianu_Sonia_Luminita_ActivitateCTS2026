package proxy.c9;

public class Farmacie implements Vanzare {

    @Override
    public void vinde(boolean areReteta) {
        System.out.println("Medicamentele au fost vandute.");
    }
}