package composite.c8;

public class Medicament implements Componenta {

    private String nume;

    public Medicament(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Medicament: " + nume);
    }
}