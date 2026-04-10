package composite.a8;

public class Sectie implements Structura {

    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Sectie: " + nume);
    }
}