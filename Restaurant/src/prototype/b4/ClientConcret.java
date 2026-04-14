package prototype.b4;

public class ClientConcret implements Client {

    private String nume;
    private String telefon;

    public ClientConcret(String nume, String telefon) {
        this.nume = nume;
        this.telefon = telefon;
    }

    @Override
    public Client copiaza() {
        return new ClientConcret(this.nume, this.telefon);
    }

    @Override
    public String toString() {
        return "Client: " + nume + " | Telefon: " + telefon;
    }
}