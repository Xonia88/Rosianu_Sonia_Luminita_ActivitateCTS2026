package flyweight.c10;

public class Client {

    private String nume;
    private String nrAsigurare;

    public Client(String nume, String nrAsigurare) {
        this.nume = nume;
        this.nrAsigurare = nrAsigurare;
    }

    public void afisareClient() {
        System.out.println("Client: " + nume + " | Asigurare: " + nrAsigurare);
    }
}