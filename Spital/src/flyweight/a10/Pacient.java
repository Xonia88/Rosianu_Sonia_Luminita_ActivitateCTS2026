package flyweight.a10;

public class Pacient {

    private String nume;
    private int varsta;

    public Pacient(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public void afisare() {
        System.out.println("Pacient: " + nume + " | Varsta: " + varsta);
    }
}